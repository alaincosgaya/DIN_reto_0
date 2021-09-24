/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exception.*;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 *
 * @author Idoia
 */
public class ModelBdImplementation implements ModelInterface {

    private Connection con = null;
    private Properties prope;
    private PreparedStatement stmt = null;

    private ResourceBundle configFile;
    private String driverBD;
    private String urlDB;
    private String userBD;
    private String passwordBD;
    
    private final String consultMessage = "SELECT data FROM message";
    
    public ModelBdImplementation() {
        this.configFile = ResourceBundle.getBundle("model.config");
        this.driverBD = this.configFile.getString("Driver");
        this.urlDB = this.configFile.getString("Conn");
        this.userBD = this.configFile.getString("DBUser");
        this.passwordBD = this.configFile.getString("DBPass");
    }
    
    public void conectar() throws DaoException {
        try {
            Class.forName(this.driverBD);
            con = DriverManager.getConnection(this.urlDB, this.userBD, this.passwordBD);
        } catch (SQLException e) {
            throw new DaoException("Error en la SQL al conectar" + e.getMessage());
        } catch (ClassNotFoundException e1) {
            throw new DaoException("No se ha encontrado el driver para la conexion" + e1.getMessage());
        }
    }

    public void desconectar() throws DaoException {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            throw new DaoException("Error de SQL " + e.getMessage());
        }
    }

    @Override
    public String getGreeting() throws ConnectException, DaoException, ReadException {
        String text="";
        
        ResultSet rs = null;
        try {
            this.conectar();
        } catch (DaoException e1) {
            throw new ConnectException(e1.getMessage());
        }
        try {
            stmt = con.prepareStatement(consultMessage);
            
            rs = stmt.executeQuery();
            while(rs.next()){
            text = rs.getString("message.data");
            }

        } catch (Exception e) {
            throw new ReadException("Error de Lectura");
        }
        this.desconectar();
        return text;
    }


}
