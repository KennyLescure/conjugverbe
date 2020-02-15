package chainOfResponsibilities;

import groupes.Verbe;

public interface ParseurVerbe {

	
	/**
	 * @param infinitif: represente l'infinitif d'un verbe exemples: "manger" ,"chanter", "craindre"
	 * @return le verbe correspondant
	 * @throws IllegalArgumentException si l'infinitif n'est pas reconnu
	 */
	public Verbe parse(String infinitif);
}
