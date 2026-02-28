package com.dk.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDao {
    public void printAllEmployee() throws SQLException {
        try (Connection connection = DBConnection.getConnection();){

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employee"); // default result set is zero
            while (resultSet.next()) {
                int empid = resultSet.getInt(1);
                String stringEmpid = resultSet.getString(1);
                int empid2 = resultSet.getInt("employee_id");
                String firstName = resultSet.getString(2);
                String lastName = resultSet.getString("last_name");
                System.out.println(empid + "\t" + firstName + " " + lastName);
            }

        }finally
        {
            System.out.println("Done");
        }
    }
}
