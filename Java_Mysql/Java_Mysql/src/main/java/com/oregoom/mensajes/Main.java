
package com.oregoom.mensajes;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
       Connection conectar = DriverManager.getConnection(
               "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC",
               "root",
               "53v1lch37"
               
       );
       
        System.out.println("CONEXION EXITOSA");
        
        
        }
    }
    

