package org.newone;

import java.sql.*;

public class JdbcConnectivity {
    public static void main(String[] args) {
        System.out.println("My sql JDBC connection");

        String SQL_SELECT ="select * from student1";
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/practice", "root","Vijju@2807");
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)){

            ResultSet resultSet=preparedStatement.executeQuery();

            while(resultSet.next()){
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");


                System.out.println("id:"+id+", name:"+name);
            }



        }catch(SQLException e){
            System.err.format("SQL State:%s\n%s",e.getSQLState(),e.getMessage());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
