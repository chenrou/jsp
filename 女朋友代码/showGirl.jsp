<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="jsp2.GirlFriend"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>展示女朋友页面</title>
</head>
<body>
<!-- 初始化女朋友 -->
<jsp:useBean id="myGirlFriend" class="jsp2.GirlFriend" scope="session"/>
<!-- 一次填入，再无烦恼 
-->
<jsp:setProperty property="*" name="myGirlFriend"/>

<!-- 将刚才填入的值，设置到女朋友内。
<jsp:setProperty name="myGirlFriend" property="yanZhi"/>
<jsp:setProperty name="myGirlFriend" property="tiZhong"/>
<jsp:setProperty name="myGirlFriend" property="shenGao"/>
<jsp:setProperty name="myGirlFriend" property="shengQi"/>
<jsp:setProperty name="myGirlFriend" property="ai"/>
 -->
 
<p>女朋友的颜值：<jsp:getProperty property="yanZhi" name="myGirlFriend"/>分</p>
<p>女朋友的体重：<jsp:getProperty property="tiZhong" name="myGirlFriend"/>kg</p>
<p>女朋友的身高：<jsp:getProperty property="shenGao" name="myGirlFriend"/>cm</p>
<p>女朋友的怒值：<jsp:getProperty property="shengQi" name="myGirlFriend"/></p>
<p>女朋友的爱值：<jsp:getProperty property="ai" name="myGirlFriend"/></p>
<p><a href="status.jsp">开始测试咯！</a></p>

</body>
</html>