/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.55
 * Generated at: 2020-08-05 08:12:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link ref=\"shortcut icon\" type=\"image/x-icon\" href=\"resources/images/sitelogo.png\"/>\r\n");
      out.write("<style>\r\n");
      out.write("   *{\r\n");
      out.write("      box-sizing:board-box;\r\n");
      out.write("   }\r\n");
      out.write("   .video-film{\r\n");
      out.write("      box-shadow: rgba(0,7,15,0.7) 0 0 0 9999px;\r\n");
      out.write("      z-index:100;\r\n");
      out.write("   }\r\n");
      out.write("   .video-background{\r\n");
      out.write("      background:#000;\r\n");
      out.write("      position: fixed;\r\n");
      out.write("      top: 0;\r\n");
      out.write("      right:0;\r\n");
      out.write("      bottom:0;\r\n");
      out.write("      left:0;\r\n");
      out.write("      z-index:-99;\r\n");
      out.write("   }\r\n");
      out.write("   .video-foreground, .video-background iframe{\r\n");
      out.write("      position:absolute;\r\n");
      out.write("      top:0;\r\n");
      out.write("      left:0;\r\n");
      out.write("      width:100%;\r\n");
      out.write("      height:100%;\r\n");
      out.write("      pointer-events:none;\r\n");
      out.write("   }\r\n");
      out.write("   @media(min-aspect-ratio : 16/9){\r\n");
      out.write("      .video-foreground{\r\n");
      out.write("         height:300%;\r\n");
      out.write("         top:-100%;\r\n");
      out.write("      }\r\n");
      out.write("   }\r\n");
      out.write("   @media (max-aspect-ratio : 16/9) {\r\n");
      out.write("      .video-foreground {\r\n");
      out.write("         width: 300%;\r\n");
      out.write("         left: -100%;\r\n");
      out.write("      }\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   h1 {\r\n");
      out.write("      color: white;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   #visual-btn {\r\n");
      out.write("      z-index: 50;\r\n");
      out.write("      color: #fff;\r\n");
      out.write("      font-size: 20px;\r\n");
      out.write("      border: 2px solid #fff;\r\n");
      out.write("      padding: 12px 24px;\r\n");
      out.write("      border-radius: 5px;\r\n");
      out.write("      cursor: pointer;\r\n");
      out.write("      background-color: rgba(0, 0, 0, 0);\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   #visual-btn:hover {\r\n");
      out.write("      color: #ff6868;\r\n");
      out.write("      font-size: 20px;\r\n");
      out.write("      border: 2px solid #ff6868;\r\n");
      out.write("      padding: 12px 24px;\r\n");
      out.write("      border-radius: 5px;\r\n");
      out.write("      cursor: pointer;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   #indexBtn {\r\n");
      out.write("      position: fixed;\r\n");
      out.write("      text-align: center\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .center {\r\n");
      out.write("      position: absolute;\r\n");
      out.write("      top: 60%;\r\n");
      out.write("      left: 47%;\r\n");
      out.write("      margin: -50px 0 0 -50px;\r\n");
      out.write("   }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <!-- 기존과 다르게 유투브 iframe API를 활용해서 멋있게 index.jsp를 꾸며보자 -->\r\n");
      out.write("   <h1 style=\"text-align:center; color:#fff\">\r\n");
      out.write("      <img src=\"resources/images/sitelogo.png\" style=\"height:50%; width:50%\"/>\r\n");
      out.write("   </h1>\r\n");
      out.write("   \r\n");
      out.write("   <p class=\"type_text\" style=\"text-align:center; color:#d5d4f7; font-size:18pt\"></p>\r\n");
      out.write("   \r\n");
      out.write("   <div id=\"indexBtn\" class=\"center\">\r\n");
      out.write("      <button id=\"visual-btn\" onclick=\"location.href='home.do'\">Visit Our Site</button>\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("   <div class=\"video-background\">\r\n");
      out.write("      <div class=\"video-foreground\">\r\n");
      out.write("         <div id=\"muteYouTubeVideoPlayer\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("   <div class=\"video-film\"></div>\r\n");
      out.write("   \r\n");
      out.write("   <script src=\"http://code.jquery.com/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("   <script async src=\"https://www.youtube.com/iframe_api\"></script>\r\n");
      out.write("   <script type=\"text/javascript\">\r\n");
      out.write("      var player;\r\n");
      out.write("      \r\n");
      out.write("      function onYouTubePlayerAPIReady(){\r\n");
      out.write("         player = new YT.Player('muteYouTubeVideoPlayer',{\r\n");
      out.write("            videoId : 'IpCdMGfducg',\r\n");
      out.write("            playerVars : {\r\n");
      out.write("               autoplay : 1,\r\n");
      out.write("               controls : 0,\r\n");
      out.write("               rel : 0,\r\n");
      out.write("               start : 105,\r\n");
      out.write("               end : 301,\r\n");
      out.write("               showinfo : 0,\r\n");
      out.write("               modestbranding : 1,\r\n");
      out.write("               loop : 1,\r\n");
      out.write("               playlist : 'Fk9EBOOAYiU',\r\n");
      out.write("               fs : 0,\r\n");
      out.write("               cc_load_policy : 0,\r\n");
      out.write("               iv_load_policy : 3,\r\n");
      out.write("               autohide : 1\r\n");
      out.write("            },\r\n");
      out.write("            events:{\r\n");
      out.write("               onReady:function(e){\r\n");
      out.write("                  e.target.mute();\r\n");
      out.write("               }\r\n");
      out.write("            }\r\n");
      out.write("         });\r\n");
      out.write("      }\r\n");
      out.write("   \r\n");
      out.write("   </script>\r\n");
      out.write("   \r\n");
      out.write("   <script type=\"text/javascript\" src=\"resources/js/typeit.min.js\"></script>\r\n");
      out.write("   <script>\r\n");
      out.write("      $(function(){\r\n");
      out.write("         var str1 = [\"본 사이트는 KH 정보교육원\",\"B오전반 수강생들을 위한 사이트로\",\"Spring교육을 위한 사이트입니다.\"];\r\n");
      out.write("         var str2 = [\"누구나 할 수 있는<br>_Spring Framework와<br>_쉬운 웹 개발 노하우<br>_지금 바로 함께 하세요!\"];\r\n");
      out.write("         var str3 = [\"Hey, you!!<br>_Don't be hesitate,<br>_Right Now Start!!\"];\r\n");
      out.write("         \r\n");
      out.write("          $('.type_text').typeIt({\r\n");
      out.write("                  strings:str1,\r\n");
      out.write("                  html:true,\r\n");
      out.write("                  autoStart:true,\r\n");
      out.write("                  loop:true,\r\n");
      out.write("                  typeSpeed:100\r\n");
      out.write("               })\r\n");
      out.write("               .tiPause(1500)\r\n");
      out.write("               .tiDelete(130)\r\n");
      out.write("               .tiType(str2)\r\n");
      out.write("               .tiPause(1700)\r\n");
      out.write("               .tiDelete(130)\r\n");
      out.write("               .tiType(str3)\r\n");
      out.write("               .tiPause(1700)\r\n");
      out.write("               .tiEmpty(); \r\n");
      out.write("      })\r\n");
      out.write("   </script>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
