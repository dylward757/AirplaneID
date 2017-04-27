package PlaneID;

public class AirplaneData {
	
	// field - private NO DIRECT ACCESS!
	private int numberEngines = 2;
	private int numberVerticalTails = 0;
	
	
	public AirplaneData(){
		
	}//method


	public int getNumberEngines() {
		return numberEngines;
	}


	public void setNumberEngines(int numberEngines) {
		
		this.numberEngines = numberEngines;
	}


	public int getNumberVerticalTails() {
		return numberVerticalTails;
	}


	public void setNumberVerticalTails(int numberVerticalTails) {
		this.numberVerticalTails = numberVerticalTails;
	}
	
	

}//class
