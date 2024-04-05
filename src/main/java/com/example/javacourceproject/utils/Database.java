package com.example.javacourceproject.utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    public static Connection connectToDb() throws ClassNotFoundException {
        Connection conn = null;
        String DB_URL = "jdbc:mysql://localhost:3306/javaproject";
        String USER = "root";
        String PASS = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

    public List<String> getProducts(){
        List<String> resultList = new ArrayList<>();
        try {
            Connection connection = connectToDb();
            String sql = "SELECT * FROM product";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            String result = "";
            while (resultSet.next()){
                result = resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString("description");
                resultList.add(result);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return resultList;
    }

    public void addProduct(String title, String description) {
        try (Connection connection = connectToDb()) {
            String sql = "INSERT INTO product (title, description) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, title);
                preparedStatement.setString(2, description);
                preparedStatement.executeUpdate();
                System.out.println("Product added successfully!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        try {

            Connection connection = Database.connectToDb();

            if (connection != null) {
                System.out.println("Connected to database successfully!");
                // Example usage: Adding a product
                Database database = new Database();
                database.addProduct("Iphone", "aaaaa");

                connection.close();
            } else {
                System.out.println("Failed to connect to the database.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


