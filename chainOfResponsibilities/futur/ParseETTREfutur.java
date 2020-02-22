package chainOfResponsibilities.futur;

import chainOfResponsibilities.ParseurVerbeCOR;
import groupes.*;
import groupes.futur.Deuxiemegrpfutur;
import groupes.futur.Premiergrpfutur;
import groupes.futur.VerbeEnEttrefutur;
import groupes.present.Premiergrp;
import groupes.present.Verbe;


public class ParseETTREfutur extends ParseurVerbeCOR{

	public ParseETTREfutur(ParseurVerbeCOR suivant) {
		super(suivant);
	}

	@Override
	public Verbe Parse1(String verbe) {
		try {
		return new VerbeEnEttrefutur(verbe);
		}catch(IllegalArgumentException e) {
			return null;
		}
	} 

}
