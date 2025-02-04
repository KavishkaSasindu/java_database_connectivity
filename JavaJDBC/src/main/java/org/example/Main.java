package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        /*
            import the connector package (using mvn repository)
            load the driver and register
            create connection
            create statement
            execute statement
            process and result
            close the connection
        * */

        String url = "jdbc:postgresql://localhost:5432/users";
        String username = "postgres";
        String password = "000000";


        //load the driver
        Class.forName("org.postgresql.Driver");

        //creating connection object to connect with database
        Connection conn = DriverManager.getConnection(url,username,password);

        System.out.println(conn);

    }
}
