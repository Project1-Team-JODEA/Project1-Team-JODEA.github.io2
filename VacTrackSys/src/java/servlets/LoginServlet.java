/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import business.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alexs
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"Member/Login", "CDC/Login", "DoctorLogin/Login"})
public class LoginServlet extends HttpServlet {

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
        String URL = "", msg = "", sql = "", username = "", webloc="";
        User u;
        String dbURL = "jdbc:ucanaccess://localhost:3306/MoVaxDB";
        String dbUSER = "root";
        String dbPWD = "sesame";
        try {
            // get Username and Passattempt from form
            System.out.println(request.getRequestURL());
            // Check Location in web
            String x = String.valueOf(request.getRequestURL());
//            System.out.println(x);
            if (x.contains("DoctorLogin")){
                webloc = "DoctorLogin";
            } else if (x.contains("PatientLogin")){
                webloc = "PatientLogin";
            }else if (x.contains("AdminConsole")){
                webloc = "AdminConsole";
            }
            username = request.getParameter("userid").trim();
            String passattempt = request.getParameter("passwd").trim();
            // load and register JDBC driver for mySql
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            ServletContext context = getServletContext();
//            String p = request.getPathInfo();
//           System.out.print("Path: " + p);
            String ur = context.getRealPath("/Team_JODEA1.accdb");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + ur);
//            String p = request
            Statement s = conn.createStatement();
            sql = "SELECT * FROM USERS WHERE Username = '" + username + "'";
            ResultSet r = s.executeQuery(sql);
            if (r.next()) {
                u = new User();
                u.setUsername(username);
                u.setPassword(r.getString("Password"));
                u.setPassattempt(passattempt);
                if (u.isAuthenticated()) {
                    u.setAccesslevel("Access_Level");
                    u.setEmail("Email_Address");
                    u.setLocation("Location");
                    msg += "User " + username + " authenticated! <br>";
                    URL = "DoctorLogin/VaccinationDB.jsp";
                } else {
                    msg += "User " + username + " on file but not authenticated. <br>";
                    URL = "/DoctorLogin/index1.jsp";
                }
                request.getSession().setAttribute("u", u);
            } else {
//                URL = "/DoctorLogin/index1.jsp";
                URL = "/Doctor/index1.jsp";
                msg += "User " + username + " not found in db.<br>";
            }
            r.close();
            s.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            msg += "JDBC Driver not found in project.<br>";
            URL = "/DoctorLogin/index1.jsp";
        } catch (SQLException e) {
            msg += "Connection error: " + e.getMessage() + ".<br>";
            URL = "/DoctorLogin/index1.jsp";
        } catch (Exception e) {
            msg += "Servlet error: " + e.getMessage() + ".<br>";
            URL = "/DoctorLogin/index1.jsp";
        }
        URL = "/DoctorLogin/VaccinationDB.jsp";
        request.setAttribute("msg", msg);
        RequestDispatcher disp = getServletContext().getRequestDispatcher(URL);
        disp.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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