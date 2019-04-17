package com.code.model;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class selectLike implements Logica {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

        if (req.getMethod().equals("POST")) {
            String str = req.getParameter("str");

            // Recuperar os contatos usando o Dao
            List<Contato> contatos = new ContatoDao().selectLike(str);

            // Seta  atributo na requisição para mostrar no view
            if(contatos != null){
                req.setAttribute("contatos", contatos);
            }else{
                req.setAttribute("noUser", true);
            }
        }

        // retorna o view que deve ser chamando
        return ("selectLike.jsp");
    }
}
