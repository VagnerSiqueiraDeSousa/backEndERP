package br.com.seteupTec.ERP.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/banco_cliente_contrato"; // Substitua pelo nome do seu banco
    private static final String USER = "root"; // Substitua pelo seu usuário
    private static final String PASSWORD = "Britania!@#3012"; // Substitua pela sua senha

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

