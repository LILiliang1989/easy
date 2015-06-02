<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>猫的周末</title>
<jsp:include page="head.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="top.jsp"></jsp:include>
	<div class="container theme-showcase" role="main">
		<div class="row mt">
			<div class="col-sm-9">
				<div class="col-sm-6">
					<div class="panel panel-default">
						<div class="author-info">
							<div class="info-img">
								<img alt="头像" src="/Public/images/ad02.jpg" />
							</div>
							<div class="info-detail">
								<div class="nick-name">
									<a href="{:U('index/page')}" title="扯法律几个蛋">扯法律几个蛋</a>
								</div>
								<div class="desc">见习律师孙果冻</div>
								<div class="related-info">
									文章<span><a href="{:U('index/page')}">[200]</a></span>
								</div>
							</div>
						</div>
						<div class="art-list">
							<ul>
								<li><a href="{:U('index/page')}">连硕科技成立机器人职教中心，欲填补机器人职教缺口</a></li>
								<li><a href="{:U('index/page')}">连硕科技成立机器人职教中心，欲填补机器人职教缺口</a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="panel panel-default">
						<div class="author-info">
							<div class="info-img">
								<img alt="头像" src="/Public/images/ad02.jpg" />
							</div>
							<div class="info-detail">
								<div class="nick-name">
									<a href="{:U('index/page')}" title="扯法律几个蛋">扯法律几个蛋</a>
								</div>
								<div class="desc">见习律师孙果冻</div>
								<div class="related-info">
									文章<span><a href="{:U('index/page')}">[200]</a></span>
								</div>
							</div>
						</div>
						<div class="art-list">
							<ul>
								<li><a href="{:U('index/page')}">连硕科技成立机器人职教中心，欲填补机器人职教缺口</a></li>
								<li><a href="{:U('index/page')}">连硕科技成立机器人职教中心，欲填补机器人职教缺口</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			<jsp:include page="right-side.jsp"></jsp:include>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>