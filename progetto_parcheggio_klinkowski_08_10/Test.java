import java.util.*;
public class Test {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Car auto1 = new Car("RGB08","mazda");
        Parcheggio parcheggio = new Parcheggio(10, 2.50);
        boolean esci = false;
    while(!esci){
        System.out.println("Menu parcheggio automatizzato\n" + "Digitare 1. per entrare\n" + "Digitare 2. per uscire\n" + "Digitare 3. per selezionare o aggiornare il costo del parcheggio\n" + "Digitare 4. per finire il processo");
        int opzione = sc.nextInt();
        switch(opzione){
            case 1: 
            //controllo posti disponibili
                if(parcheggio.getPostiDisponibili() > 0){
                    if(parcheggio.entra(auto1, 0)){
                        System.out.println("L'auto e' entrata nel parcheggio.");
                        System.out.println("Posti rimasti: " + parcheggio.getPostiDisponibili());
                    }else{
                        System.out.println("L'auto risulta gia' presente nel parcheggio!");
                    }
                }else{
                    System.out.println("Impossibile entrare: il parcheggio e' PIENO!");
                }
                break;
            case 2:
                double importo = parcheggio.esci(auto1, 2.5);
                if(importo > 0.0){
                    System.out.println("Sei uscito dal parcheggio.");
                    System.out.println("L'importo da pagare è: " + importo + "€");
                }else{
                    System.out.println("L'auto non risulta all'interno del parcheggio!");
                }
                break;
            case 3:
                System.out.println("Digitare il costo aggiornato del parcheggio");
                double unCostoOrario = sc.nextDouble();
                parcheggio.setCosto(unCostoOrario);
                break;
            case 4:
                System.out.println("Arrivederci");
                esci = true;
                break;
            default:
                System.out.println("Errore, prova una opzione valida");
                    break;
            }
        }
        sc.close();
    }
}