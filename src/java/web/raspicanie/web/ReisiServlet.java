
package web.raspicanie.web;

import static java.io.FileDescriptor.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;


import java.sql.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import web.respisanie.dao.ReisiDAO;
import web.raspisanie.model.Reisi;

@WebServlet("/")
public class ReisiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ReisiDAO reisiDAO;
	
	public void init() {
		reisiDAO = new ReisiDAO();
    }

    public ReisiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

	
	@Override
    protected void  doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
        Reisi reisiS = reisiDAO.selectReisi(id);
        reisiS.setNomerReisa(Integer.parseInt(req.getParameter("NomerReisa")));
        reisiS.setMapshryt(req.getParameter("Mapshryt"));		
        reisiS.setDateOtprav(req.getParameter("DateOtprav"));	
        reisiS.setTimeOtpravl(req.getParameter("TimeOtpravl"));	
        reisiS.setTimePribit(req.getParameter("TimePribit"));	
        reisiS.setStoimost(req.getParameter("Stoimost"));	
        reisiS.setMapshryt(req.getParameter("Mapshryt"));	
        reisiS.setMapshryt(req.getParameter("Mapshryt"));	
        
        reisiS.setKolVoBil(Integer.parseInt(req.getParameter("KolVoBil")));
        reisiS.setKolVoBil(Integer.parseInt(req.getParameter("KolVoBil")));
        
        
        resp.sendRedirect("/new");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("sort") != null){
		
			   List < Reisi > listReisi = reisiDAO.sortAsc();
		        request.setAttribute("listReisi", listReisi);
		        RequestDispatcher dispatcher = request.getRequestDispatcher("list-reisi.jsp");
		        dispatcher.forward(request, response);
		} else {
	String action = request.getServletPath();
		
		 try {
	            switch (action) {
	                case "/new":
	                	listUser(request, response);
	                    break;
	              case "/edit":
	            	  showEditForm(request, response);
	                    break;
                         
	              case "/search":
	            	  searchReisiForm(request, response);
	                    break;
	               case "/update":
	                    updateUser(request, response);
	                    break;
		            }
		 }catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
	    }
	}
private void listUser(HttpServletRequest request, HttpServletResponse response)
		    throws SQLException, IOException, ServletException {
		        List < Reisi > listReisi = reisiDAO.selectAllReisis();
		        request.setAttribute("listReisi", listReisi);
		        RequestDispatcher dispatcher = request.getRequestDispatcher("list-reisi.jsp");
		        dispatcher.forward(request, response);
		    }
	
	
	
	 private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			    throws SQLException, ServletException, IOException {
				int id = Integer.parseInt(request.getParameter("idPaspisanit"));
			        Reisi existingReisi = reisiDAO.selectReisi(id);
                                RequestDispatcher dispatcher = request.getRequestDispatcher("reisi-form.jsp");
			        request.setAttribute("reisi", existingReisi);
			        dispatcher.forward(request, response);

			    }
  private void searchReisiForm(HttpServletRequest request, HttpServletResponse response)
			 throws SQLException, ServletException, IOException {
		 int id = Integer.parseInt(request.getParameter("id"));
                     Reisi existingReisi = reisiDAO.selectReisi1(id);

                        if(existingReisi!=null)
                        { RequestDispatcher dispatcher = request.getRequestDispatcher("search-form.jsp");
		        request.setAttribute("reisi", existingReisi);
		        dispatcher.forward(request, response);}
                 else
                 {
		     request.setAttribute("alertMsg", "Номер рейса не найден. Проверьте правильность введения номера рейса.");
                       RequestDispatcher rd= request.getRequestDispatcher("404.jsp");
                                rd.include(request, response);
                 }
		}
 private void updateUser(HttpServletRequest request, HttpServletResponse response)
			    throws SQLException, IOException, ServletException {
           int selectId = Integer.parseInt(request.getParameter("selectID"));
			        int idPaspisanit = Integer.parseInt(request.getParameter("idPaspisanit"));
			        int NomerReisa = Integer.parseInt(request.getParameter("NomerReisa"));
			        String Mapshryt = request.getParameter("Mapshryt");
			        String DateOtprav = request.getParameter("DateOtprav");
			        String TimeOtpravl = request.getParameter("TimeOtpravl");
			        String TimePribit = request.getParameter("TimePribit");
			        String Stoimost = request.getParameter("Stoimost");
			        int KolVoBil = Integer.parseInt(request.getParameter("KolVoBil"));
			        int KolVoOstBil = Integer.parseInt(request.getParameter("KolVoOstBil"));
if(KolVoBil>selectId)
                                {
                                KolVoBil=KolVoBil-selectId;
                                KolVoOstBil=KolVoOstBil+selectId;
                                    
                                Reisi reisi = new Reisi(idPaspisanit, NomerReisa, Mapshryt, DateOtprav,TimeOtpravl,TimePribit,Stoimost,KolVoBil,KolVoOstBil);
			        reisiDAO.updateUser(reisi);
                                
                               request.setAttribute("alertMsg", "Ваш номер рейса:  "+NomerReisa+"");
                               request.setAttribute("alertMsg1", "Маршрут:  "+Mapshryt+"");
                               request.setAttribute("alertMsg2", "Дата отправления:  "+DateOtprav+"");
                               request.setAttribute("alertMsg3", "Время отправления:  "+TimeOtpravl+"");
                               request.setAttribute("alertMsg4", "Количество приобретенных билетов:  "+selectId+"");
                               RequestDispatcher rd= request.getRequestDispatcher("order.jsp");
                               rd.include(request, response);
                            }
                                else{
                                  
                               request.setAttribute("alertMsg", "Невозможно купить выбранное количество билетов.Попробуйте еще раз.");
                               RequestDispatcher rd= request.getRequestDispatcher("404.jsp");
                               rd.include(request, response);
                               
}
         }
	
	
	
	
	

		
		
		
	}

	

