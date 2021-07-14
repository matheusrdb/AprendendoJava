package com.rubens.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.rubens.modelo.Banco;
import com.rubens.modelo.Empresa;
import com.thoughtworks.xstream.XStream;

//@WebServlet(urlPatterns = "/")
public class EmpresaService extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Empresa> lista = new Banco().getEmpresas();
        String format = req.getHeader("Accept");

        if (format.endsWith("xml")) {
            XStream xStream = new XStream();
            xStream.alias("empresa", Empresa.class);
            String xml = xStream.toXML(lista);
            resp.setContentType("application/xml");
            resp.getWriter().print(xml);
        } else if (format.endsWith("json")) {
            Gson gson = new Gson();
            String json = gson.toJson(lista);
//            gson.fromJson()
            resp.setContentType("application/json");
            resp.getWriter().print(json);
        } else {
            resp.setContentType("application/jsom");
            resp.getWriter().print("{'content' : 'no content'}");
        }
    }
}

