package chainOfResponsibilities.futur;

import chainOfResponsibilities.ParseurVerbeCOR;
import groupes.*;
import groupes.futur.Deuxiemegrpfutur;
import groupes.futur.Premiergrpfutur;
import groupes.futur.VerbeEnOudrefutur;
import groupes.present.Premiergrp;
import groupes.present.Verbe;


public class ParseOUDREfutur extends ParseurVerbeCOR{

	public ParseOUDREfutur(ParseurVerbeCOR suivant) {
		super(suivant);
	}

	@Override
	public Verbe Parse1(String verbe) {
		try {
		return new VerbeEnOudrefutur(verbe);
		}catch(IllegalArgumentException e) {
			return null;
		}
	} 

}
