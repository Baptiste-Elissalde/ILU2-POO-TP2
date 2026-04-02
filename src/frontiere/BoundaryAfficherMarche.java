package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		String[] infosMarche = controlAfficherMarche.donnerInfosMarche();
		StringBuilder retour = new StringBuilder();
		if(infosMarche.length==0) {
			retour.append("Le marché est vide, revenez plus tard");
			System.out.println(retour.toString());
		}
		else {
			retour.append(nomAcheteur);
			retour.append(" vous trouverez au marche:\n");
			System.out.println(retour.toString());
			StringBuilder retour2 = new StringBuilder();
			for(int i = 0 ; i< infosMarche.length;i++) {
				retour2.append("- ");
				retour2.append(infosMarche[i++]);
				retour2.append(" qui vend ");
				retour2.append(infosMarche[i++]);
				retour2.append(" ");
				retour2.append(infosMarche[i++]);
				System.out.println(retour2.toString());
			}
		}
	}
}
