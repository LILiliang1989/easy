<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CH">
<head>
<meta charset="utf-8">
<title>猫的周末--注册</title>
<jsp:include page="head.jsp"></jsp:include>
</head>
<body>
	<div class="container">
		<div class="row regBox border-all">
			<form class="form" id="form1" name="form1"
				method="post">
				<span class="fr mt pdr">已有账号？<a class="a-link" href="/login">去登陆</a></span>
				<h4 class="tmiddle mt">欢迎注册猫的周末</h4>
				<div class="form-group">
					<label class="control-label">用户名</label>
					<div>
						<input type="text" class="form-control" name="userName" id="username"
							placeholder="手机/邮箱">
					</div>
					<div>
						<span id="usr_msg" class="error-msg">（必填，请选择手机邮箱作为用户名）</span>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label">密码</label>
					<div>
						<input type="password" class="form-control" id="password" name="password"
							placeholder="密码">
					</div>
					<div>
						<span id="ps_msg" class="error-msg">（必填，用户名为6-16位字符）</span>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label">确认密码</label>
					<div>
						<input type="password" class="form-control"
							id="repassword" name="repassword" placeholder="确认密码">
					</div>
					<div>
						<span id="rps_msg" class="error-msg">（必填，用户名为6-16位字符）</span>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label">验证码</label>
					<div>
						<input type="text" class="form-control" id="code" name="code"
							placeholder="验证码">
					</div>
					<div>
						<span id="yzm_msg" class="error-msg">（必填）</span>
					</div>
				</div>
				<div class="form-group">
						<img id="verifyImg" src='/ImageAction' width="100" height="30"
							onclick="document.getElementById('verifyImg').src = '/ImageAction_?time='+(new Date()).getTime()" title="点击刷新验证码" /><a href="#"
							onclick="document.getElementById('verifyImg').src = '/ImageAction_?time='+(new Date()).getTime()">看不清，点击换一个</a>
						<p>
							注册前请认真阅读本网站的《<a class="a-link" href="#">服务条款</a>》！
						</p>
				</div>
					<div class="col-sm-6">
						<input class="btn btn-primary btn-width-100" type="button"
							id="reg" value="注册">
					</div>

			</form>
		</div>
	</div>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>