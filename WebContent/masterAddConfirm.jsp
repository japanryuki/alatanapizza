<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta name="description" content=""/>
	<meta name="keywords" content=""/>
	<title>追加商品確認</title>
</head>
<style type="text/css">

</style>
	<body>

	<jsp:include page="include_header.jsp" />


		<div class="titleName">
			<h2>新商品追加確認画面</h2>
		</div>

		<div class="confirm">
			<h3>以下の商品を新しく追加します。よろしいですか？</h3>
		</div>

		<div class="main">//商品
						<s:form action="MasterAddCompleteAction">
								<br>商品名:
								<s:property value="itemName" />
								<br>
								<br>
								<br>ふりがな:
								<s:property value="itemKanaName"/>
								<br>
								<br>
								<br>個数:
								<s:property value="itemStock"/>
								<br>
								<br>価格:
								<s:property value="itemPrice"/>
								<br>
								<s:submit value="登録する"/>
								<input type="hidden" name="itemName" value="<s:property value="itemName"/>"/>
								<input type="hidden" name="itemKanaName" value="<s:property value="itemKanaName"/>">
								<input type="hidden" name="itemStock" value="<s:property value="itemStock"/>">
								<input type="hidden" name="itemPrice" value="<s:property value="itemPrice"/>">
								<input type="hidden" name="imageName" value="<s:property value="imageName"/>">
							</s:form>

							<div class="back">
								<a href="MasterAdd.jsp">戻 る</a>
							</div>
		</div>



	<jsp:include page="include_footer.jsp" />

	</body>
</html>