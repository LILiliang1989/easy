<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!-- Fixed navbar -->
<header>
<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">猫的周末</span> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">猫的周末</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li><a href="/zl">专栏</a></li>
				<li><a href="/pd">频道</a></li>
			 <li><a href="/hd">活动</a></li>
			</ul>
			<!--向右对齐-->
      <ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-expanded="false">欢迎您，{$_SESSION['cur_user']}
						<span class="caret"></span>
				</a>
					<ul class="dropdown-menu" role="menu">
						<li><a href="/user/">发布文章</a></li>
						<li class="divider"></li>
						<li class="dropdown-header">账号管理</li>
						<li><a href="/user/updatePSW">修改密码</a></li>
						<li><a href="/logout">退出</a></li>
					</ul></li>	
				<li><a href="/login">登陆</a></li>
				<li><a href="/rigister">注册</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-expanded="false">消息
				</a>
					<ul class="dropdown-menu" role="menu">
						<li><a href="/message/sx">我的私信</a></li>
						<li><a href="/message/pl">我的评论</a></li>
						<li><a href="/message/xttz">系统通知</a></li>
					</ul></li>
            </ul>
		</div>
		<!--/.nav-collapse -->
	</div>
</nav>
</header>
