public class DistributoreBenzina{
    private double deposito;
    private double euroPerLitro;
    private double importo;
    public DistributoreBenzina(double deposito, double unPrezzoPerLitro){
        this.deposito = 0;
        this.unPrezzoPerLitro = unPrezzoPerLitro;
        this.importo = 0;
    }
    //metodo rifornisci che rifornisce il distributore di benzina
    public void rifornisci(double unaQuantita){
        if(unaQuantita > 0){
        deposito += unaQuantita;
        }
    }
    //metodo vendi che vende una quantita' di benzina corrispondente all'ammontare di euro pagato che va a rifornisce l'automobile
    public void vendi(double euro, Car unaAutomobile){
        euroPerLitro = euro / euroPerLitro;
        unaAutomobile.addGas(LitriAggiunti);
    }
    //metodo aggiorna che aggiorna il prezzo della benzina
    public void aggiorna(double unPrezzoPerLitro){
        this.euroPerLitro = unPrezzoPerLitro;
    }
}