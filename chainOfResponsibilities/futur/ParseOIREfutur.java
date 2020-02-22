package chainOfResponsibilities.futur;

import chainOfResponsibilities.ParseurVerbeCOR;
import groupes.*;
import groupes.futur.Deuxiemegrpfutur;
import groupes.futur.Premiergrpfutur;
import groupes.futur.VerbeEnOirefutur;
import groupes.present.Premiergrp;
import groupes.present.Verbe;


public class ParseOIREfutur extends ParseurVerbeCOR{

	public ParseOIREfutur(ParseurVerbeCOR suivant) {
		super(suivant);
	}

	@Override
	public Verbe Parse1(String verbe) {
		try {
		return new VerbeEnOirefutur(verbe);
		}catch(IllegalArgumentException e) {
			return null;
		}
	} 

}
