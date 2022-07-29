package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Especie;

/**
 *
 * @author Caio Cardosdo,Carlos Henrrique,Ian Carlos, Maikon Alexandre,Raul
 * Romualdo e Vitor Ricardo.
 */
public class EspecieDAO {

    public void create(Especie e) {
        Connection com = ConnectionFactory.getConnection();
        PreparedStatement stmt = null, stm = null;
        try {
            stmt = com.prepareStatement("INSERT INTO especie (nomeEspecie) VALUES(?)");
            stmt.setString(1, e.getEspecie());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "SALVO COM SUCESSO");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR" + ex);
        } finally {
            ConnectionFactory.CloseConnection(com, stmt);
        }
    }

    public List<Especie> read() {
        Connection com = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Especie> especies = new ArrayList<>();
        try {
            stmt = com.prepareStatement("SELECT * FROM especie");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Especie es = new Especie();
                es.setCodEspecie(rs.getInt("codEspecie"));
                es.setEspecie(rs.getString("nomeEspecie"));
                especies.add(es);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO" + ex);
        } finally {
            ConnectionFactory.CloseConnection(com, stmt, rs);
        }
        return especies;
    }

    public List<Especie> readEspecie(String esp) {
        Connection com = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Especie> Especies = new ArrayList<>();
        try {
            stmt = com.prepareStatement("SELECT * FROM especie WHERE nomeEspecie LIKE ?");
            stmt.setString(1, "%" + esp + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Especie especie = new Especie();
                especie.setCodEspecie(rs.getInt("codEspecie"));
                especie.setEspecie(rs.getString("nomeEspecie"));
                Especies.add(especie);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EspecieDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.CloseConnection(com, stmt, rs);
        }
        return Especies;
    }

    public void update(Especie e) {
        Connection com = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;   
        int affectedRows;
        try {
            stmt = com.prepareStatement("UPDATE especie SET nomeEspecie = ? WHERE codEspecie =" + e.getCodEspecie());             //rs.getString("codEspecie"));
            stmt.setString(1, e.getEspecie());
            affectedRows = stmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Registro nao alterado!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.CloseConnection(com, stmt);
        }
    }

    public void delete(Especie e) {
        Connection com = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = com.prepareStatement("DELETE FROM especie WHERE nomeEspecie = ?");
            stmt.setString(1, e.getEspecie());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.CloseConnection(com, stmt);
        }
    }
}
