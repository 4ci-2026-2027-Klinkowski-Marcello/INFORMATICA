import java.util.*;
public class Parcheggio{
    private double costoOrario;
    private int postiDisponibili;
    private ArrayList<Car> elenco;
    public Parcheggio(){
        this.costoOrario=0.0;
        this.postiDisponibili=0;
        this.elenco = new ArrayList<>();
    }
    public Parcheggio(int postiDisponibili, double costoOrario){
        this.elenco = new ArrayList<>();
        if(postiDisponibili >= 0){
            this.postiDisponibili = postiDisponibili;
        }else{
            this.postiDisponibili = 0;
        }
        if(costoOrario >= 0.0){
            this.costoOrario = costoOrario;
        }else{
            this.costoOrario = 0.0;
        }
    }
    public Parcheggio(Parcheggio p){
        this.postiDisponibili = p.postiDisponibili;
        this.costoOrario = p.costoOrario;
        this.elenco = new ArrayList<>(p.elenco);
    }
    //metodo entra che permette all’automobile di entrare nel parcheggio, diminuendo di una unità il numero di posti disponibili
    public boolean entra(Car unaAutomobile, double ore){
        if(postiDisponibili > 0 && !elenco.contains(unaAutomobile)){
            postiDisponibili -= 1;
            elenco.add(unaAutomobile);
            return true;
        }else{
            return false;
        }
    }
    //metodo esci che permette all’automobile di uscire dal parcheggio. Il metodo calcola il costo della sosta in base al numero di ore trascorse e al costo orario e restituisce il costo complessivo da pagare, incrementandolo di una unità il numero di posti disponibili
    public double esci(Car unaAutomobile, double ore){
       if(elenco.contains(unaAutomobile)){
            double costoTotale = costoOrario * ore;
            postiDisponibili += 1;
            elenco.remove(unaAutomobile);
            return costoTotale;
       }
        return 0.0;
    }
    //metodo setCosto che aggiorna il costo di un’ora di parcheggio
    public void setCosto(double unCostoOrario){
        this.costoOrario = unCostoOrario;
    }
    //get per i posti disponibili
    public int getPostiDisponibili(){
        return postiDisponibili;
    }
}