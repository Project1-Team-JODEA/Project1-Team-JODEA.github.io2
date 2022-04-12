package org.apache.jsp.DoctorLogin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Password_005fReset_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html><script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Doctor Login and Registration Form</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/all.css\">\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"../image/favicon_16x16.png\" />\n");
      out.write("        <script src=\"../js/validate.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../js/functions.js\"></script>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/98e4c48f68.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script>\n");
      out.write("    // Add attribute events\n");
      out.write("//    var es = document.getElementsByClassName(\"rsmethod\");\n");
      out.write("    function toggle() {// toggle methods\n");
      out.write("        var element = this;\n");
      out.write("        var val = this.value;\n");
      out.write("        if (value === 'hint'){\n");
      out.write("            var es = document.getElementsByClassName(\"Hint\");\n");
      out.write("            for (var i=0; i < es.length; i++){\n");
      out.write("                if (es[i].style.display === 'none'){\n");
      out.write("                    es[i].style.display = 'block';\n");
      out.write("                }else if (es[i].style.display === 'block'){\n");
      out.write("                    es[i].style.display = 'none';\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        else{\n");
      out.write("            var es = document.getElementsByClassName(val);\n");
      out.write("            for (var i=0; i < es.length; i++){\n");
      out.write("                 if (es[i].style.display === 'none'){\n");
      out.write("                    es[i].style.display = 'block';\n");
      out.write("                }else if (es[i].style.display === 'block'){\n");
      out.write("                    es[i].style.display = 'none';\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    var $ = function (id) {\n");
      out.write("        return document.getElementById(id);\n");
      out.write("    };\n");
      out.write("    function pageAction(action) {\n");
      out.write("        document.getElementById(\"step\").value = action;\n");
      out.write("        if (action === 'cancel') {\n");
      out.write("            var c = confirm(\"Are you sure you want to cancel? Your input data may be lost.\");\n");
      out.write("            if (c === true) {\n");
      out.write("                document.passwdreset.submit();\n");
      out.write("            } else if (c === false) {\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        } else if (action === 'method') {\n");
      out.write("            document.getElementById(\"step\").value = $(\"rsmethod\").value;\n");
      out.write("            document.passwdreset.submit();\n");
      out.write("        } else {\n");
      out.write("            document.passwdreset.submit();\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    window.onload = () => {\n");
      out.write("//       \n");
      out.write("//        $(\"terms\").setAttribute(\"onclick\", \"t()\");\n");
      out.write("//        $(\"validc\").setAttribute(\"onchange\", \"\");\n");
      out.write("//        $(\"email\").setAttribute(\"onchange\", \"validatePattern('email','valide')\");\n");
      out.write("        //                   $(\"uid\").setAttribute(\"onchange\", \"validatePattern('uid','validid')\");  \n");
      out.write("        //                       $(\"validp\").setAttribute(\"onchange\",\"validatePasswd('upwd', 'confpasswd')\"); \n");
      out.write("        //                $sel(\"\")\n");
      out.write("//        $(\"rsmethod\").onchange = () => {//toggle methods\n");
      out.write("//            var id = $(\"rsmethod\").id;\n");
      out.write("//            var val = $(\"rsmethod\").value;\n");
      out.write("//            console.log(val);\n");
      out.write("//        };\n");
      out.write("    };\n");
      out.write("\n");
      out.write("\n");
      out.write("    var cancel = function (form_id) {\n");
      out.write("//    var p = prompt();\n");
      out.write("\n");
      out.write("        if (c === true) {\n");
      out.write("            $(\"step\").value = \"\";\n");
      out.write("            $(form_id).submit();\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    }\n");
      out.write("//            if ($(\"email\"))\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"hero\">\n");
      out.write("            <div class=\"form-box\">\n");
      out.write("                <div class=\"social-icons\">\n");
      out.write("                    <a href=\"https://www.mypatientchart.org/MyChart/Authentication/Login?\">\n");
      out.write("                        <img src=\"download.png\">\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"https://physicians.wustl.edu/for-patients/mychart-patient-portal/\">\n");
      out.write("                        <img src=\"washu2.png\">\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"https://www.mymercy.net/login\">\n");
      out.write("                        <img src=\"mercy.jpg\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <form id=\"passwdreset\" class=\"input-group\"\n");
      out.write("                      action=\"ResetPassword\" method=\"post\"  style=\"align-content: center;\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"width: 280px; \">\n");
      out.write("                                <input type=\"text\" class=\"input-field\" name=\"userid\" id=\"userid\"\n");
      out.write("                                       placeholder=\"UserID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"email\" class=\"input-field\" name=\"email\" id=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                                       placeholder=\"email (character@character.domain)\" required>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        <!--                            <tr>\n");
      out.write("                                                        <td>Select a Method to reset your password:</td>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                    <tr id=\"reset-m\">\n");
      out.write("                                                        <td><button type=\"button\" class=\"rsmethod\">Code</button>\n");
      out.write("                                                            <input type=\"button\"   value=\"\">\n");
      out.write("                                                            <input type=\"text\" class=\"in\" name=\"rcode\" id=\"rcode\"value=\"\">\n");
      out.write("                                                        </td>\n");
      out.write("                                                                                        <td><input type=\"text\" class=\"in\" name=\"\" id=\"\" value=\"\"></td>\n");
      out.write("                                                    </tr>\n");
      out.write("                        \n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <td></td>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                    <var>c</var>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                    <!--<input type=\"submit\"  onclick=\"\">Login</button>-->\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    <!--<input type=\"submit\" name=\"\" value=\"Reset\">-->\n");
      out.write("                    <!--<a href=\"#\">Forgot Password?</a>-->\n");
      out.write("                    <br>\n");
      out.write("                    ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    <!--<button  class=\"submit-btn\" onclick=\"document.location = 'ForgotPassword.jsp'\"><i class=\"fas fa-angle-right\"> Forgot Password?</i></button>-->\n");
      out.write("\n");
      out.write("                    <!--                    <div class=\"toggle-box\">\n");
      out.write("                                            <div id=\"Qustions\" class=\"toggle-content\">\n");
      out.write("                                                \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>-->\n");
      out.write("\n");
      out.write("                    <input type=\"hidden\" name=\"step\" id=\"step\" value=\"\" hidden=\"\">\n");
      out.write("                    <!--<input type=\"hidden\" name=\"ver\" id=\"ver\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ver}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">-->\n");
      out.write("                    <input type=\"button\" value=\"Cancel\" onclick=\"pageAction('cancel')\">\n");
      out.write("                    <div id=\"message\" style=\"padding: \n");
      out.write("                         5px; background: white;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                var x = document.getElementById(\"passwdreset\");\n");
      out.write("                x.style.left = \"50px\";\n");
      out.write("\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${searched && searched == 'true'&& ver != 'y-d'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <tr>\n");
        out.write("                                <td>Select Reset Method</td>\n");
        out.write("                            </tr>\n");
        out.write("                            <tr>\n");
        out.write("                                <td><select name=\"rsmethod\" id=\"methodtype\" onchange=\"toggle()\">\n");
        out.write("                                        <option value=\"\">Select</option>\n");
        out.write("                                        <option value=\"sendCode\">Reset Code via Email</option>\n");
        out.write("                                        <option value=\"Challenge Question\">Challenge Question</option>\n");
        out.write("                                        <!--<option value=\"Hint\"></option>-->\n");
        out.write("\n");
        out.write("                                    </select></td>\n");
        out.write("                                <!--<td><button type=\"submit\" onclick=\"pageAction('method')\">Submit</button></td>-->\n");
        out.write("                            </tr>\n");
        out.write("                            <tr name=\"methodtype\" class=\"Hint\" id=\"out\" style=\"display: none;\">\n");
        out.write("                                <td></td>\n");
        out.write("                            </tr>\n");
        out.write("                            <tr name=\"methodtype\" class=\"Hint\" id=\"passwd_1\" style=\"display: none;\">\n");
        out.write("                                <td></td>\n");
        out.write("                            </tr>\n");
        out.write("                            <!--                            <tr><button type=\"button\" class=\"rsmethod\">Challenge</button> <br>\n");
        out.write("                                                        <input type=\"text\" class=\"in\" name=\"ques\" id=\"\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.question}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"></tr>\n");
        out.write("                                                        <tr>-->\n");
        out.write("                            <td></td>\n");
        out.write("                            </tr>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${searched =='true' && ver== 'y-d'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <tr>\n");
        out.write("                                <td style=\"width: 240px;\"><input type=\"password\" name=\"upwd\" class=\"input-field\"\n");
        out.write("                                                                 id=\"upwd\" value=\"\" placeholder=\"Password\" required>\n");
        out.write("                                </td>\n");
        out.write("                                <td style=\"width: 40px;\">\n");
        out.write("                                    <i class=\"fas fa-1-5x fa-eye\" id=\"v-btn-p\" onclick=\"toggleV('upwd', 'v-btn-p')\"></i>\n");
        out.write("                                    <i id=\"validp\" class=\"fas fa-check\" style=\"color: green;\"></i>\n");
        out.write("                                </td>\n");
        out.write("                            </tr>\n");
        out.write("                            <tr>\n");
        out.write("                                <td style=\"width: 240px;\">\n");
        out.write("                                    <input type=\"password\" name=\"confpasswd\" class=\"input-field\" name=\"confpasswd\"\n");
        out.write("                                           id=\"confpasswd\" placeholder=\"Confirm Password\" required>\n");
        out.write("                                </td>\n");
        out.write("                                <td style=\"width: 40px;\"><i class=\"fas fa-1-5x fa-eye\" id=\"v-btn-c\" onclick=\"toggleV('upwd', 'v-btn-c')\"></i>\n");
        out.write("                                    <i id=\"validc\" class=\"fas fa-check\" style=\"color: green;\"\n");
        out.write("                                       onchange=\"validatePasswd('upwd', 'confpasswd')\"></i>\n");
        out.write("                                </td>\n");
        out.write("                            </tr>\n");
        out.write("                            <tr>\n");
        out.write("                                <td style=\"width: 280px; \">\n");
        out.write("                                    <input type=\"text\" class=\"input-field\" name=\"newhint\" id=\"newhint\"\n");
        out.write("                                           placeholder=\"New Hint\" required>\n");
        out.write("                                </td>\n");
        out.write("                            </tr>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ver != 'y-d'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <button type=\"submit\" class=\"submit-btn\" onclick=\"pageAction('search')\"> Continue </button>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ver == 'y-d'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <button type=\"submit\" onclick=\"pageAction('UpdatePasswd')\">Update Account</button>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }
}