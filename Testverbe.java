import chainOfResponsibilities.*;
import groupes.Deuxiemegrp;
import groupes.Premiergrp;
import groupes.VerbeEnAitre;
import groupes.VerbeEnNdre;
import groupes.Verbe;

public class Testverbe {
	public static void main(String[] args) 
	{		

		//////////////////////////////////////////////////////////
		
		// creer verbe randoms
		Verbe v1, v2, v3, v4;
		v1 = new Premiergrp("marcher");
		v1 = new Premiergrp("aimer");
		v2 = new Deuxiemegrp("pâlir");
		v3 = new VerbeEnAitre("paraître");
		v4 = new VerbeEnNdre("peindre");
		
		// affiche verbe random conjugué
		System.out.println(v1.conjugue1erepersonnesingulier());
		System.out.println(v1.conjugue1erepersonnepluriel());
		System.out.println(v1.conjugueparticipepresent());
		System.out.println(v1.conjugueparticipepasse());
		
		System.out.println(v2.conjugue1erepersonnesingulier());
		System.out.println(v2.conjugue1erepersonnepluriel());
		System.out.println(v2.conjugueparticipepresent());
		System.out.println(v2.conjugueparticipepasse());
		
		System.out.println(v3.conjugue1erepersonnesingulier());
		System.out.println(v3.conjugue1erepersonnepluriel());
		System.out.println(v3.conjugueparticipepresent());
		System.out.println(v3.conjugueparticipepasse());
		
		System.out.println(v4.conjugue1erepersonnesingulier());
		System.out.println(v4.conjugue1erepersonnepluriel());
		System.out.println(v4.conjugueparticipepresent());
		System.out.println(v4.conjugueparticipepasse());

		//////////////////////////////////////////////////////////

		// tableau de verbes
		Verbe[] v = {		
		new Premiergrp("marcher"),
		new Premiergrp("aimer"),
		new Deuxiemegrp("pâlir"),
		new VerbeEnAitre("paraître"),
		new VerbeEnNdre("peindre"),
		};
		
		//creation de la liste de verbes avec le tableau de verbes
		ListeVerbes liste = new ListeVerbes(v);
		
		// affichage de la liste de verbe conjugué a la 1ere personne singulier
		System.out.println(liste.conjugue1erepersonnesingulier());
		
		
		//////////////////////////////////////////////////////////
		//Création de la COR 
		
		Parse1G parse1g = new Parse1G(null);
		Parse2G parse2g = new Parse2G(parse1g);
		ParseAITRE parseaitre = new ParseAITRE(parse2g);
		ParseNDRE parsendre = new ParseNDRE(parseaitre);
		
		String verbecor = "sucer";
		
		//methode pas static : variable (du type de la methode) . nom de methode
		System.out.println(parsendre.parse(verbecor));
		
	}
}
