<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%
    String message=(String)request.getAttribute("alertMsg");        
    String message1=(String)request.getAttribute("alertMsg1");  
String message2=(String)request.getAttribute("alertMsg2");  
String message3=(String)request.getAttribute("alertMsg3");  
String message4=(String)request.getAttribute("alertMsg4");  


   
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
                    <h3 class="text-center">Информация о покупке билетов </h3>
                    
                      <h6 class="text-left"> <%= message %>  </h6>
                       <h6 class="text-left"> <%= message1 %>  </h6>
                        <h6 class="text-left"> <%= message2 %>  </h6>
                         <h6 class="text-left"> <%= message3 %>  </h6>
                          <h6 class="text-left"> <%= message4 %>  </h6>
                   
             
      
         
   
         
             <td><a href="new"/>На главную страницу</a> </td>
        
        
    </body>
</html>
