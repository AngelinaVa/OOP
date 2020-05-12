package web.raspisanie.model;


public class Reisi {
   protected int idPaspisanit;
	protected int NomerReisa;
	protected String Mapshryt;
	protected String DateOtprav;
	protected String TimeOtpravl;
	protected String TimePribit;
	protected String Stoimost;
	protected int KolVoBil;
	protected int KolVoOstBil;
	
	 public Reisi() {}
	
	
	 public Reisi(int NomerReisa, String Mapshryt, String DateOtprav,String TimeOtpravl,String TimePribit, String Stoimost,int KolVoBil, int KolVoOstBil) {
	        super();
	        this.NomerReisa = NomerReisa;
	        this.Mapshryt = Mapshryt;
	        this.DateOtprav = DateOtprav;
	        this.TimeOtpravl = TimeOtpravl;
	        this.TimePribit = TimePribit;
	        this.Stoimost = Stoimost;
	        this.KolVoBil = KolVoBil;
	        this.KolVoOstBil = KolVoOstBil;
	    }
	 
	 public Reisi(int idPaspisanit,int NomerReisa, String Mapshryt, String DateOtprav,String TimeOtpravl,String TimePribit, String Stoimost,int KolVoBil, int KolVoOstBil) {
	        super();
	        this.idPaspisanit=idPaspisanit;
	        this.NomerReisa = NomerReisa;
	        this.Mapshryt = Mapshryt;
	        this.DateOtprav = DateOtprav;
	        this.TimeOtpravl = TimeOtpravl;
	        this.TimePribit = TimePribit;
	        this.Stoimost = Stoimost;
	        this.KolVoBil = KolVoBil;
	        this.KolVoOstBil = KolVoOstBil;
	    }
	 
	 
	 public int getidPaspisanit() {
	        return idPaspisanit;
	    }
	    public void setidPaspisanit(int idPaspisanit) {
	        this.idPaspisanit = idPaspisanit;
	    }
	    
	    public int getNomerReisa() {
	        return NomerReisa;
	    }
	    public void setNomerReisa(int NomerReisa) {
	        this.NomerReisa = NomerReisa;
	    }
	    
	    
	    public String getMapshryt() {
	        return Mapshryt;
	    }
	    public void setMapshryt(String Mapshryt) {
	        this.Mapshryt = Mapshryt;
	    }
	    
	    
	    public String getDateOtprav() {
	        return DateOtprav;
	    }
	    public void setDateOtprav(String DateOtprav) {
	        this.DateOtprav = DateOtprav;
	    }
	    
	    
	    public String getTimeOtpravl() {
	        return TimeOtpravl;
	    }
	    public void setTimeOtpravl(String TimeOtpravl) {
	        this.TimeOtpravl = TimeOtpravl;
	    }
	    
	    
	    public String getTimePribit() {
	        return TimePribit;
	    }
	    public void setTimePribit(String TimePribit) {
	        this.TimePribit = TimePribit;
	    }
	    
	    public String getStoimost() {
	        return Stoimost;
	    }
	    public void setStoimost(String Stoimost) {
	        this.Stoimost = Stoimost;
	    }
	    
	    
	    public int getKolVoBil() {
	        return KolVoBil;
	    }
	    public void setKolVoBil(int KolVoBil) {
	        this.KolVoBil = KolVoBil;
	    }
	    
	    public int getKolVoOstBil() {
	        return KolVoOstBil;
	    }
	    public void setKolVoOstBil(int KolVoOstBil) {
	        this.KolVoOstBil = KolVoOstBil;
	    }

}
