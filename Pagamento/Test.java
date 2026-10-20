import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conto conto1 = new Conto("Cherry", 998);
        Pagamento pagamento1 = new Pagamento("Bodini", 17);  
        boolean esci = false;
        while (!esci){
            System.out.println("Menu pagamento\n" + "Digitare 1. per effettuare il pagamento\n" + "Digitare 2. per uscire dal programma");
            int opzione = sc.nextInt();
            switch(opzione){
                case 1: 
                    try{
                        conto1.effettuaPagamento(pagamento1);
                        System.out.println("Il tuo saldo del tuo conto è di: " + conto1.getSaldo());
                    } catch (SaldoInsufficienteException e){
                        System.out.println("Exception: " + e.getMessage());
                    }
                    break;
                case 2:
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
