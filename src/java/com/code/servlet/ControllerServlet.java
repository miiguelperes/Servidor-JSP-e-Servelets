package com.code.servlet;

import com.code.model.Logica;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nomelogica = request.getParameter("logica");
        String nomeClasse = "com.code.model." + nomelogica;

        try {
            Class classe = Class.forName(nomeClasse);
            Logica logica = (Logica) classe.newInstance();
            String pagina = logica.executa(request, response);
            
            request.setAttribute("pagina", pagina);
            
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch (Exception e) {
            throw new ServletException("A lógica de negócios causou uma exceção", e);
        }
    }
}
