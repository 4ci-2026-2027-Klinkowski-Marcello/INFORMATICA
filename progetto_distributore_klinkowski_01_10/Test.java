import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Car auto1 = new Car("FN238",0.09);
        DistributoreBenzina distributore = new DistributoreBenzina(2.07);
        boolean fine = false;
        while (!fine){
        System.out.println("Menu Distributore\n" + "Digitare 1. per fare un rifornimento al distributore\n" + "Digitare 2. per rifornimento di benzina\n" + "Digitare 3. per far un giro in macchina\n" + "Digitare 4. per sapere quanta benzina ti rimane\n" + "Digitare 5. per aggiornare il prezzo della benzina\n" + "Digitare 6. per uscire");            int opzione = sc.nextInt();
            switch(opzione){
                case 1: 
                    System.out.println("Digitare quantita di benzina aggiunta al distributore");
                    double unaQuantita = sc.nextDouble();
                    distributore.rifornisci(unaQuantita);
                    break;
                case 2:
                    System.out.println("Digitare importo da pagare");
                    double euro = sc.nextDouble();
                    distributore.vendi(euro, auto1);
                    break;
                case 3:
                    System.out.println("Digitare quantita di km che vuoi viaggiare");
                    double km = sc.nextDouble();
                    auto1.drive(km);
                    break;
                case 4:
                    System.out.println("Hai" + auto1.getBenzina() + "di benzina disponibile da usare");
                    break;
                case 5:
                    System.out.println("Digitare prezzo di benzina per litro");
                    double unPrezzoPerLitro = sc.nextDouble();
                    distributore.aggiorna(unPrezzoPerLitro);
                    break;
                case 6:
                    esci = true;
                    System.out.println("Processo concluso arrivederci!");
                    break;
                default:
                    System.out.println("Errore, prova una opzione valida");
                    break;
            }
        }
        sc.close();
    }
}