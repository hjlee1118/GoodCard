/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.45
 * Generated at: 2017-09-11 08:01:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/Users/USER/Desktop/GoodCard/eclipse-work/wtpwebapps/GoodCard/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.9.RELEASE.jar", Long.valueOf(1503897389200L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1503897430255L));
    _jspx_dependants.put("jar:file:/C:/Users/USER/Desktop/GoodCard/eclipse-work/wtpwebapps/GoodCard/WEB-INF/lib/spring-webmvc-4.3.9.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1496830342000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap core CSS -->\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/bootstrap/vendor/bootstrap/css/bootstrap.min.css?ver=2\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/custom/css/main.css?ver=2\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/custom/css/topMenu.css?ver=2\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/custom/css/cleardiv.css?ver=2\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<!-- Custom fonts for this template -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/bootstrap/vendor/font-awesome/css/font-awesome.min.css?ver=2\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link\r\n");
      out.write("\thref='https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<link\r\n");
      out.write("\thref='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("\r\n");
      out.write("<!-- Custom styles for this template -->\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/bootstrap/css/clean-blog.min.css?ver=2\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/bootstrap/css/main.css?ver=2\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/custom/css/pollForm.css?ver=2\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Script File -->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/custom/js/jquery-3.2.1.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/custom/js/jquery-3.2.1.min.js\"></script>");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("function go_join_form() {\r\n");
      out.write("\tlocation.replace(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/join.do\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tfunction checkForm() {\r\n");
      out.write("\r\n");
      out.write("\t\tvar lists = $('#joinForm').find('input');\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfor (var i = 2; i < 10; i++) {\r\n");
      out.write("\t\t\tif ($(lists[i]).val() == \"\") {\r\n");
      out.write("\t\t\t\t$(lists[i]).focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tvar currentId = $('#inputId').val();\r\n");
      out.write("\r\n");
      out.write("\t\tif (idCheck(currentId) && passwordForm() && passwordCheckForm()\r\n");
      out.write("\t\t\t\t&& isValidEmailAddress()) {\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (!$('input:radio[name=type]').is(':checked')) {\r\n");
      out.write("\t\t\t\talert('회원 유형을 선택해 주세요.')\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$('#loginButton').click(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (!checkForm()) {\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t})\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#loginButton {\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("\tbackground: black;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("\tfont-family: 'Noto Sans KR', serif;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\twidth: 14%;\r\n");
      out.write("\tmargin-right: 1%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#joinButton {\r\n");
      out.write("\tborder: 1px solid #333;\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\tbackground: white;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("\tfont-family: 'Noto Sans KR', serif;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\twidth: 14%;\r\n");
      out.write("\tmargin-left: 1%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".check-id-button{\r\n");
      out.write("\tborder : 1px solid #333;\r\n");
      out.write("\tcolor : black;\r\n");
      out.write("\tbackground : white;\r\n");
      out.write("\tpadding : 3px;\r\n");
      out.write("\tfont-family: 'Noto Sans KR', serif;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".custom-join-input-value{\r\n");
      out.write("\twidth: 30%;\r\n");
      out.write("\tborder : 0;\r\n");
      out.write("\tborder-bottom: 1px solid #333;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".custom-join-input-value-3{\r\n");
      out.write("\twidth: 8.5%;\r\n");
      out.write("\tborder : 0;\r\n");
      out.write("\tborder-bottom: 1px solid #333;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 인풋 */\r\n");
      out.write("input[type=radio] {display:none;}\r\n");
      out.write(".radio-label {\r\n");
      out.write("  display:inline-block;\r\n");
      out.write("  width:14%;\r\n");
      out.write("  height:30px;\r\n");
      out.write("  padding:0 20px;\r\n");
      out.write("  border:1px solid rgba(0,0,0,0.08);\r\n");
      out.write("  margin-right:20px;\r\n");
      out.write("  line-height:30px;\r\n");
      out.write("  cursor:pointer;\r\n");
      out.write("  -webkit-transition: all 0.3s ease-out;\r\n");
      out.write("  -moz-transition: all 0.3s ease-out;\r\n");
      out.write("  -ms-transition: all 0.3s ease-out;\r\n");
      out.write("  -o-transition: all 0.3s ease-out;\r\n");
      out.write("  transition: all 0.3s ease-out;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".radio-label i {\r\n");
      out.write("  margin-right:10px;\r\n");
      out.write("  opacity: 0;\r\n");
      out.write("  -webkit-transition: opacity 0.3s ease-out;\r\n");
      out.write("  -moz-transition: opacity 0.3s ease-out;\r\n");
      out.write("  -ms-transition: opacity 0.3s ease-out;\r\n");
      out.write("  -o-transition: opacity 0.3s ease-out;\r\n");
      out.write("  transition: opacity 0.3s ease-out;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".radio:checked + .radio-label {background:rgba(4, 120, 193,0.1);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".radio:checked + .radio-label i { opacity: 1;}\r\n");
      out.write("\r\n");
      out.write(".radio + .radio-label span {\r\n");
      out.write("    display:inline-block;\r\n");
      out.write("    font-size:15px;\r\n");
      out.write("    -webkit-transition: all 0.3s ease-out;\r\n");
      out.write("    -moz-transition: all 0.3s ease-out;\r\n");
      out.write("    -ms-transition: all 0.3s ease-out;\r\n");
      out.write("    -o-transition: all 0.3s ease-out;\r\n");
      out.write("    transition: all 0.3s ease-out;\r\n");
      out.write("  -webkit-transform:translateX(-13px);\r\n");
      out.write("  -moz-transform:translateX(-13px);\r\n");
      out.write("  -ms-transform:translateX(-13px);\r\n");
      out.write("  -o-transform:translateX(-13px);\r\n");
      out.write("  transform:translateX(-13px);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".radio:checked + .radio-label span {\r\n");
      out.write("  -webkit-transform:translateX(0);\r\n");
      out.write("  -moz-transform:translateX(0);\r\n");
      out.write("  -ms-transform:translateX(0);\r\n");
      out.write("  -o-transform:translateX(0);\r\n");
      out.write("  transform:translateX(0);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("select {\r\n");
      out.write("    width: 200px;\r\n");
      out.write("    height: 30px;\r\n");
      out.write("    padding-left: 10px;\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    color: #333;\r\n");
      out.write("    border: 1px solid #E0E0E0;\r\n");
      out.write("    border-radius: 3px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#search #search-input, #search .hint {\r\n");
      out.write("    padding-left: 43px;\r\n");
      out.write("    padding-right: 43px;\r\n");
      out.write("    border-radius: 23px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".input-lg {\r\n");
      out.write("    height: 46px;\r\n");
      out.write("    padding: 10px 16px;\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    line-height: 1.3333333;\r\n");
      out.write("    border-radius: 6px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-control {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    width: 25%;\r\n");
      out.write("    height: 34px;\r\n");
      out.write("    padding: 6px 12px;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    line-height: 1.42857143;\r\n");
      out.write("    color: #555;\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    background-image: none;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,0.075);\r\n");
      out.write("    box-shadow: inset 0 1px 1px rgba(0,0,0,0.075);\r\n");
      out.write("    -webkit-transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s;\r\n");
      out.write("    -o-transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s;\r\n");
      out.write("    transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s;\r\n");
      out.write("}\r\n");
      out.write("site.css:5\r\n");
      out.write("input, button, select, textarea {\r\n");
      out.write("    font-family: inherit;\r\n");
      out.write("    font-size: inherit;\r\n");
      out.write("    line-height: inherit;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".custom-input-join-group-addon {\r\n");
      out.write("    padding: 6px 12px;\r\n");
      out.write("    font-weight: 400;\r\n");
      out.write("    line-height: 1;\r\n");
      out.write("    color: #555;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("    width: 200px;\r\n");
      out.write("    white-space: nowrap;\r\n");
      out.write("    vertical-align: middle;\r\n");
      out.write("    display: inline-table;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div#subMenu > a{\r\n");
      out.write("\tmargin: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div#subMENU{\r\n");
      out.write("\tfont-family: 'Noto Sans KR', serif;\r\n");
      out.write("\tfont-size: 10pt;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-main{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/jsp/include/topMenu.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<hr style=\"margin-top: 0px; margin-bottom: 5px; clear: both;\">\r\n");
      out.write("\t<div id=\"subMenu\" class=\"container\">\r\n");
      out.write("\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" style=\"margin:0\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">홈</a>><a>회원정보</a>><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/login.do\">로그인</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<hr style=\"margin-bottom: 0px; margin-top: 5px; clear: both;\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"login-main\">\r\n");
      out.write("\r\n");
      out.write("\t\t<section class=\"section-wrapper\"\r\n");
      out.write("\t\t\tstyle=\"padding-top: 100px; padding-bottom: 100px;\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div id=\"poll_title\" class=\"row\"\r\n");
      out.write("\t\t\t\t\tstyle=\"margin: 0px; text-align: center;\">\r\n");
      out.write("\t\t\t\t\t<b>로그인</b>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"color: gray;\">\r\n");
      out.write("\t\t\t\t\t기존 GoodCard 앱 계정으로 이용하실 수 있습니다.<br> \r\n");
      out.write("\t\t\t\t\t최상의 카드 추천 서비스를 제공해드립니다.Good Card <br>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"height: 30px; clear: both;\"></div>\r\n");
      out.write("\t\t\t\t<div style=\"height: 30px; clear: both;\"></div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<form id=\"joinForm\" method=\"post\"\r\n");
      out.write("\t\t\t\t\t\t\taction=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/login.do\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div style=\"width:100%\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"custom-input-join-group-addon\">회원 유형\r\n");
      out.write("\t\t\t\t\t\t</span>&nbsp; \r\n");
      out.write("\t\t\t\t\t\t<span class=\"wrap\">\r\n");
      out.write("\t\t\t\t\t\t<input name=\"type\" type=\"radio\" id=\"radio0\" class=\"radio\" value=\"U\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"radio0\" class=\"radio-label\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-check\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<span>개인</span>\r\n");
      out.write("\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t<input name=\"type\" type=\"radio\" id=\"radio1\" class=\"radio\" value=\"O\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"radio1\" class=\"radio-label\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-check\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<span>사업자</span>\r\n");
      out.write("\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"height: 20px; clear: both;\"></div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div style=\"width: 100%\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"custom-input-join-group-addon \"> 아이디 </span>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"inputId\" name=\"id\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"custom-join-input-value\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div style=\"height: 20px;  clear: both;\"></div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div style=\"width: 100%\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"custom-input-join-group-addon \"> 비밀번호 </span>\r\n");
      out.write("\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"password\" id=\"inputPassword\" name=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"custom-join-input-value\">\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div style=\"height: 20px; clear: both;\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div style=\"width: 100%\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"custom-input-join-group-addon \"> </span>\r\n");
      out.write("\t\t\t\t\t\t<input id=\"loginButton\" type=\"submit\" class=\"path_button\" value=\"로그인\">\r\n");
      out.write("\t\t\t\t\t\t<input id=\"joinButton\" type=\"button\" class=\"path_button\" onclick=\"go_join_form()\" value=\"회원가입\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div style=\"height: 50px; clear:both;\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/jsp/include/bottom.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Bootstrap core JavaScript -->\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/bootstrap/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/bootstrap/vendor/popper/popper.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/bootstrap/vendor/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Custom scripts for this template -->\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/bootstrap/js/clean-blog.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/jsp/member/loginForm.jsp(12,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("context");
      // /WEB-INF/jsp/member/loginForm.jsp(12,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/member/loginForm.jsp(12,0) '${pageContext.request.contextPath }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}