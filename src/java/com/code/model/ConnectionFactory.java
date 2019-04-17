package com.code.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
    
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    public Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        conn = DriverManager.getConnection("jdbc:mysql://localhost/contatos", "root", "");
        return conn ;
    }

    public static void main(String[] args) throws SQLException {
        try (Connection conn = new ConnectionFactory().getConnection()) {
            System.out.println("Conexão aberta!");
        }
    }
        
    public void close() throws SQLException{
        
        if(conn!=null && !conn.isClosed()){
            conn.close();
            conn = null;
        }
    }
    public PreparedStatement initStatement(String sql) throws SQLException{
        
        ps =conn.prepareStatement(sql);
        
        return ps;
    }
        
    public ResultSet executeQuery() throws SQLException{
        
        rs = ps.executeQuery();
        
        return rs;
    }
        
    public int executeUpdate() throws SQLException{
        
        int rowsAffected = ps.executeUpdate();
        
        return rowsAffected;
        
    }
}
   

