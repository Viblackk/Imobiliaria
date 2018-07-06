/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import jdk.internal.instrumentation.Logger;

/**
 *
 * @author Genocide
 */
public class Conexao {
    
    private Connection conn;
    
    private void conectar() throws SQLException{
        System.out.println("Conectando...");
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ourobens", "admin", "pedepano123");
            System.out.println("Conectado");
        } catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada, adicione o driver nas bibliotecas");
            java.util.logging.Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        } catch(SQLException e){
            System.out.println(e);
        }
    }
    
}
