public class Car{
    private String targa;
    private String marca;
    public Car(String targa,String marca){
        this.targa = targa;
        this.marca = marca;
    }
    public Car(){
        this.targa=" ";
        this.marca=" ";
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
    //set e get marca
    public void setMarca(String marca){
        if(marca != null){
            this.marca = marca;
        }
    }
    public String getMarca(){
    return marca;
    }
    /*numero posti per macchine
    public postiMacchina(){
        postiDisponibili -= 1;
    }
    */
}