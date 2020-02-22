package chainOfResponsibilities.futur;

import chainOfResponsibilities.ParseurVerbeCOR;
import groupes.*;
import groupes.futur.Deuxiemegrpfutur;
import groupes.futur.Premiergrpfutur;
import groupes.futur.VerbeEnAitrefutur;
import groupes.present.Premiergrp;
import groupes.present.Verbe;


public class ParseAITREfutur extends ParseurVerbeCOR{

	public ParseAITREfutur(ParseurVerbeCOR suivant) {
		super(suivant);
	}

	@Override
	public Verbe Parse1(String verbe) {
		try {
		return new VerbeEnAitrefutur(verbe);
		}catch(IllegalArgumentException e) {
			return null;
		}
	} 

}
