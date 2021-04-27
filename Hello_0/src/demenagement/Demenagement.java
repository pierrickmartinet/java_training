package demenagement;

public class Demenagement {

	public static void main(String[] args) {
		// Nombre de cartons du local à déménager
		int cartonAncienLocal = 34;
		// Capacité du camion
		int capaciteCamion = 9;
		// Carton dans le camion
		int cartonCamion = 0;
		// Nombre de cartons du nouveau local
		int cartonNouveauLocal = 0;

		// Tant qu'il y a des cartons dans l'ancien local
		while (cartonAncienLocal > 0) {

			// Et si le nombre de cartons restant est superieur à la capacité du camion
			if (cartonAncienLocal > capaciteCamion) {
				// Le camion se remplit au maximum de sa capacité
				cartonCamion = capaciteCamion;
			} else {
				// Sinon le camion se remplit avec les derniers cartons restants
				cartonCamion = cartonAncienLocal;
			}

			System.out.println("Un voyage de " + cartonCamion + " cartons");
			// L'ancien local se vide du nombre de cartons chargé
			cartonAncienLocal = cartonAncienLocal - cartonCamion;
			// Le nouveau local recoit les cartons
			cartonNouveauLocal = cartonNouveauLocal + cartonCamion;
			// Le camion se vide
			cartonCamion = 0;
		}

		System.out.println("Ancien local : " + cartonAncienLocal);
		System.out.println("Nouveau local : " + cartonNouveauLocal);
	}
}