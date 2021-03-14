package com.company.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

    private static DataBase database;

    private static DataBase getDatabase(){
        if(database == null){
            database = new DataBase();
        }
        return database;
    }
    private DataBase(){

    }

    private Connection getConnection() throws SQLException, ClassNotFoundException {
        String user = "postgres";
        String password = "12345";
        String connectionUrl = "jdbc:postgresql://localhost:5432/students";
        Class.forName("org.postgresql.Driver");
        try(Connection con = DriverManager.getConnection(connectionUrl,user, password)) {
            return con;
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }

}
