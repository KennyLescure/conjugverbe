package chainOfResponsibilities;

import groupes.*;


public class ParseAITRE extends ParseurVerbeCOR{

	public ParseAITRE(ParseurVerbeCOR suivant) {
		super(suivant);
	}

	@Override
	public Verbe Parse1(String verbe) {
		try {
		return new VerbeEnAitre(verbe);
		}catch(IllegalArgumentException e) {
			return null;
		}
	} 

}
