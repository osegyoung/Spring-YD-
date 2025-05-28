<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">Board Modify</h1>
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->

	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">

				<div class="panel-heading">Board Modify</div>
				<!-- /.panel-heading -->
				<div class="panel-body">
					<form role="form" action="<c:url value="/board/modify"/>" method="post"><!-- 경로 설정 주의! 다 적든지 register만 적든지 -->
					<input type="hidden" name="bno" value="${board.bno}"/>
						<div class="form-group">
							<label>Title</label> <input class="form-control" name='title' value="${board.title}">
						</div>
						<div class="form-group">
						<label>Text area</label>
						<textarea class="form-control" rows="2" name="content">${board.content}</textarea>
						</div>	
						
						<div class="form-group">
						<label>Writer</label> <input class="form-control" name="writer" value="${board.writer}">
						</div>
						<button type="submit class="btn btn-default">Submit Button</button>
						<button type="reset class="btn btn-default">Reset Button</button>
					</form>
				</div>
				<!-- end panel-body -->
			</div>
			<!-- end panel-body -->
		</div>
		<!-- end panel -->
		</div>
		<!-- /.row -->
		
</body>
</html>