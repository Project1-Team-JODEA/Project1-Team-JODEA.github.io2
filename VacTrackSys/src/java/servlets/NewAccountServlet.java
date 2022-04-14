/**
 *
 * @author Elena Miller, Alexander Breitenbach
 */
package servlets;

import business.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "NewAccountServlet", urlPatterns = {"/CDC/NewAccount", "/Member/NewAccount", "/DoctorLogin/NewAccount"})
public class NewAccountServlet extends HttpServlet {

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
        
        String URL = "";
        String msg = "", sql = "", testmsg = "", webloc="", ac_lvl=""; //ac_lvl = access level
        // Check Location in web
            String x = String.valueOf(request.getRequestURL());
            if (x.contains("DoctorLogin")){
                webloc = "/DoctorLogin";
                ac_lvl = "Edit";
            } else if (x.contains("PatientLogin")){
                webloc = "/PatientLogin";
                ac_lvl = "Patient";
            }else if (x.contains("AdminConsole")){
                webloc = "/AdminConsole";
                ac_lvl = "Administrator";
            }else if (x.contains("CDC")){
                webloc = "/CDC";
                ac_lvl = "View";
            }
        try {//Connecting to database
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            ServletContext context = getServletContext();
            String ur = context.getRealPath("/Team_JODEA1.accdb");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://"+ur);
            User u = new User();
            String uid = String.valueOf(request.getParameter("uid"));
            u.setUsername(String.valueOf(request.getParameter("uid")));
            
            testmsg += u.getUsername();
            u.setEmail(String.valueOf(request.getParameter("email")));
            testmsg += u.getEmail();
            // need location field.  Hardcoding for now
            if (x.contains("AdminConsole") || x.contains("DoctorLogin")){
                u.setLocation(request.getParameter("loc"));
            } else if (x.contains("PatientLogin") || x.contains("CDC")){
                u.setLocation("online");
            }else{
              u.setLocation("First Hospital East");  
            }
            System.out.println("Username = "+u.getUsername());
//            u.setLocation(request.getParameter("loc"));
            //u.setLocation(request.getParameter("location"));
//            String pws = String.valueOf(request.getParameter("upwd"));
            
            u.setPassword(String.valueOf(request.getParameter("upwd")));
            // need url check for u.setAccessLevel()
            // hardcoding for now
                u.setAccesslevel(ac_lvl);
               
            /* check for empty strings in  input */
            if (false){
                
            }
            /*
            if (u.getUsername().equals("")){
                msg += "Please enter username. <br>";
            } else if (u.getPassword().equals("")){
                msg += "Please enter password. <br>";
            //} else if (confpasswd.equals("")){
            //    msg += "Password Invalid. Please Confirm Password <br>";
            }else if (u.getEmail().equals("")){
                msg += "Missing Email Address. <br>";
            } else if (u.getLocation().equals("")){
                msg += "Missing Location. <br>";
            }
            */
            else {
                //Check Username, Password and Confirmation Password, 
                //if 
                /*
                if (u.getUsername().length() > 6){//
                    msg += "";
                } if (u.getPassword().length() > 8){
                    msg = "";
                } 
                if (u.getPassword().equalsIgnoreCase(u.getUsername())){
                    msg = "Password Cannot be the same as your username.";
                }
                */
                //if (!confpasswd.matches(passwd)){
                  //  msg = "Password Invalid <br>";
                //}
                //Create User Account
                
                // Add validation to look for duplicate usernames (Primary Key)
                
                sql = "INSERT INTO USERS (Username, Password, Access_Level, Email_Address, Location) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString (1, u.getUsername());
                ps.setString (2, u.getPassword());
                ps.setString (3, u.getAccesslevel());
                ps.setString (4, u.getEmail());
                ps.setString (5, u.getLocation());
                int rc = ps.executeUpdate();
                if (rc == 0){
                    msg += "User not added. <br>";
                } else if (rc == 1){
                    msg += "User added. <br>";
                    request.getSession().setAttribute("UserLocation", u.getLocation());
                    request.getSession().setAttribute("UserAccessLevel", u.getAccesslevel());
                } else {
                    msg += "Warning: multiple records updated. <br>";
                    
                }
            }
        
        } catch (ClassNotFoundException ex) {
            msg = "Error: Class Not Found. <br>";
        } catch (SQLException ex) {
            msg += "Connection Error: " + ex.getMessage() + "<br>";
        }URL = webloc + "/index1.jsp";
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
