<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jquery ajax</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script src="http://code.jquery.com/jquery-1.9.1.js"
	type="text/javascript"></script>
<script language="javascript">
	$(function() {
		$('.sumbit').click(
				function() {
					if ($('#account').val().length == 0) {
						$('.hint').text("The account is cant't be null").css({
							"color" : "red",
							"background-color" : "yellow"
						});
					} else {
						$.post("jqueryAjax", "account=" + $('#account').val(),
								function(data) {
									$('.hint').text(data).css({
										"color" : "red",
										"background-color" : "yellow"
									});
								})
					}
				});
	});
</script>
</head>

<body>
	<h3 align="center">jquery Ajax</h3>
	<hr>
	<label>Please input user name:</label>
	<input id="account" name="account" type="text">
	<input class="sumbit" type="button" value="Submit User Name">
	<div class="hint"></div>
</body>
</html>
