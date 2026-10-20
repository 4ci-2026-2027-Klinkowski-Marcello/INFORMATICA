public class Car{
    private String targa;
    private double resa;
    private double benzina;
    public Car(String targa, double resa){
        this.targa = targa;
        this.resa = resa;
        this.benzina = 0;
    }
    //metodo addGas per far rifornimento
    public void addGas(double litri){
        if(litri > 0){
            this.benzina += litri;
        }
    }
    //metodo drive che simula il percorso di un'automobile per una certa distanza, riducendo il livello di carburante nel serbatoio
    public void drive(double km){
        double consumo = km * resa;
        if(benzina >= consumo){
            benzina -= consumo;
        }
    }
    //get e set benzina
    public double getGas(){
        return benzina;
    }
    public void setGas(double benzina){
        if(benzina >= 0){
            this.benzina = benzina;
        }
    }
    //get e set resa
    public double getResa(){
        return resa;
    }
    public void setResa(double resa){
        if(resa >= 0){
            this.resa = resa;
        }
    }
    //get e set targa
    public String getTarga(){
        return targa;
    }
    public void setTarga(String targa){
        if(targa != null){
            this.targa = targa;
        }
    }
}