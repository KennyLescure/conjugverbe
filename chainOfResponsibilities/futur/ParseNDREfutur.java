package chainOfResponsibilities.futur;

import chainOfResponsibilities.ParseurVerbeCOR;
import groupes.*;
import groupes.futur.Deuxiemegrpfutur;
import groupes.futur.Premiergrpfutur;
import groupes.futur.VerbeEnNdrefutur;
import groupes.present.Premiergrp;
import groupes.present.Verbe;


public class ParseNDREfutur extends ParseurVerbeCOR{

	public ParseNDREfutur(ParseurVerbeCOR suivant) {
		super(suivant);
	}

	@Override
	public Verbe Parse1(String verbe) {
		try {
		return new VerbeEnNdrefutur(verbe);
		}catch(IllegalArgumentException e) {
			return null;
		}
	} 

}
