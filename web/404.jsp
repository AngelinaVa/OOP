<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%
                                                        String message=(String)request.getAttribute("alertMsg");
%> 
<!DOCTYPE html>
<html>

        <head>
            <title>Расписание автобусов</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        </head>

        <body>

            <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div>
                        <a class="navbar-brand" href="new"/> Расписание автобусов на пригородные рейсы </a>
                    </div>
                </nav>
            </header>
            
    <body>
        <div class="row">
      
                <div class="container">
                    <h3 class="text-center">Ошибка  </h3>
                   
                    <p>Такой страницы не существует</p>
             
         <p> <%= message %></p>
         
         
         
   
         
             <td><a href="new"/>На главную страницу</a> </td>
        
        
    </body>
</html>
