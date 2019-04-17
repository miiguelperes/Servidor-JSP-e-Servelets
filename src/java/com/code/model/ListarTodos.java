package com.code.model;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListarTodos implements Logica {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        
        // Recuperar os contatos usando o Dao
        List<Contato> contatos = new ContatoDao().selectAll();
        
        // Seta  atributo na requisição para mostrar no view
        req.setAttribute("contatos", contatos);
        
        // retorna o view que deve ser chamando
        return ("listarTodos.jsp");
    } 
}
