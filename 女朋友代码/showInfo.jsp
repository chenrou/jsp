<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="jsp2.GirlFriend"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>接受考验吧</title>
</head>
<body>
<%
GirlFriend gf=(GirlFriend)session.getAttribute("myGirlFriend");
String phone=request.getParameter("phone");

int shengqi=gf.getShengQi();
int ai=gf.getAi();

if(phone.equals("0")){
	shengqi=shengqi+10;
}else if(phone.equals("1")){
	shengqi=shengqi+30;
}else if(phone.equals("2")){
	ai=ai+20;
}else{
	ai=ai+10;
	shengqi=shengqi+10;
	gf.setShengQi(shengqi);
	gf.setAi(ai);
	
	if(gf.getShengQi()>20){
		out.print("<h1>恭喜你，你go die了</h1>");
	}else{
		out.print("<h1>小心，你女朋友怒气已经达到"+gf.getShengQi()+"</h1>");
		
		if(gf.getAi()>30){
			out.print("<h1>哎哟，不错哟，你女朋友还是蛮喜欢你的</h1>");
		}
		out.print("<p><a href='status.jsp'>继续测试</a></p>");
	}
	if(gf.getAi()>100){
		out.print("<h1>恭喜你们可以步入殿堂</h1>");
	}
}
%>
</body>
</html>