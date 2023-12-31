package com.ferragnez.party;


import java.util.Scanner;

//Nel programma bisogna:
//creare e inizializzare l’array contenente i nomi degli invitati
//chiedere all’utente come si chiama
//verificare che il nome sia presente nella lista (ATTENZIONE: in Java per confrontare due stringhe non posso
// usare ==, ma devo usare il metodo equals())
//lasciarlo entrare o rispedirlo cortesemente da dove è venuto
//Bonus: se avete usato il ciclo for per cercare il nome nella lista nella consegna base, implementare lo
// stesso programma usando il ciclo while, e viceversa
//Buon lavoro e buon weekend!
public class CheckGuest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //creo l'array con gli invitati
String[] guestsList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        //chiedo il nome all'utente
        System.out.print("Inserisci il tuo nome: ");
        String guestName = scan.nextLine();

        //ciclo for per verificare se il nome dell'utente è nella lista
        boolean isAGuest = false;
        
for (int i=0; i<guestsList.length; i++) {
    if (guestsList[i].equalsIgnoreCase(guestName)) {
        isAGuest = true;
    }
}

  if (isAGuest) {
      System.out.println("Puoi entrare!");
    } else {
      System.out.println("Non puoi entrare!");
    }

        // bonus: uso ciclo while

        // chiudo lo scanner
        scan.close();
    }
}
