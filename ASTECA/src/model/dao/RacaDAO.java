package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Especie;
import model.bean.Raca;

/**
 *
 * @author Caio Cardosdo,Carlos Henrrique,Ian Carlos, Maikon Alexandre,Raul
 * Romualdo e Vitor Ricardo.
 */
public class RacaDAO {

    public List<Raca> readr() {
        Connection com = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Raca> racas = new ArrayList<>();
        try {
            stmt = com.prepareStatement("SELECT * FROM raca");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Raca es = new Raca();
                es.setCodRaca(rs.getInt("codRaca"));
                es.setRaca(rs.getString("racaAnimal"));
                es.setEspecie(rs.getString("codEspecie"));
                racas.add(es);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO" + ex);
        } finally {
            ConnectionFactory.CloseConnection(com, stmt, rs);
        }
        return racas;
    }

    public void create(Raca r) {
        Connection com = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;//stm = null;
        try {
            stmt = com.prepareStatement("INSERT INTO raca (racaAnimal) VALUES(?)");
            stmt.setString(1, r.getRaca());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "SALVO COM SUCESSO");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR" + ex);
        } finally {
            ConnectionFactory.CloseConnection(com, stmt);
        }
    }
}
