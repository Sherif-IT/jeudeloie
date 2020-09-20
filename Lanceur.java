
public class Lanceur {

	public Lanceur() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Jeu jeu= new Jeu();
		
		jeu.ajouterJoueur("fall");
		jeu.ajouterJoueur("mane");
		
		jeu.jouer();

	}

}
