/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.55
 * Generated at: 2020-08-05 08:12:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1595232634000L));
    _jspx_dependants.put("jar:file:/C:/kh/spring/workspace/dev/apache-tomcat-8.5.55/webapps/realSpringProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

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
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Home</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!-- home.jsp의 상대 위치 -->\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/menubar.jsp", out, false);
      out.write("\n");
      out.write("\t\n");
      out.write("\t<!-- ajax 이후에 작업한 부분 -->\n");
      out.write("\t\n");
      out.write("\t<h1 align=\"center\">게시글 TOP5 목록</h1>\n");
      out.write("\t<table align=\"center\" border=\"1\" cellspacing=\"0\" width=\"700\" id=\"tb\">\n");
      out.write("\t\t<thead>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th>번호</th>\n");
      out.write("\t\t\t\t<th>제목</th>\n");
      out.write("\t\t\t\t<th>작성자</th>\n");
      out.write("\t\t\t\t<th>날짜</th>\n");
      out.write("\t\t\t\t<th>조회수</th>\n");
      out.write("\t\t\t\t<th>첨부파일</th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</thead>\n");
      out.write("\t\t<tbody>\n");
      out.write("\t\t\n");
      out.write("\t\t</tbody>\n");
      out.write("\t</table>\n");
      out.write("\t\n");
      out.write("\t<script>\n");
      out.write("\t\tfunction topList(){\n");
      out.write("\t\t\t// ajax관련 코드\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl:\"topList.do\",\t// BoardController에 boardTopList() 메소드 만들자\n");
      out.write("\t\t\t\tdataType:\"json\",\n");
      out.write("\t\t\t\tsuccess:function(data){\n");
      out.write("\t\t\t\t\t$tableBody = $(\"#tb tbody\");\n");
      out.write("\t\t\t\t\t$tableBody.html(\"\");\t// tbody 부분 리셋\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t// 1번 방법(Stream 사용했을 시)\n");
      out.write("\t\t\t\t\t/* for(var i in data.list){\n");
      out.write("\t\t\t\t\t\tvar $tr = $(\"<tr>\");\n");
      out.write("\t\t\t\t\t\tvar $bId = $(\"<td>\").text(data.list[i].bId);\n");
      out.write("\t\t\t\t\t\tvar $bTitle = $(\"<td>\").text(data.list[i].bTitle);\n");
      out.write("\t\t\t\t\t\tvar $bWriter = $(\"<td>\").text(data.list[i].bWriter);\n");
      out.write("\t\t\t\t\t\tvar $bCreateDate = $(\"<td>\").text(data.list[i].bCreateDate);\n");
      out.write("\t\t\t\t\t\tvar $bCount = $(\"<td>\").text(data.list[i].bCount);\n");
      out.write("\t\t\t\t\t\tvar $bFile = $(\"<td>\").text(\" \");\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\tif(data.list[i].originalFileName != null){\n");
      out.write("\t\t\t\t\t\t\t$bFile = $(\"<td>\").text(\"★\");\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t$tr.append($bId);\n");
      out.write("\t\t\t\t\t\t$tr.append($bTitle);\n");
      out.write("\t\t\t\t\t\t$tr.append($bWriter);\n");
      out.write("\t\t\t\t\t\t$tr.append($bCreateDate);\n");
      out.write("\t\t\t\t\t\t$tr.append($bCount);\n");
      out.write("\t\t\t\t\t\t$tr.append($bFile);\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t$tableBody.append($tr);\n");
      out.write("\t\t\t\t\t} */\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t// 2번 방법(GSON을 사용한 방법)\n");
      out.write("\t\t\t\t\tfor(var i in data){\n");
      out.write("\t\t\t\t\t\tvar $tr = $(\"<tr>\");\n");
      out.write("\t\t\t\t\t\tvar $bId = $(\"<td>\").text(data[i].bId);\n");
      out.write("\t\t\t\t\t\tvar $bTitle = $(\"<td>\").text(data[i].bTitle);\n");
      out.write("\t\t\t\t\t\tvar $bWriter = $(\"<td>\").text(data[i].bWriter);\n");
      out.write("\t\t\t\t\t\tvar $bCreateDate = $(\"<td>\").text(data[i].bCreateDate);\n");
      out.write("\t\t\t\t\t\tvar $bCount = $(\"<td>\").text(data[i].bCount);\n");
      out.write("\t\t\t\t\t\tvar $bFile = $(\"<td>\").text(\" \");\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\tif(data[i].originalFileName != null){\n");
      out.write("\t\t\t\t\t\t\t$bFile = $(\"<td>\").text(\"★\");\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t$tr.append($bId);\n");
      out.write("\t\t\t\t\t\t$tr.append($bTitle);\n");
      out.write("\t\t\t\t\t\t$tr.append($bWriter);\n");
      out.write("\t\t\t\t\t\t$tr.append($bCreateDate);\n");
      out.write("\t\t\t\t\t\t$tr.append($bCount);\n");
      out.write("\t\t\t\t\t\t$tr.append($bFile);\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t$tableBody.append($tr);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\terror:function(request, status, errorData){\n");
      out.write("                    alert(\"error code: \" + request.status + \"\\n\"\n");
      out.write("                          +\"message: \" + request.responseText\n");
      out.write("                          +\"error: \" + errorData);\n");
      out.write("               }\n");
      out.write("\t\t\t})\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t$(function(){\n");
      out.write("\t\t\ttopList();\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tsetInterval(function(){\n");
      out.write("\t\t\t\ttopList();\t\n");
      out.write("\t\t\t}, 5000);\n");
      out.write("\t\t\t// setinterval을 바로 적용하면 에러 발생. ajax 완료 후 쓰기\n");
      out.write("\t\t})\n");
      out.write("\t\t\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
