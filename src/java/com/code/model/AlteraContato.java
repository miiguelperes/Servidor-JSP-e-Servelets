package com.code.model;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AlteraContato implements Logica {
    
    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

        if (req.getMethod().equals("POST")) {       
            String str = req.getParameter("str");
          // Recuperar os contatos usando o Dao
            Contato contatoAux = new ContatoDao().getContatoFromNome(str);
            System.out.println(contatoAux.toString());
            Contato.setContatoSave(contatoAux);
            // Seta  atributo na requisição para mostrar no view
            if(contatoAux.getId()!=null){
                req.setAttribute("contatoAux", contatoAux);
            }else{
                req.setAttribute("noUser", true);
            }                       
        }

        // retorna o view que deve ser chamando
        return ("alteraContato.jsp");
    }
}
