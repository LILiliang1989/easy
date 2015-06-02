<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>猫的周末--消息提示</title>
<jsp:include page="head.jsp"></jsp:include>
</head>
<body>
<jsp:include page="top.jsp"></jsp:include>
	<div class="container">
		<div class="row">
			<div class="alert alert-warning" id="alert">
				<h4>消息提示!</h4>
				<p>
					<strong>${msg}</strong>
				</p>
				<p>
					<strong>提醒!</strong>如果长时间没有跳转，请点击<a id="href" href="${url}"
						style="color: #00b6f4">跳转</a><b id="wait">5</b>秒!
				</p>
			</div>
		</div>
		<!-- /.row -->
	</div>
	<!-- /.container -->
<jsp:include page="footer.jsp"></jsp:include>
	<script type="text/javascript">
	var t=3;//设定跳转的时间 
	setInterval("refer()",1000); //启动1秒定时 
	function refer(){  
	   if(t==0){ 
	       location=document.getElementById('href').href;
	 } 
	  document.getElementById('wait').innerHTML=" "+t;
	 t--; 
	} 
	</script>
</body>
</html>