package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		String[] donnesEtal = controlLibererEtal.libererEtal(nomVendeur);
		boolean vendeurReconnu = donnesEtal!= null;
		StringBuilder retour = new StringBuilder();
		if (!vendeurReconnu) {
			retour.append("Mais vous n etes pas inscrit sur notre marché aujourd'hui !");
			System.out.println(retour.toString());
		}
		else {
			if(donnesEtal[0].equals("true")) {
				retour.append("Vous avez vendu ");
				retour.append(donnesEtal[4]);
				retour.append(" sur ");
				retour.append(donnesEtal[3]);
				retour.append(" ");
				retour.append(donnesEtal[2]);
				retour.append("\nAu revoir ");
				retour.append(nomVendeur);
				retour.append(" passez une bonne journée");
				System.out.println(retour.toString());
			}
		}
	}

}
