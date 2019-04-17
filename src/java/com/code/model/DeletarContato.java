package com.code.model;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeletarContato implements Logica {
    boolean result = false;
    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

        if (req.getMethod().equals("POST")) {
            ContatoDao dao = new ContatoDao();
            
            String str = req.getParameter("str");

            // Recuperar os contatos usando o Dao
            Contato c = new Contato();
            c = dao.getContatoFromNome(str);
            System.out.println(c.toString());
            if (c.getId() != null){
                result = dao.delete(c);
            }else{
                req.setAttribute("noUser", true);
            }
            // Seta  atributo na requisição para mostrar no view
            req.setAttribute("deletado", result);
        }

        // retorna o view que deve ser chamando
        return ("deletarContato.jsp");
    }
}
