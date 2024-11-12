package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.Innlegg;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		String filPath = mappe + "/" + filnavn;

	     try (PrintWriter writer = new PrintWriter(filPath)) {
	            // Skriv antall innlegg først
	            writer.println(samling.getAntall());

	            // Skriv hvert innlegg ved å bruke toString() metoden til innlegg
	            for (Innlegg innlegg : samling.getSamling()) {
	                if (innlegg != null) {  // Kontrollerer at innlegg ikke er null
	                    writer.println(innlegg.toString());
	                }
	            }
	            return true;  // Returnerer true hvis alt gikk bra

	        } catch (FileNotFoundException e) {
	            System.out.println("Kunne ikke skrive til filen: " + e.getMessage());
	            return false; // Returnerer false hvis det oppsto et unntak
	        }
	    }
	}