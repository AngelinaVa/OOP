
package web.respisanie.dao;
import java.sql.Connection;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import web.raspisanie.model.Reisi;

public class ReisiDAO {
private String jdbcURL = "jdbc:mysql://localhost:3306/infoauto?characterEncoding=UTF-8&serverTimezone=UTC";
	private String jdbcUsername = "root";
	private String jdbcPassword = "root";

	
	
		    private static final String SELECT_USER_BY_ID = "SELECT  idPaspisanit,NomerReisa, Mapshryt, DateOtprav, TimeOtpravl, TimePribit, Stoimost, KolVoBil, KolVoOstBil FROM paspisanit where idPaspisanit = ?"; 
		    private static final String UPDATE_USERS_SQL = "update paspisanit set NomerReisa = ?,Mapshryt= ?, DateOtprav =?, TimeOtpravl =?, TimePribit =?, Stoimost =?, KolVoBil =?, KolVoOstBil =? where idPaspisanit = ?;";
		   
		    public ReisiDAO() {}   
		    
		    
		    protected Connection getConnection() {
		        Connection connection = null;
		        try {
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		          
		            
		        } catch (SQLException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        } catch (ClassNotFoundException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
		        return connection;
		    }
		    
		    
		    
		    
		    
		    public Reisi selectReisi(int id) 
 {
		    	Reisi reisi = null;
		    
		        try (Connection connection = getConnection();
		            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
		            preparedStatement.setInt(1, id);
		            System.out.println(preparedStatement);
		       
		            ResultSet rs = preparedStatement.executeQuery();

		           
		            while (rs.next()) {
		            	
		            	 int NomerReisa = rs.getInt("NomerReisa");
				            String Mapshryt = rs.getString("Mapshryt");
				            String DateOtprav = rs.getString("DateOtprav");
				            String TimeOtpravl = rs.getString("TimeOtpravl");
				            String TimePribit = rs.getString("TimePribit");
				            String Stoimost = rs.getString("Stoimost");
				            int KolVoBil = rs.getInt("KolVoBil");
				            int KolVoOstBil = rs.getInt("KolVoOstBil");
				            
				            reisi = new Reisi(id, NomerReisa, Mapshryt, DateOtprav,TimeOtpravl,TimePribit,Stoimost,KolVoBil,KolVoOstBil);
		            }
		        } catch (SQLException e) {
		            printSQLException(e);
		        }
		        return reisi;
		    }
		    
		    
		    
		    
		    public Reisi selectReisi1(int nomer) 
		    {
		   		    	Reisi reisi = null;
		   		      try (Connection connection = getConnection();
		   		            PreparedStatement preparedStatement = connection.prepareStatement("select * from paspisanit where NomerReisa=?");) {
		   		            preparedStatement.setInt(1, nomer);
		   		            System.out.println(preparedStatement);
		   		            ResultSet rs = preparedStatement.executeQuery();
		   		          while (rs.next()) {
		   		           int idPaspisanit = rs.getInt("idPaspisanit");
					            String Mapshryt = rs.getString("Mapshryt");
					            String DateOtprav = rs.getString("DateOtprav");
					            String TimeOtpravl = rs.getString("TimeOtpravl");
					            String TimePribit = rs.getString("TimePribit");
					            String Stoimost = rs.getString("Stoimost");
					            int KolVoBil = rs.getInt("KolVoBil");
					            int KolVoOstBil = rs.getInt("KolVoOstBil");
					            reisi = new Reisi(idPaspisanit,nomer, Mapshryt, DateOtprav,TimeOtpravl,TimePribit,Stoimost,KolVoBil,KolVoOstBil);
		   		            }
		   		        } catch (SQLException e) {
		   		            printSQLException(e);
		   		        }
		   		        return reisi;
		   		    }
 		    
		    public List < Reisi > sortAsc() {
		        List < Reisi > reisis = new ArrayList < > ();
		        try (Connection connection = getConnection();
		            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM paspisanit group by NomerReisa desc");) {
		            System.out.println(preparedStatement);
		            ResultSet rs = preparedStatement.executeQuery();
		            while (rs.next()) {
		            	int idPaspisanit = rs.getInt("idPaspisanit");
		    			int NomerReisa = rs.getInt("NomerReisa");
		    		            String Mapshryt = rs.getString("Mapshryt");
		    		            String DateOtprav = rs.getString("DateOtprav");
		    		            String TimeOtpravl = rs.getString("TimeOtpravl");
		    		            String TimePribit = rs.getString("TimePribit");
		    		            String Stoimost = rs.getString("Stoimost");
		    		            int KolVoBil = rs.getInt("KolVoBil");
		    		            int KolVoOstBil = rs.getInt("KolVoOstBil");
		                reisis.add(new Reisi(idPaspisanit, NomerReisa, Mapshryt, DateOtprav,TimeOtpravl,TimePribit,Stoimost,KolVoBil,KolVoOstBil));
		            }
		        } catch (SQLException e) {
		            printSQLException(e);
		        }
		        return reisis;
		    }
		 
                    public List < Reisi > selectAllReisis() {
		        List < Reisi > reisis = new ArrayList < > ();
		        try (Connection connection = getConnection();
		            PreparedStatement preparedStatement = connection.prepareStatement("select * from paspisanit group by NomerReisa asc");) {
		            System.out.println(preparedStatement);
		            ResultSet rs = preparedStatement.executeQuery();
		            while (rs.next()) {
		            	int idPaspisanit = rs.getInt("idPaspisanit");
		    			int NomerReisa = rs.getInt("NomerReisa");
		    		            String Mapshryt = rs.getString("Mapshryt");
		    		            String DateOtprav = rs.getString("DateOtprav");
		    		            String TimeOtpravl = rs.getString("TimeOtpravl");
		    		            String TimePribit = rs.getString("TimePribit");
		    		            String Stoimost = rs.getString("Stoimost");
		    		            int KolVoBil = rs.getInt("KolVoBil");
		    		            int KolVoOstBil = rs.getInt("KolVoOstBil");
		                reisis.add(new Reisi(idPaspisanit, NomerReisa, Mapshryt, DateOtprav,TimeOtpravl,TimePribit,Stoimost,KolVoBil,KolVoOstBil));
		            }
		        } catch (SQLException e) {
		            printSQLException(e);
		        }
		        return reisis;
		    }
		    
		    public boolean updateUser(Reisi reisi) throws SQLException {
		        boolean rowUpdated;
		        try (Connection connection = getConnection(); 
                                PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);)
                        {
                                        statement.setInt(1, reisi.getNomerReisa());
					statement.setString(2, reisi.getMapshryt());
					statement.setString(3, reisi.getDateOtprav());
					statement.setString(4, reisi.getTimeOtpravl());
					statement.setString(5, reisi.getTimePribit());
					statement.setString(6, reisi.getStoimost());
					statement.setInt(7, reisi.getKolVoBil());
					statement.setInt(8, reisi.getKolVoOstBil());
					statement.setInt(9, reisi.getidPaspisanit());
		            rowUpdated = statement.executeUpdate() > 0;
		        }
		        return rowUpdated;
		    }

		    private void printSQLException(SQLException ex) {
		        for (Throwable e: ex) {
		            if (e instanceof SQLException) {
		                e.printStackTrace(System.err);
		                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
		                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
		                System.err.println("Message: " + e.getMessage());
		                Throwable t = ex.getCause();
		                while (t != null) {
		                    System.out.println("Cause: " + t);
		                    t = t.getCause();
		                }
		            }
		        }
		    }}
