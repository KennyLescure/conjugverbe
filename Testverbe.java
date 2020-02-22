import java.util.Scanner;

import chainOfResponsibilities.*;
import chainOfResponsibilities.futur.Parse1Gfutur;
import chainOfResponsibilities.futur.Parse2Gfutur;
import chainOfResponsibilities.futur.ParseAITREfutur;
import chainOfResponsibilities.futur.ParseETTREfutur;
import chainOfResponsibilities.futur.ParseNDREfutur;
import chainOfResponsibilities.futur.ParseOIREfutur;
import chainOfResponsibilities.futur.ParseOUDREfutur;
import chainOfResponsibilities.passecompose.Parse1Gpc;
import chainOfResponsibilities.present.Parse1G;
import chainOfResponsibilities.present.Parse2G;
import chainOfResponsibilities.present.ParseAITRE;
import chainOfResponsibilities.present.ParseETTRE;
import chainOfResponsibilities.present.ParseNDRE;
import chainOfResponsibilities.present.ParseOIRE;
import chainOfResponsibilities.present.ParseOUDRE;
import groupes.present.Deuxiemegrp;
import groupes.present.Premiergrp;
import groupes.present.Verbe;
import groupes.present.VerbeEnAitre;
import groupes.present.VerbeEnNdre;

public class Testverbe {
	public static void main(String[] args) 
	{		
		Verbe groupe;
		
		//COR PRESENT
		Parse1G parse1g = new Parse1G(null); 
		Parse2G parse2g = new Parse2G(parse1g);
		ParseAITRE parseaitre = new ParseAITRE(parse2g);
		ParseETTRE parseettre = new ParseETTRE(parseaitre);
		ParseOUDRE parseoudre = new ParseOUDRE(parseettre);
		ParseNDRE parsendre = new ParseNDRE(parseoudre);
		ParseOIRE parseoire = new ParseOIRE(parsendre);
		
		//COR FUTUR
		Parse1Gfutur parse1gfutur = new Parse1Gfutur(null);// COR futur
		Parse2Gfutur parse2gfutur = new Parse2Gfutur(parse1gfutur);
		ParseAITREfutur parseaitrefutur = new ParseAITREfutur(parse2gfutur);
		ParseETTREfutur parseettrefutur = new ParseETTREfutur(parseaitrefutur);
		ParseOUDREfutur parseoudrefutur = new ParseOUDREfutur(parseettrefutur);
		ParseNDREfutur parsendrefutur = new ParseNDREfutur(parseoudrefutur);
		ParseOIREfutur parseoirefutur = new ParseOIREfutur(parsendrefutur);
		
		//COR PASSE COMPOSE
		Parse1Gpc parse1gpc = new Parse1Gpc(null);// COR futur
		Parse2Gpc parse2gpc = new Parse2Gpc(parse1gpc);
		ParseAITREpc parseaitrepc = new ParseAITREpc(parse2gpc);
		ParseETTREpc parseettrepc = new ParseETTREpc(parseaitrepc);
		ParseOUDREpc parseoudrepc = new ParseOUDREpc(parseettrepc);
		ParseNDREpc parsendrepc = new ParseNDREpc(parseoudrepc);
		ParseOIREpc parseoirepc = new ParseOIREpc(parsendrepc);
		
		// verbe a conjuguer
		System.out.println("Saissez l'infinitif de votre verbe : "); 
		Scanner infinitif = new Scanner(System.in);
		String verbecor = infinitif.nextLine();
		
		// temps a conjuguer
		System.out.println("Saissez le temps auquel vous souhaitez le conjuguer : "); 
		System.out.println("1- Present");
		System.out.println("2- Futur");
		System.out.println("3- Passé composé");
		System.out.print("Votre choix: ");
		Scanner in = new Scanner(System.in);// choix de l'user
		int num = in.nextInt();// converti son choix en INT
		
		if (num < 1 || num > 3) {
			System.out.println("Choix de temps incorrect");
		}else {
			// si l'utilisateur choisis premier temps > utilisation COR present, sinon celle du futur
			if (num == 1 )groupe = parseoire.parse(verbecor); // on renvoi la COR du present
			if (num == 2 )groupe = parseoirefutur.parse(verbecor); // on renvoi la COR du futur
			else groupe = parseoirepc.parse(verbecor); // on renvoi la COR du Passé Composé

			//affichage resultat a l'utilisateur
			System.out.println(groupe.conjugue1());
			System.out.println(groupe.conjugue2());
			System.out.println(groupe.conjugue3());
			System.out.println(groupe.conjugue4());
			System.out.println(groupe.conjugue5());
			System.out.println(groupe.conjugue6());
		}
						
	}
}
