package chainOfResponsibilities.futur;

import chainOfResponsibilities.ParseurVerbeCOR;
import groupes.*;
import groupes.futur.Premiergrpfutur;
import groupes.present.Premiergrp;
import groupes.present.Verbe;


public class Parse1Gfutur extends ParseurVerbeCOR{

	public Parse1Gfutur(ParseurVerbeCOR suivant) {
		super(suivant);
	}

	@Override
	public Verbe Parse1(String verbe) {
		try {
		return new Premiergrpfutur(verbe);
		}catch(IllegalArgumentException e) {
			return null;
		}
	} 

}
