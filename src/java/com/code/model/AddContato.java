package com.code.model;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miigu
 */
public class AddContato implements Logica {
    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

        if (req.getMethod().equals("POST")) {
            String str_nome = req.getParameter("str_nome");
            String str_email = req.getParameter("str_email");
            String str_tel = req.getParameter("str_tel");
            String str_nasc = req.getParameter("str_nasc");
            String str_end = req.getParameter("str_end");

            if(new ContatoDao().insert(new Contato(null,str_nome,str_tel,str_email,str_nasc,str_end))){
                System.out.println("Cadastrado com sucesso");
               
            }
        }

        // retorna o view que deve ser chamando
        return ("addContato.jsp");
    }
}