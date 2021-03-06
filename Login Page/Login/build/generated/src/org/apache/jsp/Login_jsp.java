package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Another Login Demo</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("        @import url('https://fonts.googleapis.com/css?family=Montserrat:600|Noto+Sans|Open+Sans:400,700&display=swap');\n");
      out.write("*{\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("  height: 100vh;\n");
      out.write("  display: flex;\n");
      out.write("  align-items: center;\n");
      out.write("  text-align: center;\n");
      out.write("  font-family: sans-serif;\n");
      out.write("  justify-content: center;\n");
      out.write("  background: url(bg.jpg);\n");
      out.write("  background-size: cover;\n");
      out.write("  background-position: center;\n");
      out.write("}\n");
      out.write(".container{\n");
      out.write("  position: relative;\n");
      out.write("  width: 400px;\n");
      out.write("  background: white;\n");
      out.write("  padding: 60px 40px;\n");
      out.write("}\n");
      out.write("header{\n");
      out.write("  font-size: 40px;\n");
      out.write("  margin-bottom: 60px;\n");
      out.write("  font-family: 'Montserrat', sans-serif;\n");
      out.write("}\n");
      out.write(".input-field, form .button{\n");
      out.write("  margin: 25px 0;\n");
      out.write("  position: relative;\n");
      out.write("  height: 50px;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write(".input-field input{\n");
      out.write("  height: 100%;\n");
      out.write("  width: 100%;\n");
      out.write("  border: 1px solid silver;\n");
      out.write("  padding-left: 15px;\n");
      out.write("  outline: none;\n");
      out.write("  font-size: 19px;\n");
      out.write("  transition: .4s;\n");
      out.write("}\n");
      out.write("input:focus{\n");
      out.write("  border: 1px solid #2f3640;\n");
      out.write("}\n");
      out.write(".input-field label, span.show{\n");
      out.write("  position: absolute;\n");
      out.write("  top: 50%;\n");
      out.write("  transform: translateY(-50%);\n");
      out.write("}\n");
      out.write(".input-field label{\n");
      out.write("  left: 15px;\n");
      out.write("  pointer-events: none;\n");
      out.write("  color: grey;\n");
      out.write("  font-size: 18px;\n");
      out.write("  transition: .4s;\n");
      out.write("}\n");
      out.write("span.show{\n");
      out.write("  right: 20px;\n");
      out.write("  color: #111;\n");
      out.write("  font-size: 14px;\n");
      out.write("  font-weight: bold;\n");
      out.write("  cursor: pointer;\n");
      out.write("  user-select: none;\n");
      out.write("  visibility: hidden;\n");
      out.write("  font-family: 'Open Sans', sans-serif;\n");
      out.write("}\n");
      out.write("input:valid ~ span.show{\n");
      out.write("  visibility: visible;\n");
      out.write("}\n");
      out.write("input:focus ~ label,\n");
      out.write("input:valid ~ label{\n");
      out.write("  transform: translateY(-33px);\n");
      out.write("  background: white;\n");
      out.write("  font-size: 16px;\n");
      out.write("  color: #2f3640;\n");
      out.write("}\n");
      out.write("form .button{\n");
      out.write("  margin-top: 30px;\n");
      out.write("  overflow: hidden;\n");
      out.write("  z-index: 111;\n");
      out.write("}\n");
      out.write(".button .inner{\n");
      out.write("  position: absolute;\n");
      out.write("  height: 100%;\n");
      out.write("  width: 300%;\n");
      out.write("  left: -100%;\n");
      out.write("  z-index: -1;\n");
      out.write("  transition: all .4s;\n");
      out.write("  background: -webkit-linear-gradient(right,#00dbde,#fc00ff,#00dbde,#fc00ff);\n");
      out.write("}\n");
      out.write(".button:hover .inner{\n");
      out.write("  left: 0;\n");
      out.write("}\n");
      out.write(".button button{\n");
      out.write("  width: 100%;\n");
      out.write("  height: 100%;\n");
      out.write("  border: none;\n");
      out.write("  background: none;\n");
      out.write("  outline: none;\n");
      out.write("  color: white;\n");
      out.write("  font-size: 20px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  font-family: 'Montserrat', sans-serif;\n");
      out.write("}\n");
      out.write(".container .auth{\n");
      out.write("  margin: 35px 0 20px 0;\n");
      out.write("  font-size: 19px;\n");
      out.write("  color: grey;\n");
      out.write("}\n");
      out.write(".links{\n");
      out.write("  display: flex;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write(".teacher, .student{\n");
      out.write("  height: 40px;\n");
      out.write("  width: 100%;\n");
      out.write("  border: 1px solid silver;\n");
      out.write("  border-radius: 3px;\n");
      out.write("  margin: 0 10px;\n");
      out.write("  transition: .4s;\n");
      out.write("}\n");
      out.write(".teacher:hover{\n");
      out.write("  border: 1px solid #3993dd;\n");
      out.write("}\n");
      out.write(".student:hover{\n");
      out.write("  border: 1px solid #9339dd;\n");
      out.write("}\n");
      out.write(".teacher i, .teacher span{\n");
      out.write("  color: #3993dd;\n");
      out.write("}\n");
      out.write(".student i, .student span{\n");
      out.write("  color: #9339dd;\n");
      out.write("}\n");
      out.write(".links i{\n");
      out.write("  font-size: 23px;\n");
      out.write("  line-height: 40px;\n");
      out.write("  margin-left: -90px;\n");
      out.write("}\n");
      out.write(".links span{\n");
      out.write("  position: absolute;\n");
      out.write("  font-size: 17px;\n");
      out.write("  font-weight: bold;\n");
      out.write("  padding-left: 8px;\n");
      out.write("  font-family: 'Open Sans', sans-serif;\n");
      out.write("}\n");
      out.write(".signup{\n");
      out.write("  margin-top: 50px;\n");
      out.write("  font-family: 'Noto Sans', sans-serif;\n");
      out.write("}\n");
      out.write(".signup a{\n");
      out.write("  color: #3498db;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write(".signup a:hover{\n");
      out.write("  text-decoration: underline;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* selected box */\n");
      out.write("\n");
      out.write("\n");
      out.write(".containers {\n");
      out.write("  padding-top: 5px;\n");
      out.write("  padding-left: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".select-box {\n");
      out.write("  display: flex;\n");
      out.write("  width: 300px;\n");
      out.write("  flex-direction: column;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".select-box .options-container {\n");
      out.write("  background: #2f3640;\n");
      out.write("  color: #f5f6fa;\n");
      out.write("  max-height: 0;\n");
      out.write("  width: 100%;\n");
      out.write("  opacity: 0;\n");
      out.write("  transition: all 0.4s;\n");
      out.write("  border-radius: 8px;\n");
      out.write("  overflow: hidden;\n");
      out.write("\n");
      out.write("  order: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".selected {\n");
      out.write("  background: #2f3640;\n");
      out.write("  border-radius: 8px;\n");
      out.write("  margin-bottom: 8px;\n");
      out.write("  color: #f5f6fa;\n");
      out.write("  position: relative;\n");
      out.write("\n");
      out.write("  order: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".selected::after {\n");
      out.write("  content: \"\";\n");
      out.write("  background: url(\"img/arrow-down.svg\");\n");
      out.write("  background-size: contain;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("\n");
      out.write("  position: absolute;\n");
      out.write("  height: 100%;\n");
      out.write("  width: 32px;\n");
      out.write("  right: 10px;\n");
      out.write("  top: 5px;\n");
      out.write("\n");
      out.write("  transition: all 0.4s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".select-box .options-container.active {\n");
      out.write("  max-height: 240px;\n");
      out.write("  opacity: 1;\n");
      out.write("  overflow-y: scroll;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".select-box .options-container.active + .selected::after {\n");
      out.write("  transform: rotateX(180deg);\n");
      out.write("  top: -6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".select-box .options-container::-webkit-scrollbar {\n");
      out.write("  width: 8px;\n");
      out.write("  background: #0d141f;\n");
      out.write("  border-radius: 0 8px 8px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".select-box .options-container::-webkit-scrollbar-thumb {\n");
      out.write("  background: #525861;\n");
      out.write("  border-radius: 0 8px 8px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".select-box .option,\n");
      out.write(".selected {\n");
      out.write("  padding: 12px 24px;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".select-box .option:hover {\n");
      out.write("  background: #414b57;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".select-box label {\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".select-box .option .radio {\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <header>Login</header>\n");
      out.write("      <form>\n");
      out.write("        <div class=\"input-field\">\n");
      out.write("          <input type=\"text\" required>\n");
      out.write("          <label>Username</label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"input-field\">\n");
      out.write("          <input class=\"pswrd\" type=\"password\" required>\n");
      out.write("          <span class=\"show\">SHOW</span>\n");
      out.write("          <label>Password</label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"button\">\n");
      out.write("          <div class=\"inner\"></div>\n");
      out.write("          <button>LOGIN</button>\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("      <div class=\"auth\">Or login with</div>\n");
      out.write("      <!-- Selected box -->\n");
      out.write("      <div class=\"containers\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("        <div class=\"select-box\">\n");
      out.write("          <div class=\"options-container\">\n");
      out.write("            \n");
      out.write("            <div class=\"option\">\n");
      out.write("              <input\n");
      out.write("                type=\"radio\"\n");
      out.write("                class=\"radio\"\n");
      out.write("                id=\"campus\"\n");
      out.write("                name=\"category\"\n");
      out.write("              />\n");
      out.write("              <label for=\"campus\">Select Campus</label>\n");
      out.write("            </div>\n");
      out.write("      \n");
      out.write("            <div class=\"option\">\n");
      out.write("              <input type=\"radio\" class=\"radio\" id=\"hl\" name=\"category\" />\n");
      out.write("              <label for=\"hl\">Ho?? L???c</label>\n");
      out.write("            </div>\n");
      out.write("      \n");
      out.write("            <div class=\"option\">\n");
      out.write("              <input type=\"radio\" class=\"radio\" id=\"hcm\" name=\"category\" />\n");
      out.write("              <label for=\"hcm\">H??? Ch?? Minh</label>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"option\">\n");
      out.write("              <input type=\"radio\" class=\"radio\" id=\"dn\" name=\"category\" />\n");
      out.write("              <label for=\"dn\">???? N???ng</label>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"option\">\n");
      out.write("              <input type=\"radio\" class=\"radio\" id=\"ct\" name=\"category\" />\n");
      out.write("              <label for=\"ct\">C???n Th??</label>\n");
      out.write("            </div>\n");
      out.write("      \n");
      out.write("            <div class=\"option\">\n");
      out.write("              <input type=\"radio\" class=\"radio\" id=\"qn\" name=\"category\" />\n");
      out.write("              <label for=\"qn\">Quy Nh??n</label>\n");
      out.write("            </div> \n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("      \n");
      out.write("          <div class=\"selected\">\n");
      out.write("            Select Campus\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- -------- -->\n");
      out.write("      \n");
      out.write("      <div class=\"links\">\n");
      out.write("        <div class=\"teacher\">\n");
      out.write("          <i class=\"fab fa-google-plus-square\"><span>Teacher</span></i>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"student\">\n");
      out.write("          <i class=\"fab fa-google-plus-square\"><span>Student</span></i>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- <div class=\"signup\">\n");
      out.write("        Not a member? <a href=\"#\">Signup now</a>\n");
      out.write("      </div> -->\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("      var input = document.querySelector('.pswrd');\n");
      out.write("      var show = document.querySelector('.show');\n");
      out.write("      show.addEventListener('click', active);\n");
      out.write("      function active(){\n");
      out.write("        if(input.type === \"password\"){\n");
      out.write("          input.type = \"text\";\n");
      out.write("          show.style.color = \"#1DA1F2\";\n");
      out.write("          show.textContent = \"HIDE\";\n");
      out.write("        }else{\n");
      out.write("          input.type = \"password\";\n");
      out.write("          show.textContent = \"SHOW\";\n");
      out.write("          show.style.color = \"#111\";\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("        \n");
      out.write("    <script>\n");
      out.write("      const selected = document.querySelector(\".selected\");\n");
      out.write("      const optionsContainer = document.querySelector(\".options-container\");\n");
      out.write("\n");
      out.write("      const optionsList = document.querySelectorAll(\".option\");\n");
      out.write("\n");
      out.write("            selected.addEventListener(\"click\", () => {\n");
      out.write("            optionsContainer.classList.toggle(\"active\");\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        optionsList.forEach(o => {\n");
      out.write("        o.addEventListener(\"click\", () => {\n");
      out.write("        selected.innerHTML = o.querySelector(\"label\").innerHTML;\n");
      out.write("        optionsContainer.classList.remove(\"active\");\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
