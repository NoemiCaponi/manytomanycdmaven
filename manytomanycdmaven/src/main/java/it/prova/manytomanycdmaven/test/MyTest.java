package it.prova.manytomanycdmaven.test;

import java.text.SimpleDateFormat;

import it.prova.manytomanycdmaven.dao.EntityManagerUtil;
import it.prova.manytomanycdmaven.model.Cd;
import it.prova.manytomanycdmaven.model.Genere;
import it.prova.manytomanycdmaven.service.CdService;
import it.prova.manytomanycdmaven.service.GenereService;
import it.prova.manytomanycdmaven.service.MyServiceFactory;

public class MyTest {

	public static void main(String[] args) {
		CdService cdServiceInstance = MyServiceFactory.getCdServiceInstance();
		GenereService genereServiceInstance = MyServiceFactory.getGenereServiceInstance();
		
		try {
			//*********************************************************************************
			//TEST INSERIMENTO NUOVO CD  ******************************************************
			//*********************************************************************************
//			System.out.println("Inserimento nuovo cd...");
//			Cd cdInstance = new Cd("titolo1","autore1",new SimpleDateFormat("dd/MM/yyyy").parse("24/09/2019"));
//			cdServiceInstance.inserisciNuovo(cdInstance);
//			if(cdServiceInstance.caricaSingoloElemento(cdInstance.getId()) != null)
//				System.out.println("Inserimento nuovo cd...OK: "+cdInstance);
			
//			//*********************************************************************************
//			//TEST CARICA CD  *****************************************************************
//			//*********************************************************************************
//			Long idCdDaCaricare = 1L;
//			System.out.println("Carica cd con id.."+idCdDaCaricare);
//			Cd cdDaCaricare = cdServiceInstance.caricaSingoloElemento(idCdDaCaricare);
//			if(cdDaCaricare != null)
//				System.out.println("Cd caricato con successo: "+cdDaCaricare);
//			else
//				System.out.println("Cd non trovato.");
			
//			//*********************************************************************************
//			//TEST INSERIMENTO NUOVO GENERE****************************************************
//			//*********************************************************************************
			String descrizioneGenere = "rock";
//			if(genereServiceInstance.cercaPerDescrizione(descrizioneGenere) == null) {
//				genereServiceInstance.inserisciNuovo(new Genere(descrizioneGenere));
//				System.out.println("Nuovo genere inserito.");
//			}
			
//			//*********************************************************************************
//			//COLLEGHIAMO GENERE A CD ****************************************************
//			//*********************************************************************************
//			Long idCdDaCaricarePerCollegamentoGenere = 1L;
//			System.out.println("Carica cd con id.."+idCdDaCaricarePerCollegamentoGenere);
//			Cd cdDaCaricarePerCollegamentoGenere = cdServiceInstance.caricaSingoloElemento(idCdDaCaricarePerCollegamentoGenere);
//			Genere genereDaCaricarePerCollegamente = genereServiceInstance.cercaPerDescrizione(descrizioneGenere);
//			if(cdDaCaricarePerCollegamentoGenere != null) {
//				cdServiceInstance.aggiungiGenere(cdDaCaricarePerCollegamentoGenere, genereDaCaricarePerCollegamente);
//			}
//			for(Cd cdItem:cdServiceInstance.listAll())
//				System.out.println(cdItem);
//			
//			//*********************************************************************************
//			//CREAZIONE CD E CREAZIONE GENERE  IN UN SOLO COLPO  ******************************
//			//*********************************************************************************
//			Cd cdInstanceX = new Cd("titoloX","autoreX",new SimpleDateFormat("dd/MM/yyyy").parse("10/08/2020"));
//			Genere genereX = new Genere("X");
//			cdServiceInstance.creaECollegaCdEGenere(cdInstanceX, genereX);
//			System.out.println(cdServiceInstance.caricaSingoloCdConGeneri((cdInstanceX.getId())));
			
			//*********************************************************************************
			//COLLEGHIAMO UN  CD A DUE GENERI ED UN GENERE A DUE CD ******************************
			//*********************************************************************************
//			System.out.println("COLLEGHIAMO UN  CD A DUE GENERI ED UN GENERE A DUE CD...");
//			Cd cdInstance3 = new Cd("titolo3","autore3",new SimpleDateFormat("dd/MM/yyyy").parse("07/04/2018"));
//			Cd cdInstance4 = new Cd("titolo4","autore4",new SimpleDateFormat("dd/MM/yyyy").parse("07/04/2018"));
//			Genere genereJ = new Genere("J");
//			Genere genereK = new Genere("K");
//			//cd3 con J e cd4 con J e K
//			cdServiceInstance.creaECollegaCdEGenere(cdInstance3, genereJ);
//			cdServiceInstance.creaECollegaCdEGenere(cdInstance4, genereK);
//			cdServiceInstance.aggiungiGenere(cdInstance4, genereJ);
//			System.out.println("...end...");
			
			//*********************************************************************************
			//RIMUOVIAMO UN CD E VEDIAMO COSA ACCADE AI GENERI ********************************
			//per eseguire questo test dobbiamo prendere un cd esistente collegato a due generi
			//il risultato atteso è la rimozione dalla tabella cd, la rimozione dalla tabella 
			//di legame lasciando inalterate le voci nella tabella genere. Tutto ciò
			//a prescindere della presenza dei Cascade. Se mettiamo CascadeType.ALL o REMOVE...
			//DISASTRO!!!
			//*********************************************************************************
//			System.out.println("RIMUOVIAMO UN CD E VEDIAMO COSA ACCADE AI GENERI...");
//			Long idCdDaCaricarePerRimozione = 4L;
//			Cd cdDaCaricarePerRimozione = cdServiceInstance.caricaSingoloElemento(idCdDaCaricarePerRimozione);
//			if(cdDaCaricarePerRimozione != null) {
//				System.out.println("Cd caricato con successo: "+cdDaCaricarePerRimozione);
//				//rimuovo
//				cdServiceInstance.rimuovi(cdDaCaricarePerRimozione);
//			}else
//				System.out.println("Cd non trovato.");
//			System.out.println("...end...");
			
			Long idGenereDaCanc=8L;
			Genere genereDaCancellare=genereServiceInstance.caricaSingoloElemento(idGenereDaCanc);
			if(genereDaCancellare!=null) {
				genereServiceInstance.rimuovi(genereDaCancellare);
				genereDaCancellare = genereServiceInstance.caricaSingoloElemento(idGenereDaCanc);
				if (genereDaCancellare == null)
					System.out.println("Cancellazione eseeguita");
				else
					System.out.println("Cancellazione non eseguita");
			}else
				System.out.println("Non cancellato");
			
			
		
			
//			for(Cd cdItem:cdServiceInstance.listAll())
//				System.out.println(cdItem);
//			for(Genere genereItem:genereServiceInstance.listAll())
//				System.out.println(genereItem);
			
			
//			Cd cdDaModificare=cdServiceInstance.caricaSingoloCdConGeneri(4L);
//			if(cdDaModificare!=null) {
//				cdDaModificare.setAutore("autoreY");
//				cdServiceInstance.aggiorna(cdDaModificare);
//				System.out.println("Nuovo autore: "+cdDaModificare);
//			}

					 

			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// questa è necessaria per chiudere tutte le connessioni quindi rilasciare il
			// main
			EntityManagerUtil.shutdown();
		}

	}

}
