package com.code.model;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AlteraContatoAux implements Logica {
    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        Contato contato = Contato.getContatoSave();
        if (req.getMethod().equals("POST")) {
            
            String str_nome = req.getParameter("str_nome");
            if(str_nome.equals("")) str_nome = contato.getNome();
            
            String str_email = req.getParameter("str_email");
            if(str_email.equals("")) str_email = contato.getEmail();
            
            String str_tel = req.getParameter("str_tel");
            if(str_tel.equals("")) str_tel = contato.getTelefone();
            
            String str_nasc = req.getParameter("str_nasc");
            if(str_nasc .equals("")) str_nasc  = contato.getNascimento();
            
            String str_end = req.getParameter("str_end");
            if(str_end.equals("")) str_end = contato.getEndereco();
            
            contato.setNome(str_nome);
            contato.setEmail(str_email);
            contato.setTelefone(str_tel);
            contato.setNascimento(str_nasc);
            contato.setEndereco(str_end);
            System.out.println(contato.toString());
            if(new ContatoDao().update(contato)){
                System.out.println("Alterado com sucesso");
               
            }
        }

        // retorna o view que deve ser chamando
        return ("alteraContato.jsp");
    }
}
