package chainOfResponsibilities.futur;

import chainOfResponsibilities.ParseurVerbeCOR;
import groupes.*;
import groupes.futur.Deuxiemegrpfutur;
import groupes.futur.Premiergrpfutur;
import groupes.present.Premiergrp;
import groupes.present.Verbe;


public class Parse2Gfutur extends ParseurVerbeCOR{

	public Parse2Gfutur(ParseurVerbeCOR suivant) {
		super(suivant);
	}

	@Override
	public Verbe Parse1(String verbe) {
		try {
		return new Deuxiemegrpfutur(verbe);
		}catch(IllegalArgumentException e) {
			return null;
		}
	} 

}
