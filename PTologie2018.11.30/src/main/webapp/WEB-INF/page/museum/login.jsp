<%@page language="java" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/page/museum/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>博物馆管理系统</title>
</head>
<script type="text/javascript">
	//初始化页面时验证是否记住了密码 
	$(document).ready(function() {
		if ($.cookie("rmbUser") == "true") {
			$("#rmbUser").attr("checked", true);
			$("#login_id").val($.cookie("userName"));
			$("#password").val($.cookie("passWord"));
		}
	});
	function qinkong() {
		
		$("#password_errors").html("");
		$("#login_id_errors").html("");
		 $("#login_id").val("");
		$("#password").val(""); 
	};
	//保存用户信息 
	function saveUserInfo() {
		if ($("#rmbUser").attr("checked") == "checked") {
			//alert("333");
			var userName = $("#login_id").val();
			//alert($("input[name='login_id']").val());
			var passWord = $("#password").val();
			$.cookie("rmbUser", "true", {
				expires : 7
			}); // 存储一个带7天期限的 cookie 
			$.cookie("userName", userName, {
				expires : 7
			}); // 存储一个带7天期限的 cookie 
			$.cookie("passWord", passWord, {
				expires : 7
			}); // 存储一个带7天期限的 cookie 
		} else {
			$.cookie("rmbUser", "false", {
				expires : -1
			});
			$.cookie("userName", '', {
				expires : -1
			});
			$.cookie("passWord", '', {
				expires : -1
			});
		}
	}

	if (window.parent != window) {
		window.top.location.href = location.href;
	};
	$(function() {
		$("#password").bind('keypress', function(event) {
			if (event.keyCode == "13") {
				login();
			}
		});
	});

	function login() {

		$("#password_errors").html("");
		$("#login_id_errors").html("");
		var loginid = $("#login_id").val();
		var password = $("#password").val();
		if (loginid == "") {
			$("#login_id_errors").html("用户名不能为空!");
			return false;
		}
		if (password == "") {
			$("#password_errors").html("密码不能为空!");
			return false;
		}

	/* 	saveUserInfo(); */
		form1.action = "${webPath}/loginUser/userLogin.do";
		form1.submit();
	};
</script>
<body class="login_body">
	<table class="toptab" id="toptab">
		<tr>
			<td><div class="logo_div"></div></td>
			<td class="title_td"></td>
			<td><div class="left_div"></div></td>
		</tr>
	</table>
	<div class='center_out'>
		<div class="center" id="center">
			<div class="background">
				<form:form name="form1" method="post" action="" commandName="user">
					<table class="loginTab">
						<tr>
							<td><div class="user_pic"></div> <input type="text" name="login_id" id="login_id" class="login_input" /></td>
						</tr>
						<tr>
							<td id="login_id_errors" class="err_msg"><form:errors path="login_id" /></td>
						</tr>
						<tr>
							<td><div class="pas_pic"></div> <input type="password" name="password"   id="password" class="login_input" /></td>
						</tr>
						<tr>
							<td id="password_errors" class="err_msg"><form:errors path="password" /></td>
						</tr>
						<tr>
							<td><input type="button"  class="login_bun" onclick="login()" /></td>
						</tr>
						<tr>
							<td><input type="button"  class="clear_bun" onclick="qinkong()" /></td>
						</tr>
						<tr>
							<td><input type="checkbox" id="rmbUser"> 记住用户</td>
						</tr>
					</table>
				</form:form>
			</div>
			<div class="mainpic"></div>
		</div>
	</div>
	<div class='line1_div' id="line_div"></div>
	<div class='foot_out' id="foot_out">
		<div class="foot"><a href="${webPath}/WEB-INF/page/museumhome.jsp" target="_blank">版权信息</a></div>
	</div>
</body>
<script language="javascript">
	$("#center").height($(window).height() - $("#toptab").height() - $("#foot_out").height());
	$(window).resize(function() {
		$("#center").height($(window).height() - $("#toptab").height() - $("#foot_out").height());
	});
	if("${msg}"!="")
		$("#login_id_errors").html("${msg}");
</script>
</html>