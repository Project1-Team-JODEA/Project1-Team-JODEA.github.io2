package org.apache.jsp.DoctorLogin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class VaccinationDB_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"../js/ajax.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"../js/searchPatient.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"../js/functions.js\"></script>\n");
      out.write("<script src =\"../js/dbaction.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("   \n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Vaccination Database</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"formstyle.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"../image/favicon_16x16.png\"/>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("//            const toggleSortValue = () => {\n");
      out.write("//                const sort_items = document.getElementsByClassName(\"sortval\");\n");
      out.write("//            };\n");
      out.write("//            var input = document.getElementsByName(\"sortval\");\n");
      out.write("//            var i=0;\n");
      out.write("//            \n");
      out.write("//            $(\"sort_ptype\").\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Authentication -->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- \n");
      out.write("                For Searching through database\n");
      out.write("        -->\n");
      out.write("        <p>\n");
      out.write("            ");
      out.write("\n");
      out.write("        </p>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"title\">Patient Database Records Selection</div>\n");
      out.write("            <div class=\"content\">\n");
      out.write("\n");
      out.write("                <form name=\"RecordsSelection\" id=\"RecordsSelection\" action=\"Search\" method=\"post\">\n");
      out.write("                    <div class=\"info\">\n");
      out.write("                        <div class=\"user-details\">\n");
      out.write("\n");
      out.write("                            <div class=\"input-box\" id=\"pat-info\">\n");
      out.write("                                <span class=\"details\">Patient Info</span>\n");
      out.write("                                <table>\n");
      out.write("<!--                                    <tr>\n");
      out.write("                                        <td></td>\n");
      out.write("                                        <td></td>\n");
      out.write("                                    </tr>-->\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><span class=\"details\">SSN</span></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"ssn\" id=\"ssn\" \n");
      out.write("                                                   placeholder=\"(000-00-0000)\"></td>\n");
      out.write("                                        <td>DOB</td>\n");
      out.write("                                        <td><input type=\"date\" name=\"dob\" id=\"dob\"\n");
      out.write("                                                   max=\"\"></td>\n");
      out.write("                                    </tr>            \n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><span class=\"details\">First Name:</span></td>\n");
      out.write("                                        <td><input type=\"text\" name=\"fname\" id=\"fname\"  size=\"\"\n");
      out.write("                                                   ></td>\n");
      out.write("                                        <td>Vaccination Date</td>\n");
      out.write("                                        <td><input type=\"date\" name=\"vac_date\" id=\"vac_date\"\n");
      out.write("                                                   min=\"2021-11-30\"  max=\"2022-3-10\" ></td><!--onclick=\"setTodayMaxDate('vac_date')\"-->\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><span class=\"details\">Middle Init:</span></td>\n");
      out.write("                                        <td><input type=\"text\" name=\"midinit\" id=\"midinit\"  \n");
      out.write("                                                   width=\"5\"></td>\n");
      out.write("                                        <td></td>\n");
      out.write("                                        <td></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><span class=\"details\">Last Name:</span></td>\n");
      out.write("                                        <td><input type=\"text\" name=\"lname\" id=\"lname\"  size=\"\"\n");
      out.write("                                                   ></td>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><span class=\"details\">Patient Type</span></td>\n");
      out.write("                                        <td><select id=\"pat_type\">\n");
      out.write("                                                <option value=\"\">Select</option>\n");
      out.write("                                                <option svalue=\"PAT\">Regular</option>\n");
      out.write("                                                <option value=\"INP\">Inpatient</option>\n");
      out.write("                                                <option value=\"OUT\">Outpatient</option>\n");
      out.write("                                                <option value=\"OTH\">Other</option>\n");
      out.write("                                                <option value=\"N/A\">N/A</option>\n");
      out.write("                                            </select></td>\n");
      out.write("                                        <!--                                        <td><span class=\"details\">Sort by:</span></td>\n");
      out.write("                                                                                <td>\n");
      out.write("                                                                                </td>-->\n");
      out.write("                                        <!--\n");
      out.write("                                        -->\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><span class=\"details\">Order</span></td>\n");
      out.write("                                        <td><select name=\"order\">\n");
      out.write("                                                <option value=\"ASC\">Ascending</option>\n");
      out.write("                                                <option value=\"DESC\">Descending</option>\n");
      out.write("                                            </select></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!--                                <div class=\"input-box\">\n");
      out.write("                                                                <span class=\"details\">Vaccines</span>\n");
      out.write("                                                                <input type=\"text\" name=\"v1id\" id=\"v1id\" value=\"\" \n");
      out.write("                                                                       pattern=\"\" placeholder=\"Vaccine #1 ID\"></div>-->\n");
      out.write("\n");
      out.write("                            <!--                                <div class=\"input-box\"><input type=\"text\" name=\"v2id\" id=\"v2id\" value=\"\" \n");
      out.write("                                                                                          placeholder=\"00000000\"></div>-->\n");
      out.write("\n");
      out.write("                            <!--                                <div class=\"input-box\"><input type=\"text\" name=\"v3id\" id=\"v3id\" value=\"\" \n");
      out.write("                                                                                          placeholder=\"Vaccine #3 ID\"></div>-->\n");
      out.write("\n");
      out.write("                            <!--                                <div class=\"input-box\"><input type=\"text\" name=\"v4id\" id=\"v4id\" value=\"\" \n");
      out.write("                                                                                          placeholder=\"Vaccine #4 ID\"></div>                        -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!--<span class=\"details\">Sort By:</span>-->\n");
      out.write("                        <input type=\"button\" name=\"list-btn\" class=\"sortbtn\" id=\"list-btn\" \n");
      out.write("                               value=\"Sort By\" onclick=\"toggleList('sortlist')\">\n");
      out.write("                        <div name=\"list\" class=\"sort\"  >\n");
      out.write("                            <div class=\"items\" id=\"sortlist\" style=\"display: none;\" > \n");
      out.write("                                <!--<label for=\"sort_type\">Patient Type</label>-->\n");
      out.write("                                <!--<span class=\"details\"></span>-->\n");
      out.write("\n");
      out.write("                                <!--<span>Last Name</span>-->\n");
      out.write("                                <!--<span>Vaccine 1</span>-->\n");
      out.write("                                <!--<span>Vaccine 2</span>-->\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <input type=\"checkbox\" name=\"sortval\" class=\"sortval\" \n");
      out.write("                                               id=\"sort_ptype\" value=\"P_Type\" onclick=\"sort_ptype\">Patient Type\n");
      out.write("                                        <!--                                        <span class=\"details\">Patient Name</span> -->\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                    <li><input type=\"checkbox\" name=\"sortval\" class=\"sortval\" \n");
      out.write("                                               id=\"sort_fname\" value=\"First_Name\" onclick=\"toggleSortVal('p_type')\" >First Name\n");
      out.write("                                        <!--<span class=\"details\">First Name</span>-->\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><input type=\"checkbox\" name=\"sortval\" class=\"sortval\" \n");
      out.write("                                               id=\"sort_lname\" value=\"Last_Name\" >Last Name</li>\n");
      out.write("                                    <li><input type=\"checkbox\" name=\"sortval\" class=\"sortval\" \n");
      out.write("                                               id=\"sort_v1id\" value=\"Vaccine_1\" >Vaccine #1</li>\n");
      out.write("                                    <li><input type=\"checkbox\" name=\"sortval\" class=\"sortval\" \n");
      out.write("                                               id=\"sort_v2id\" value=\"Vaccine_2\" > Vaccine #2</li>\n");
      out.write("                                    <li><input type=\"checkbox\" name=\"sortval\" class=\"sortval\" \n");
      out.write("                                               id=\"sort_v3id\" value=\"Vaccine_3\" > Vaccine #3</li>\n");
      out.write("                                    <li><input type=\"checkbox\" name=\"sortval\" class=\"sortval\" \n");
      out.write("                                               id=\"sort_v4id\" value=\"Vaccine_4\" > Vaccine #4</li>\n");
      out.write("                                    <li></li>\n");
      out.write("                                    <li></li>\n");
      out.write("                                    <li></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <input type=\"text\" name=\"txtsort\" id=\"sort\" value=\"\" \n");
      out.write("                               readonly>\n");
      out.write("                        <!--                        <div class=\"input-box\">\n");
      out.write("                        \n");
      out.write("                                                </div>-->\n");
      out.write("                        <!--                        <input type=\"checkbox\" name=\"sortval\" class=\"sortval\" \n");
      out.write("                                                               id=\"sort_ptype\"  value=\"Patient Type\">-->\n");
      out.write("                        <!--                            <table>\n");
      out.write("                          <tr>\n");
      out.write("                                                    <td><span class=\"details\">Sort</span></td>\n");
      out.write("                                                     <td><select id=\"sort\">\n");
      out.write("                                                            <option value=\"N/A\">\n");
      out.write("                                                            <input type=\"checkbox\" value=\"example\"></option>\n");
      out.write("                                                            <option value=\"pat_type\">Patient Type</option>\n");
      out.write("                                                            \n");
      out.write("                                                            <option value=\"ssn\">ssn</option>\n");
      out.write("                                                                        <option value=\"OUT\">Outpatient</option>\n");
      out.write("                                                            <option value=\"OTH\">Other</option>\n");
      out.write("                                                        </select></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                    </table>-->\n");
      out.write("                        <div class=\"vac-details\">\n");
      out.write("\n");
      out.write("                            <div class=\"input-box\" id=\"vac-info\">\n");
      out.write("                                <table>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><span class=\"details\">Vaccine 1</span></td>\n");
      out.write("                                        <!--<td></td>-->\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><input type=\"text\" name=\"v1id\" id=\"v1id\" \n");
      out.write("                                                   pattern=\"[0-9]{8}\" placeholder=\"00000000\"></td>\n");
      out.write("                                        <td style=\"width: 100px;\"> <input type=\"submit\"  class=\"edit-btn\" name=\"edit_v1\" id=\"edit_v1\" value=\"Edit Vaccine\"></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><span class=\"details\">Vaccine 2</span></td>\n");
      out.write("                                        <!--<td style=\"\"></td>-->\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><input type=\"text\" name=\"v2id\" id=\"v2id\" \n");
      out.write("                                                   pattern=\"[0-9]{8}\" placeholder=\"00000000\"></td>\n");
      out.write("                                        <td style=\"width: 100px;\"><input type=\"submit\"  class=\"edit-btn\" value=\"Edit Vaccine\"></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><span class=\"details\">Vaccine 3</span></td>                                        \n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><input type=\"text\" name=\"v3id\" id=\"v3id\"  \n");
      out.write("                                                   pattern=\"[0-9]{8}\" placeholder=\"00000000\"></td>\n");
      out.write("                                        <td style=\"\"><input type=\"submit\"  class=\"edit-btn\" name=\"edit_v3\" \n");
      out.write("                                                            id=\"edit_v3\" value=\"Edit Vaccine\" onclick=\"pageAction('EditVaccine')\"></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><span class=\"details\">Vaccine 4</span></td>                                        \n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td> <input type=\"text\" name=\"v4id\" id=\"v4id\" \n");
      out.write("                                                    pattern=\"[0-9]{8}\" placeholder=\"00000000\"></td>\n");
      out.write("                                        <td style=\"\"><input type=\"submit\"  class=\"edit-btn\" name=\"edit_v4\" \n");
      out.write("                                                            id=\"edit_v4\" value=\"Edit Vaccine\"></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!--                    <div id=\"button\">\n");
      out.write("                    \n");
      out.write("                                            <input type=\"submit\" class=\"actionBtn\" name=\"view\" id=\"view\" onclick=\"pageAction('view')\" value=\"Search\">\n");
      out.write("                                            <input type=\"submit\"class=\"actionBtn\" name=\"create\" id=\"create\" onclick=\"pageAction('create')\" value=\"create\">\n");
      out.write("                                            <br>\n");
      out.write("                                            <input type=\"button\" class=\"actionBtn\" name=\"Form 2\">\n");
      out.write("                                            <input type=\"submit\" class=\"actionBtn\" name=\"report\" id=\"report\" onclick=\"pageAction('report')\" value=\"Create Report\">\n");
      out.write("                                        </div>-->\n");
      out.write("\n");
      out.write("                    <div class=\"button\">\n");
      out.write("                        <input type=\"submit\" name=\"search\" id=\"search\" value=\"Search Patient\">\n");
      out.write("                        &#8287;  &#8287;  &#8287;  &#8287; \n");
      out.write("                        <input type=\"button\" name=\"btnClear\" id=\"btnClear\" value=\"Add\" onclick=\"document.location = 'VacRecordCreate.jsp';\" >\n");
      out.write("                        &#8287;  &#8287;  &#8287;  &#8287; \n");
      out.write("                        <input type=\"reset\" class=\"actionBtn\" name=\"btnClear\"  id=\"btnClear\" value=\"Clear\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!--&#8287;  &#8287;  &#8287;  &#8287;-                                -> \n");
      out.write("                       <input type=\"reset\" name=\"clear\" id=\"btnClear\" value=\"Clear\">\n");
      out.write("                                    &#8287;  &#8287;  &#8287;  &#8287; \n");
      out.write("                                    </div>\n");
      out.write("                    \n");
      out.write("                   <input type=\"hidden\" name=\"actiontype\" id=\"actiontype\" value=\"\" > \n");
      out.write("\n");
      out.write("\n");
      out.write("                    <input type=\"button\"name=\"logout\" id=\"logout\" value=\"Logout\" \n");
      out.write("                           onclick=\"document.location = 'index1.jsp';\">\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                </div>-->\n");
      out.write("\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"title\">Results</div>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div id=\"results\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
