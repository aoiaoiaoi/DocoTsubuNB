
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.User" %>
<%
    User loginUser = (User)session.getAttribute("loginUser");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>どこつぶ loginResult.jsp</title>
    </head>
    <body>
        <h1>どこつぶログイン</h1>
        <% if(loginUser != null) { %>
            <p> ログインに成功しました </p>
            <p> ようこそ <%= loginUser.getName() %> さん </p>
            <a href="/docoTsubu/Main"> つぶやき投稿・閲覧へ </a>
        <% } else { %>
        <p> ログインに失敗しました </p>
            <a href="/docoTsubu/"> TOPへ </a>
        <% } %>
    </body>
</html>
