package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Esercizio del negozio
		 * PARTE 1:

All'avvio del programma, chiedere quanti prodotti sono in vendita nel negozio, e successivamente far inserire per ogni prodotto:

nome (String)
prezzo (double)
quantità disponibile (int)
(utilizzare 3 array per memorizzare queste informazioni)

PARTE 2:

Chiedere all'utente il nome del prodotto da acquistare (si può indicare anche una parte del nome) e, se il prodotto esiste chiedere anche la quantità da acquistare.

Se il prodotto esiste e la quantità disponibile è sufficiente l'acquisto va a buon fine, in questo caso aggiornare la quantità disponibile nel negozio.

Se il prodotto non esiste, oppure se la quantità disponibile non è sufficiente, mostrare un messaggio.

Dopo ogni acquisto, chiedere se si vuole acquistare un altro prodotto.
Al termine mostrare l'importo totale da pagare
		 */
		int nrProdotti;
		Scanner sc=new Scanner (System.in);
		System.out.println("Benvenuto nel nostro negozio. Quanti prodotti vuoi acquistare?");
		sc.nextLine();

//dichiarazione prodotti
String[] prodotti=new String[nrProdotti];
	double[] prezzi=new double [nrProdotti];
	int[] quantità=new int [nrProdotti];
	int i,qta;
	String daAcquistare, risposta;
	double totale;
	boolean trovato;
	
	for (i=0; i<nrProdotti; i++) {
		System.out.println("Inserisci il prodotto nr" +i);
		System.out.print("Nome: ");
		prodotti[i]=sc.nextLine();
		
		System.out.print("Prezzo:");
		prezzi[i]=sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Quantità:");
		prezzi[i]=sc.nextInt();
		sc.nextLine();
	
		
	}
	totale=0;
	do {
		System.out.print("Che prodotto vuoi acquistare? ");
		daAcquistare=sc.nextLine();
		trovato=false;
		for (i=0; i<nrProdotti; i++) 
			if (prodotti[i].toLowerCase().indexOf(daAcquistare.toLowerCase()) >=0){
				trovato=true;
				System.out.println("Prezzo: " +prezzi[i]);
				System.out.print("Inserisci la quantità: ");
				qta=sc.nextInt();
				sc.nextLine();
				
				if (qta<=quantità[i]) {
					System.out.println("Acquisto effettuato: " +prezzi);
					quantità[i]-=qta; //quantità[i] = quantità[i]-qta
					totale+=prezzi[i]*qta;
			} else
				System.out.println("Quantità non sufficiente");
				

			}
		if (!trovato)
			System.out.println("Prodotto non disponibile");
		System.out.print("Vuoi acquistare un altro prodotto (s/n)?");
		risposta=sc.nextLine();
	} while(risposta.equalsIgnoreCase("s"));
	System.out.println("Il totale è " +totale);
	
	}
			
			

}

