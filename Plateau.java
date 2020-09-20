

public class Plateau {
	
	//un plateau avec un tableaux d objets case
	private Case[] cases = new Case[9];
	
	
		
	public Plateau() {
		for(int i = 0 ; i <= cases.length; i++) {
			cases[i]= new Case(i+1);
	}
	}
	
	public Case getCase(int pas) {
		return cases[pas-1];
	}

	public Case caseDebut() {
		// TODO Auto-generated method stub
		return cases[0];
	}
	

}
