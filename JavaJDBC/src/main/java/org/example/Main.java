package org.example;

import java.sql.*;

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
        String password = "";


        //load the driver
        Class.forName("org.postgresql.Driver");

        //creating connection object to connect with database
        Connection conn = DriverManager.getConnection(url,username,password);

        System.out.println(conn);


//        create statement
        String QUERY = "select fname from person where personid = 1";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);
        rs.next(); //  it is go first row.it is mandatory

//        process and result
        User user = new User();

        String firstName = rs.getString("fname");
        user.setFirstname(firstName);

        System.out.println(firstName);

        System.out.println(rs.next());



    }
}
