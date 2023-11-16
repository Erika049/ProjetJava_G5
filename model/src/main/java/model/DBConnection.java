package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The DBConnection class manages the connection to the database and handles data retrieval and saving to a file.
 * It includes methods for opening and closing the database connection, loading map data from the database, and saving it to a file.
 * The class uses JDBC to interact with a MySQL database.
 *
 * @author GROUPE 5
 */
public class DBConnection {
    /** The constant password for the database connection. */
    private static final String PASSWORD = "Steve@2005";

    /** The constant login for the database connection. */
    private static final String LOGIN = "root";

    /** The constant URL for the database connection. */
    private static final String URL = "jdbc:mysql://localhost/jpublankproject";

    /** The database connection. */
    private static Connection connection;

    /** The database statement. */
    private Statement statement;

    /** The filename for saving map data to a file. */
    private String filename = "niveau.txt";

    /**
     * Instantiates a new DBConnection.
     * Initializes the database connection and statement.
     */
    public DBConnection() {
        this.connection = null;
        this.statement = null;
    }

    /**
     * Opens the database connection.
     *
     * @return true if the connection is successfully opened, false otherwise.
     */
    public boolean open() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(DBConnection.URL, DBConnection.LOGIN, DBConnection.PASSWORD);
            this.statement = this.connection.createStatement();
        } catch (final ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * Closes the database connection.
     */
    public static void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Loads map data from the database by executing a stored procedure.
     *
     * @param name1 the name of the map to load.
     * @return a List of strings representing the map data.
     */
    public List<String> loadBD(final String name1) {
        try {
            final String sql = "{call GetMapByName(?)}";
            final CallableStatement call = connection.prepareCall(sql);
            call.setString(1, name1);
            call.execute();
            final ResultSet resultSet = call.getResultSet();
            List<String> mapLines = new ArrayList<>();

            while (resultSet.next()) {
                String line = resultSet.getString("line");
                mapLines.add(line);
            }
            return mapLines;
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Saves map data to a file.
     *
     * @param mapLines the list of strings representing the map data.
     * @param fileName the name of the file to save the map data.
     */
    public void saveToFile(List<String> mapLines, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false))) {
            for (String line : mapLines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
