package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Medico;

/**
 *
 * @author Caio Cardosdo,Carlos Henrrique,Ian Carlos, Maikon Alexandre,Raul
 * Romualdo e Vitor Ricardo.
 */
public class MedicoDAO {

    public void create(Medico m) {
        Connection com = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = com.prepareStatement("INSERT INTO medico (medico)VALUES(?)");
            stmt.setString(1, m.getNomeMed());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "SALVO COM SUCESSO");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR" + ex);
        } finally {
            ConnectionFactory.CloseConnection(com, stmt);
        }
    }

    public List<Medico> readm() {
        Connection com = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Medico> medicos = new ArrayList<>();
        try {
            stmt = com.prepareStatement("SELECT * FROM medico");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Medico ms = new Medico();
                ms.setCrmv(rs.getInt("Crmv"));
                ms.setNomeMed(rs.getString("nomeMed"));
                ms.setEspecializacao(rs.getString("especializacao"));
                medicos.add(ms);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO" + ex);
        } finally {
            ConnectionFactory.CloseConnection(com, stmt, rs);
        }

        return medicos;

    }

}
