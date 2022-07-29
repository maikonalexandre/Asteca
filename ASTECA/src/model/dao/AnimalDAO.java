package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Caio Cardosdo,Carlos Henrrique,Ian Carlos, Maikon Alexandre,Raul
 * Romualdo e Vitor Ricardo.
 */
public class AnimalDAO {

    public void creat() {
        Connection com = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = com.prepareStatement("");

        } catch (SQLException ex) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
