<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- for문을 사용하기 위한 태그 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../resources/css/sb-admin-2.css">
    <link rel="stylesheet" type="text/css" href="../resources/css/all.css">
    <link rel="stylesheet" href="../resources/css/dataTables.bootstrap4.css">
    <!-- Custom styles for this page -->
    
<title>게시판 목록</title>
</head>
<body>
<!-- DataTales Example -->
 <div class="card shadow mb-4">
     <div class="card-header py-3">
         <h6 class="m-0 font-weight-bold text-primary">게시판 목록</h6>
     </div>
     <div class="card-body">
         <div class="table-responsive">
             <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                 <thead>
                     <tr>
                         <th>번호</th>
                         <th>제목</th>
                         <th>작성자</th>
                         <th>작성일</th>
                         <th>조회수</th>
                         <th>좋아요</th>
                     </tr>
                 </thead>
                 <tbody>
                 	<c:forEach items="${list}" var="board">
                     <tr>
                         <td>${board.bno}</td>
                         <td><a href="/board/detail?bno=${board.bno}">${board.title}</a></td>
                         <td>${board.writer}</td>
                         <td>${board.regdate}</td>
                         <td>${board.cnt}</td>
                         <td>${board.good}</td>
                     </tr>
                     </c:forEach>
                 </tbody>
             </table>
         </div>
     </div>
 </div>
</body>
</html>