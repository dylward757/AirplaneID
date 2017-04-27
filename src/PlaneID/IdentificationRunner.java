package PlaneID;

public class IdentificationRunner {
	public static void main(String[] args){
		
		IdentificationRunner myPlanes = new IdentificationRunner();
		myPlanes.createAirplaneData();
		
		AirplaneID idAirplane = new AirplaneID();
		//idAirplane.start();
		
		EngineInformation EI = new EngineInformation();
		
		boolean Jet=EI.JetOrPropeller();
		
		boolean fourEngine = EI.FourEngineLocation();

		//boolean ***=EI.***();
		
		
		//boolean ***=EI.***();
		//System.out.println("\n"+***);

		//boolean ***=EI.***();
		//System.out.println("\n"+***);
		
		//boolean ***=EI.***();
		//System.out.println("\n"+***);
		
		System.out.println("\nJet: "+Jet);
		System.out.println("\nFour engines: "+fourEngine);
		//System.out.println(***: "\n"+***);
		//TailInformation TI = new TailInformation();
		//WingInformation WI = new WingInformation();
	}

	private void createAirplaneData() {
		
		AirplaneData F15 = new AirplaneData();
		AirplaneData F16 = new AirplaneData();
		AirplaneData F18 = new AirplaneData();
		AirplaneData F22 = new AirplaneData();
		AirplaneData F35 = new AirplaneData();		
		AirplaneData A10 = new AirplaneData();
		
		//do this in AirplaneID class
		F15.setNumberEngines(2);
		F16.setNumberEngines(1);
		F18.setNumberEngines(2);
		F22.setNumberEngines(2);
		F35.setNumberEngines(2);
		A10.setNumberEngines(2);
		
		F15.setNumberVerticalTails(2);
		F16.setNumberVerticalTails(1);
		F18.setNumberVerticalTails(2);
		F22.setNumberVerticalTails(2);
		F35.setNumberVerticalTails(2);
		A10.setNumberVerticalTails(2);
		
		System.out.println("F 15 has " + F15.getNumberEngines() + " engines.");
		System.out.println("F 16 has " + F16.getNumberEngines() + " engines.");
		
	}
}
