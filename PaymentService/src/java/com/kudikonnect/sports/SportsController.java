/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kudikonnect.sports;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;

/**
 *
 * @author ayeola
 */
@WebServlet(name = "SportsController", urlPatterns = {"/SportsController"})
public class SportsController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String serviceCode = request.getParameter("serviceCode");
        PrintWriter out = response.getWriter();        
        
        if (serviceCode.equals("*102")) {
            JSONObject json = new JSONObject();
            json.put("1", "FootBall");
            json.put("2", "Tennis");
            json.put("3", "BasketBall");
            json.put("4", "ETC");

            out.println(json);
        } else {
            out.println("Invalid service code");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
