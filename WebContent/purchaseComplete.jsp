<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>決済完了しました</title>
</head>
<body>
<jsp:include page="include_header.jsp" />

決済が完了しました。



<a href='<s:url action="MyPageAction" />'>マイページに戻る</a>
	<br>
<a href='<s:url action="HomeAction" />'>ホームに戻る</a>

	<jsp:include page="include_footer.jsp" />
</body>
</html>