/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.candidjava;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author user
 */
@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        
    
         @Override
                 
         void doPost(HttpServletRequest request = null, HttpServletResponse response) throws ServletException, IOException 
        {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            String userName = request.getParameter("userName");
            String pass = request.getParameter("pass");
            
            if (userName.isEmpty() || pass.isEmpty() ) {
                RequestDispatcher rd = request.getRequestDispatcher("loginPage.jsp");
                out.println("<font color=red>Please fill all the fields</font>");
   rd.include(request, response);
   
            }
   else {
   // inserting data into mysql database 
   // create a test database and student table before running this to create table
   //create table student(name varchar(100), userName varchar(100), pass varchar(100), addr varchar(100), age int, qual varchar(100), percent varchar(100), year varchar(100));
   try {
    Class.forName("com.mysql.jdbc.Driver");
    // loads mysql driver
       try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/iiitnhostel", "root", "")) {
           String query = "select * from registrationdetails where userName=? and pass=?";
           
        try (PreparedStatement ps = con.prepareStatement(query) // generates sql query
        ) {
            
            ps.setString(1, userName);
            ps.setString(2, pass);
            
            ps.executeUpdate(); // execute it on test database
            System.out.println("successfuly inserted");
        }
       }
   } catch (ClassNotFoundException | SQLException e) {
    // TODO Auto-generated catch block.
    
    
    e.printStackTrace();
   }
                RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
   rd.forward(request, response);
  }
 }
 }
}
  