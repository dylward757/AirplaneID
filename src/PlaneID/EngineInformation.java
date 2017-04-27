
package PlaneID;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EngineInformation {
	public boolean yesno(String Message){
		boolean cont =true;
		System.out.println(Message);
		 String[] choices = { "Yes","No" };
		    String input = (String) JOptionPane.showInputDialog(null, Message, "Engine Information", JOptionPane.QUESTION_MESSAGE, null, // U                                                     // icon
		        choices, // Array of choices
		        choices[1]); // Initial choice
		    if (input.equals("Yes"))
		    	return true;
		    else 
		    	return false;
	
	}
	public boolean JetOrPropeller(){//Dylan
		String Message = ("\nDoes The Plane Have A Jet Engine?");
		boolean Jet=yesno(Message);
		return Jet;
		
		
		
		
		
	}
	public int NumberOfEngines(){//Ryan
	String num = JOptionPane.showInputDialog(null, "");
		
		
		
		
		
		
		
		return 1;
	}
	public boolean FourEngineLocation(){//Dylan
		
		//All On Wings?
		String Message = ("\nAre all the engines on the wings?");
		if(yesno(Message) == true)
			return true;
		else 
			return false;
			
		
		
		//boolean fourEngine=yesno(Message);
		//return fourEngine;
		
		
		
		
		
		
		//return 0;
	}
	public int ThreeEngineLocation(){//JT
		
		//Nose & Wings
		
		
		//Tail
		
		
		//Wings&Tail
		
		
	
		return 0;
	}
	public int TwoEngineLocation(){//JT
		
		//WIngs
		
		//Tail
		
		//Fuselage
		
		
		
		
		return 0;
	}
	public int OneEngineLocation(){//Ryan
		
		//Nose
		
		
		
		//Tail
		
		
		
		
		return 0;
	}
}
