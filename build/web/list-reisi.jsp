<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
            <br>
 <div class="row">
                <div class="container">
                    <h3 class="text-center">Расписание автобусов</h3>
                 <hr>
                    <div class="container text-left">
             <form action="search">
                      <fieldset class="form-group">
                            <label>Поиск по номеру рейса</label> 
                         <input type="text" class="form-control" required="true"  pattern="^[ 0-9]+$"  title="Значения от 0 до 9" name="id"/>
                        </fieldset>
                     <button type="submit" class="btn btn-success">Найти</button>  
                     </form>
                  <form action="search">
                          <p>  
                     <fieldset class="form-group">
                       
                     <input name ="sort" type="submit" value="Отсортировать по номеру рейса" class="btn btn-success" />  
                       </fieldset>
                          </p>
                    </form>
       </div>
                <br>
                    <table  id="table"
                    class="table table-bordered">
                        <thead>
                            <tr>
                <th >Номер рейса</th>
                <th >Маршрут</th>
                <th >Дата отправления</th>
                <th >Время отправления</th>
                <th >Время прибития</th>
                <th >Стоимость</th>
                <th >Кол-во билетов</th>
                <th>Опция</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="reisi" items="${listReisi}">
                                <tr>
                                    <td>
                                       <c:out value="${reisi.nomerReisa}" />
                                    </td>
                                    <td>
                                        <c:out value="${reisi.mapshryt}" />
                                    </td>
                                    <td>
                                        <c:out value="${reisi.dateOtprav}" />
                                    </td>
                                     <td>
                                        <c:out value="${reisi.timeOtpravl}" />
                                    </td>
                                    <td>
                                        <c:out value="${reisi.timePribit}" />
                                    </td>
                                    <td>
                                        <c:out value="${reisi.stoimost}" />
                                    </td>
                                    <td>
                                        <c:out value="${reisi.kolVoBil}" />
                                    </td>
                                    <td><a href="edit?idPaspisanit=<c:out value='${reisi.idPaspisanit}' />">Купить</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </body>
        </html>