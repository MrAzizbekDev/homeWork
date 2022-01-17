package utils;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {
    public static final String dbUser = "postgres"; //user
    public static final String dbPassword = "2410"; //parol
    static String url; //murojaat yo'li
    static String host = "localhost"; //kun.uz //192.168.22.11

    static String dbName = "wareouse";
    static String port = "5432"; //postgres  //oracle //345 //mysql// 123


    public static Connection ulanish() {
        Connection connection = null;
        url = "jdbc:postgresql://" + host + ":" + port + "/" + dbName;

        try {
            connection = DriverManager.getConnection(url, dbUser, dbPassword);
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
