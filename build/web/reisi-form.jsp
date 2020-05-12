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
          <br>
            <div class="container col-md-3">
                <div class="card">
                    <div class="card-body">
                      <c:if test="${reisi != null}">
                            <form action="update" method="post">
                        </c:if>
                      
                        <caption>
                            <h2>
                                <c:if test="${reisi != null}">
                                    Покупка билетов 
                                </c:if>
                            </h2>
                        </caption>
                     <c:if test="${reisi != null}">
                            <input type="hidden" name="idPaspisanit"  value="<c:out value='${reisi.idPaspisanit}' />" />
                        </c:if>
                        
                      
                        <fieldset class="form-group">
                            <label>Номер рейса</label> <input type="text" readonly="true" value="<c:out value='${reisi.nomerReisa}' />" class="form-control" name="NomerReisa" required="required">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Маршрут</label> <input type="text" readonly="true" value="<c:out value='${reisi.mapshryt}' />" class="form-control" name="Mapshryt">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Дата отправления</label> <input type="text" readonly="true" value="<c:out value='${reisi.dateOtprav}' />" class="form-control" name="DateOtprav">
                        </fieldset>
                        
                        <fieldset class="form-group">
                            <label>Время отправления</label> <input type="text" readonly="true"  value="<c:out value='${reisi.timeOtpravl}' />" class="form-control" name="TimeOtpravl">
                        </fieldset>
                        
                        <fieldset class="form-group">
                            <label>Время прибытия</label> <input type="text"  readonly="true" value="<c:out value='${reisi.timePribit}' />" class="form-control" name="TimePribit">
                        </fieldset>
                        
                        <fieldset class="form-group">
                            <label>Стоимость билета</label> <input type="text" readonly="true" value="<c:out value='${reisi.stoimost}' />" class="form-control" name="Stoimost">
                        </fieldset>
                        
                        <fieldset class="form-group">
                            <label>Количество билетов</label> <input type="text" readonly="true"  value="<c:out value='${reisi.kolVoBil}' />" class="form-control" name="KolVoBil">
                        </fieldset>
                        
                         <fieldset class="form-group">
                           <input type="hidden" value="<c:out value='${reisi.kolVoOstBil}' />" class="form-control" name="KolVoOstBil">
                        </fieldset>
                        
                        <fieldset class="form-group">
                            <label>Выберите количество билетов</label>
                            <select id="selectID" name="selectID">
                                <option value="1">1</option>
                                 <option value="2">2</option>
                                  <option value="3">3</option>
                                   <option value="4">4</option>
                                    <option value="5">5</option>
                                     <option value="1000">1000</option>
                            </select>
                         </fieldset>
 <button type="submit" class="btn btn-success">Купить</button>
                         
                         </form>
                        <p>
                         <form action="new" method="post">
                            <fieldset class="form-group">   
                          <button type="submit" href="new" class="btn btn-success" formnovalidate>Отменить</button>
                          </fieldset>
                         </p>
                         </form>
                    </div>
                </div>
            </div>
        </body>

        </html>