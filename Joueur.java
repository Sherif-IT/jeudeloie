
public class Joueur {

	private String nom;
	private int score;
	private Case positionJoueur;
	private Plateau plateau;
	//private Case caseJoueur;
	
	public Joueur(String nom, int score, Plateau plateau) {
		// TODO Auto-generated constructor stub
		setNom(nom);
		setScore(score);
		this.plateau=plateau;
		this.positionJoueur=plateau.caseDebut();
	}

	private void setScore(int score2) {
		// TODO Auto-generated method stub
		this.score=score2;
	}

	public String getNom(){
	    return this.nom;
	}
	public int getScore(){
	    return this.score;
	}

	public void setNom(String nom){
		this.nom = nom ;
	}

	public int donnerPosition(){
		//TODO
	    return positionJoueur.getNumCase();
	}

	public boolean gagnant() {
		// 
		boolean estGagnant;
		
		if(positionJoueur == plateau.getCase(10)) {
			estGagnant=true;
		}
		else {
			estGagnant=false;
		}
		return estGagnant;
	}

	public void setPositiionJoueur(Case case1) {
		this.positionJoueur=case1;
		
	}

}
