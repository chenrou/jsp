<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>突然情况</title>
</head>
<body>
<jsp:useBean id="status" class="jsp2.Status" scope="session"/>
<h1>这不是演习，这是真的</h1>
<form action="showInfo.jsp" method="post">
<%

String test=status.getzhuangtai().get(0);
ArrayList<String> xuanxiang=status.getTimu().get(test);

out.println("<h1>"+test+"应该怎么回答？。。。想清楚！</h1>");

//显示出所有选项
for(int i=0;i<4;i++){
	String neirong=xuanxiang.get(i);
	String num=String.valueOf(i);
	out.print("<p><input type='radio' name='phone' value='+"+num+"'>"+neirong+"</input></p>");
}

%>
<button>提交</button>
</form>

</body>
</html>