package chainOfResponsibilities;

import groupes.Verbe;

public abstract class ParseurVerbeCOR implements ParseurVerbe{
	protected ParseurVerbeCOR suivant;
	
	public ParseurVerbeCOR(ParseurVerbeCOR suivant) {
		this.suivant = suivant;
	}
	
	public void setSuivant(ParseurVerbeCOR suivant) {
		this.suivant = suivant;
	}
	
	/**
	 * on verifie si un expert peut résoudre le problème, sinon on retourne null
	 */
	public Verbe parse(String verbe)
	{
		Verbe resultat;
		resultat = this.Parse1(verbe);
		if(resultat != null)
			return resultat;
		else {
			if(this.suivant != null)
				return this.suivant.parse(verbe);
			else 
				return null;
		}
	}
	
	/**
	 * 
	 * @param verbe
	 * @return le verbe correspondant à l'expert si c'est possible, sinon null
	 */
	public abstract Verbe Parse1(String verbe);
}
