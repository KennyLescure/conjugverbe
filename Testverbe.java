import chainOfResponsibilities.*;
import groupes.present.Deuxiemegrp;
import groupes.present.Premiergrp;
import groupes.present.Verbe;
import groupes.present.VerbeEnAitre;
import groupes.present.VerbeEnNdre;

public class Testverbe {
	public static void main(String[] args) 
	{		
		//Création de la COR, qui sert a definir le grp du verbe a conjuguer
		Verbe groupe;
		
		Parse1G parse1g = new Parse1G(null);
		Parse2G parse2g = new Parse2G(parse1g);
		ParseAITRE parseaitre = new ParseAITRE(parse2g);
		ParseETTRE parseettre = new ParseETTRE(parseaitre);
		ParseOUDRE parseoudre = new ParseOUDRE(parseettre);
		ParseNDRE parsendre = new ParseNDRE(parseoudre);
		
		String verbecor = "coudre";
		groupe = parsendre.parse(verbecor); //grp du verbe en question
		
		System.out.println(groupe.conjugue1());
		System.out.println(groupe.conjugue2());
		System.out.println(groupe.conjugue3());
		System.out.println(groupe.conjugue4());
		System.out.println(groupe.conjugue5());
		System.out.println(groupe.conjugue6());
		
		
		
	}
}
