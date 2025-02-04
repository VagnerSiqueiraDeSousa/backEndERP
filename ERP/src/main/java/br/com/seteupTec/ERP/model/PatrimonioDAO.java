package br.com.seteupTec.ERP.model;

import br.com.seteupTec.ERP.model.Patrimonio;
import br.com.seteupTec.ERP.repository.DatabaseConnection;

import java.sql.*;

public class PatrimonioDAO {
    public void inserirPatrimonio(Patrimonio patrimonio) {
        String sql = "INSERT INTO patrimonio (cidade_matriz, bairro_filial, numero_inventario, placa_patrimonio, centro_custo, conta_contabil, tipo_patrimonio) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, patrimonio.getCidadeMatriz());
            stmt.setString(2, patrimonio.getBairroFilial());
            stmt.setInt(3, patrimonio.getNumeroInventario());
            stmt.setString(4, patrimonio.getPlacaPatrimonio());
            stmt.setString(5, patrimonio.getCentroCusto());
            stmt.setString(6, patrimonio.getContaContabil());
            stmt.setString(7, patrimonio.getTipoPatrimonio());

            stmt.executeUpdate();
            System.out.println("Patrimônio inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void consultarPatrimonioPorId(int id) {
        String sql = "SELECT * FROM patrimonio WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id"));
                    System.out.println("Cidade/Matriz: " + rs.getString("cidade_matriz"));
                    System.out.println("Bairro/Filial: " + rs.getString("bairro_filial"));
                    System.out.println("Número do Inventário: " + rs.getInt("numero_inventario"));
                    System.out.println("Placa de Patrimônio: " + rs.getString("placa_patrimonio"));
                    System.out.println("Centro de Custo: " + rs.getString("centro_custo"));
                    System.out.println("Conta Contábil: " + rs.getString("conta_contabil"));
                    System.out.println("Tipo de Patrimônio: " + rs.getString("tipo_patrimonio"));
                } else {
                    System.out.println("Patrimônio com ID " + id + " não encontrado.");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}


