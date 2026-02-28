package com.dk.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.sql.Connection;

class DBConnectionTest {

    @Test
    void testConnectionIsNotNull() {
        try (Connection connection = DBConnection.getConnection()) {

            assertNotNull(connection, "Connection should not be null");

        } catch (Exception e) {
            fail("Connection failed with exception: " + e.getMessage());
        }
    }

    @Test
    void testPrintAllEmployee()
    {
        EmployeeDao dao = new EmployeeDao();
        try {
            dao.printAllEmployee();
        } catch (Exception e) {
            System.out.println(e);
            fail("exception" + e);
        }
    }
}
