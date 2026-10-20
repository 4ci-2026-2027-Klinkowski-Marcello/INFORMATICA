public class Car{
    private String targa;
    private double benzina;
    private double resa;
    public Car(String targa, double benzina, double resa){
        this.targa = targa;
        this.benzina = 0.0;
        this.resa = resa;
    }
    public void drive(double km, double benzina, double resa){
        double benzinaUtilizzata = km * resa;
        benzina -= benzinaUtilizzata;
    }   
    public void ispGas(double benzina){
    }
    public void addGas(double benzina, double benzinaRifornita){
        benzina += benzinaRifornita;
    }
    //set e get benzina
    public void setBenzina(double benzina){
        if(benzina != 0.0){
            this.benzina = benzina;
        }
    }
    public double getBenzina(){
        return benzina;
    }
    //set e get targa
    public void setTarga(String targa){
        if(targa != null){
            this.targa = targa;
        }
    }
    public String getTarga(){
        return targa;
    }
    //set e get resa
    public void setResa(double resa){
        if(resa != 0.0){
            this.resa = resa;
        }
    }
    public double getResa(){
        return resa;
    }
}