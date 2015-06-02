<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CH">
<head>
<meta charset="utf-8">
<title>猫的周末--登陆</title>
<jsp:include page="head.jsp"></jsp:include>
</head>
<body>
	<div class="container">
		<div class="row loginBox border-all">
			<form class="form" id="form1" name="form1"
				method="post">
				<h4 class="tmiddle mt">欢迎登陆猫的周末</h4>
				<div class="tmiddle">
					<span id="err_msg" class="error-msg"></span>
				</div>
				<div class="form-group">
					<label class="control-label">用户名</label>
					<div>
						<input type="text" class="form-control" id="usr" name="userName"
							placeholder="输入用户名">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label">密&nbsp;&nbsp;&nbsp;码</label>
					<div>
						<input type="password" class="form-control" id="psw"
							name="password" placeholder="输入密码">
							<a class="a-link" href="javascript:void();">忘记密码？</a>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label"></label>
					<div>
						<input class="btn btn-primary btn-width-100" type="button"
							id="login" value="登陆"><span class="pdl">还没有账号？<a
							class="a-link" href="/reg">快速注册</a></span>
					</div>
				</div>
			</form>
		</div>
	</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>