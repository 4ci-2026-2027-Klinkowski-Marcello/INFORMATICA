public class DistributoreBenzina{
    private double deposito;
    private double euroPerLitro;
    public DistributoreBenzina(double unPrezzoPerLitro){
        this.deposito = 0;
        this.euroPerLitro = unPrezzoPerLitro;
    }
    //metodo rifornisci che rifornisce il distributore di benzina
    public void rifornisci(double unaQuantita){
        if(unaQuantita > 0){
            deposito += unaQuantita;
        }
    }
    //metodo vendi che vende una quantita' di benzina corrispondente all'ammontare di euro pagato che va a rifornisce l'automobile
    public void vendi(double euro, Car unaAutomobile){
        if(euroPerLitro > 0){
            double litriAggiunti = euro / euroPerLitro;
            if(deposito >= litriAggiunti){
                deposito -= litriAggiunti;
                unaAutomobile.addGas(litriAggiunti);
            }
        }
    }
    //metodo aggiorna che aggiorna il prezzo della benzina
    public void aggiorna(double unPrezzoPerLitro){
        this.euroPerLitro = unPrezzoPerLitro;
    }
    //get e set deposito
    public double getDeposito(){
        return deposito;
    }
    public void setDeposito(double deposito){
        if(deposito >= 0){
            this.deposito = deposito;
        }
    }
    //get e set euroPerLitro
    public double getEuroPerLitro(){
        return euroPerLitro;
    }
    public void setEuroPerLitro(double euroPerLitro){
        if(euroPerLitro >= 0){
            this.euroPerLitro = euroPerLitro;
        }
    }
}