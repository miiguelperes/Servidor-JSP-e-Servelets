package com.code.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDao implements Dao<Contato> {

    private final Connection conn;
    private ConnectionFactory db = new ConnectionFactory();
    
    private ResultSet rs = null;
    private PreparedStatement ps = null;
    
    private final String ALL = "SELECT * FROM contato;";
    private final String CARACTER = "SELECT * FROM contato WHERE nome LIKE ?";
    private final String DELETE = "DELETE FROM contato WHERE id = ?";

    public ContatoDao() throws SQLException {
        this.conn = new ConnectionFactory().getConnection();
    }

    @Override
    public boolean insert(Contato c) {
        try {
            String sql = "INSERT INTO contato SET nome=?, telefone=?,email=?,nascimento=?, endereco=?";
             System.out.println(c.toString());
            
            db.getConnection();
            ps = db.initStatement(sql);
            ps.setString(1, c.getNome());
            ps.setString(2, c.getTelefone());
            ps.setString(3, c.getEmail());
            ps.setString(4, c.getNascimento());
            ps.setString(5, c.getEndereco());

            if (db.executeUpdate() == 1) {
                System.out.println("Cadastrado com sucesso.");
            } else {

                System.out.println("Erro.");
            }
            db.close();
            return true;

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        
    }

    @Override
    public boolean delete(Contato value) throws SQLException {
        	try{
			PreparedStatement stmt = conn.prepareStatement(DELETE);
                        stmt.setString(1, Integer.toString(value.getId()));
                        stmt.executeUpdate();
                       
                        return true;
		}
		catch(SQLException e){
			System.out.println("Error in deleteUser() "+e.getMessage());
                        System.out.println("nao deletou o "+value.getId());
                        
                        return false;
		}
    }
    
    public Contato getContatoFromNome(String nome) throws SQLException{
    try{
        Contato c = new Contato();      
        PreparedStatement stmt = conn.prepareStatement(CARACTER);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Contato contato = new Contato();
            contato.setId(Integer.parseInt(rs.getString("id")));
            contato.setEmail(rs.getString("email"));
            contato.setEndereco(rs.getString("endereco"));
            contato.setId(Integer.parseInt(rs.getString("id")));
            contato.setNascimento(rs.getString("nascimento"));
            contato.setNome(rs.getString("nome"));
            contato.setTelefone(rs.getString("telefone"));
            c = contato;
        }
        return c;
        }
	catch(SQLException e){
		System.out.println("Error in deleteUser() "+e.getMessage());
                return null;
	}
        
    }
    
    public List<Contato> selectLike(String str) throws SQLException {
try{
        ArrayList<Contato> contatos = new ArrayList<>();
        
        PreparedStatement stmt = conn.prepareStatement(CARACTER);
        stmt.setString(1, '%'+str+'%');
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Contato contato = new Contato();
            contato.setId(Integer.parseInt(rs.getString("id")));
            contato.setEmail(rs.getString("email"));
            contato.setEndereco(rs.getString("endereco"));
            contato.setId(Integer.parseInt(rs.getString("id")));
            contato.setNascimento(rs.getString("nascimento"));
            contato.setNome(rs.getString("nome"));
            contato.setTelefone(rs.getString("telefone"));
            contatos.add(contato);
        }
        stmt.close();
        conn.close();
        return contatos;
         }catch(Exception E){
             System.out.println("objeto null "+E.getMessage());
             return null;
        }
    }
    
    @Override
    public boolean update(Contato value) throws SQLException {
        try{
			String sql = "UPDATE contato SET nome=?, telefone=?,email=?,nascimento=?, endereco=?"
					+ "WHERE id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, value.getNome());
			ps.setString(2, value.getTelefone());
                        ps.setString(3, value.getEmail());
			ps.setString(4, value.getNascimento());
			ps.setString(5, value.getEndereco());
			ps.setInt(6, value.getId());
			ps.executeUpdate();
                        return true;
		}
		catch(SQLException e){
			System.out.println("Error in updateUser() "+e.getMessage());
                        return false;
		}
    }
    
    @Override
    public Contato select(Contato value) throws SQLException {
        return null;
    }

    @Override
    public List<Contato> selectAll() throws SQLException {

        ArrayList<Contato> contatos = new ArrayList<>();
        
        PreparedStatement stmt = conn.prepareStatement(ALL);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Contato contato = new Contato();
            contato.setEmail(rs.getString("email"));
            contato.setEndereco(rs.getString("endereco"));
            contato.setId(Integer.parseInt(rs.getString("id")));
            contato.setNascimento(rs.getString("nascimento"));
            contato.setNome(rs.getString("nome"));
            contato.setTelefone(rs.getString("telefone"));
            contatos.add(contato);
        }
        stmt.close();
        conn.close();
        return contatos;
    }

    public List<Contato> bkpselectLike(String str) throws SQLException {
        ArrayList<Contato> contatos = new ArrayList<>();
      
        try{
        System.out.println("str buscada:"+str);
        ps = conn.prepareStatement("SELECT * FROM contato WHERE nome LIKE ?");
        ps.setString(1, '%'+str+'%');
        rs = ps.executeQuery();
        db.getConnection();
        System.out.println("nome vindo do banco "+rs.getString(2)); 
        while (rs.next()) {
                Contato contato = new Contato();
                contato.setEmail(rs.getString("email"));
                contato.setEndereco(rs.getString("endereco"));
                contato.setId(Integer.parseInt(rs.getString("id")));
                contato.setNascimento(rs.getString("nascimento"));
                contato.setNome(rs.getString("nome"));
                contato.setTelefone(rs.getString("telefone"));
                contatos.add(contato);
            }
            }catch(Exception E){
             System.out.println("objeto null "+E.getMessage());
            }
        ps.close();
        conn.close();
        return contatos;
    }
    
    public List<Contato> buscaUsuario(String str) throws SQLException {

        ArrayList<Contato> contatos = new ArrayList<>();

        PreparedStatement stmt = conn.prepareStatement(ALL);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Contato contato = new Contato();
            contato.setEmail(rs.getString("email"));
            contato.setEndereco(rs.getString("endereco"));
            contato.setId(Integer.parseInt(rs.getString("id")));
            contato.setNascimento(rs.getString("nascimento"));
            contato.setNome(rs.getString("nome"));
            contato.setTelefone(rs.getString("telefone"));
            contatos.add(contato);
        }
        stmt.close();
        conn.close();
        return contatos;
    }

    public static void main(String[] args) throws SQLException {
        ContatoDao cd = new ContatoDao();
        System.out.println(cd.buscaUsuario("bru"));
    }
}
