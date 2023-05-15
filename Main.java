package org.example;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            String url = "jdbc:mysql://localhost:3306/sys";
            String user = "root";
            String password = "admin";

            conn = DriverManager.getConnection(url, user, password);

            String numero = getInput("Introduce el numero del cliente: ");
            String numCus = getInput("Introduce el nombre del cliente: ");
            String email = getInput("Introduce el email del cliente: ");
            String tipo = getInput("Introduce el tipo de póliza: ");
            String suma = getInput("Introduce la suma asegurada del cliente: ");
            String fecha = getInput("Introduce la fecha de inicio de la póliza: ");

            String sql = "INSERT INTO clientes (numero_cliente, nombre_cliente, email, tipo_poliza, suma_asegurada, fecha_inicio_poliza) VALUES (?, ?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, numero);
            stmt.setString(2, numCus);
            stmt.setString(3, email);
            stmt.setString(4, tipo);
            stmt.setString(5, suma);
            stmt.setString(6, fecha);

            stmt.executeUpdate();

            System.out.println("Los parámetros se han insertado correctamente en la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static String getInput(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
