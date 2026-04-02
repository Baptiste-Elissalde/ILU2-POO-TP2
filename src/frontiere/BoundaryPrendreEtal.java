package frontiere;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		boolean nomVendeurConnu = controlPrendreEtal.verifierIdentite(nomVendeur);
		StringBuilder retour = new StringBuilder();
		if (!nomVendeurConnu) {
			retour.append("je suis désolé ");
			retour.append(nomVendeur);
			retour.append(" mais il faut etre un habitant de notre village pour commerver ici\n");
			System.out.println(retour.toString());
		} else {
			retour.append("Bonjour ");
			retour.append(nomVendeur);
			retour.append(" ,je vais regarder si je peux vous trouvez un étal");
			System.out.println(retour.toString());
			boolean etalDisponible = controlPrendreEtal.resteEtals();
			StringBuilder retour2 = new StringBuilder();
			if (!etalDisponible) {
				retour2.append("Désolée ");
				retour2.append(nomVendeur);
				retour2.append(" je n'ai plus de d'étal qui ne soit déja occuper\n");
				System.out.println(retour2.toString());
			} else {
				installerVendeur(nomVendeur);
			}
		}
}
	
	private void installerVendeur(String nomVendeur) {
		int numeroEtal = -1;
		StringBuilder retour2 = new StringBuilder();
		retour2.append("C est parfait, il me reste un étal pour vous !\n");
		retour2.append("Il me faudrait quelques renseignements :\n");
		retour2.append("Quel produit souhaitez vous vendre ? \n");
		String produit = Clavier.entrerChaine(retour2.toString());
		StringBuilder retour3 = new StringBuilder();
		retour3.append("combien souhaitez vous en vendre ?\n");
		int nombreproduit = Clavier.entrerEntier(retour3.toString());
		numeroEtal = controlPrendreEtal.prendreEtal(nomVendeur, produit, nombreproduit);
		if(numeroEtal != -1) {
			StringBuilder retour4 = new StringBuilder();
			retour4.append("Le vendeur ");
			retour4.append(nomVendeur);
			retour4.append(" s est installé à l'étal numéro ");
			retour4.append(numeroEtal+1);
			System.out.println(retour4.toString());
		}
	}
}
