<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Custom fonts for this template -->
<link rel="stylesheet" href="../resources/css/all.css"/>
<link
    href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
    rel="stylesheet">
<!-- Custom styles for this template -->
<link rel="stylesheet" href="../resources/css/sb-admin-2.css"/>

<link rel="stylesheet" href="../resources/css/dataTables.bootstrap4.css"/>
<script type="text/javascript" src="../resources/js/write.js"></script>
<title>게시판 글 작성</title>
</head>
<body>
	<div class="form-group row">
		<div class="col-sm-12 mb-3 mb-sm-0">
			${detail.title}
		</div>
		<div class="col-sm-12 mb-3 mb-sm-0">
			${detail.content}
		</div>
		<span>
			<a href="/board/modify?bno=${detail.bno}"><input type="submit" value="수정" class="btn btn-primary"></a>
		</span>
		<span>
			<a href="/board/remove?bno=${detail.bno}"><input type="submit" value="삭제" class="btn btn-primary"></a>
		</span>
	</div>
</body>
</html>