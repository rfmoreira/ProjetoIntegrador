/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ondecomi.model.Avaliador;
import util.DBUtil;

/**
 *
 * @author Luan Amor
 */
public class AvaliadorDao {
    
    private Connection con;
    
    public AvaliadorDao(){
        con = DBUtil.getConnection();
    }
    
    public void addAvaliador(Avaliador avaliador){
        try {
            PreparedStatement pstm = con.prepareStatement("insert into avaliador values(default, ?)");
            pstm.setString(1, avaliador.getNome());
            pstm.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void deleteAvaliador(int idAvaliador) throws SQLException{
        try {
            
            PreparedStatement pstm = con.prepareStatement("delete from avaliador where id = ?");
            pstm.setInt(1, idAvaliador);
            pstm.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public void updateAvaliador(Avaliador avaliador) throws SQLException{
        try {
            
            PreparedStatement pstm = con.prepareStatement("update avaliador set nome = ? where id = ?");
            pstm.setString(1, avaliador.getNome());
            pstm.setInt(2, avaliador.getIdAvaliador());
            pstm.executeLargeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        con.close();
    }

    public List<Avaliador> queryAllAvaliador() throws SQLException{
        List<Avaliador> avaliadores = new ArrayList();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select * from avaliador");
            while (rs.next()){
                Avaliador ava = new Avaliador();
                ava.setIdAvaliador(rs.getInt("id"));
                ava.setNome(rs.getString("nome"));
                avaliadores.add(ava);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return avaliadores;
        
    }

    public Avaliador queryAvaliadorById(int id){
        Avaliador ava = new Avaliador();
        try {
            PreparedStatement pstm = con.prepareStatement("select nome from avaliador where id = ?");
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                ava.setIdAvaliador(rs.getInt("id"));
                ava.setNome(rs.getString("nome"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ava;
    }
}
