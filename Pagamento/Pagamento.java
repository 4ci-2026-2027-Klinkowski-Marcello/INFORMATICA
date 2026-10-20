public class Pagamento {
    private String beneficiario;
    private double importo;
    public Pagamento() {
        this.beneficiario = "";
        this.importo = 0.0;
    }
    public Pagamento(String beneficiario, double importo) {
        this.beneficiario = beneficiario;
        this.importo = importo;
    }
    // get e set beneficiario
    public void setBeneficiario(String beneficiario){
        if(beneficiario!=null){
            this.beneficiario = beneficiario;
        }
    }
    public String getBeneficiario(){
        return beneficiario;
    }
    // get e set importo
    public void setImporto(double importo){
        if(importo!=0.0){
            this.importo = importo;
        }
    }
    public double getImporto(){
        return importo;
    }
    // toString
    public String toString() {
        String out = "\n";
        out += "Pagamento a favore di:" + beneficiario + "importo" + importo + "\n";
        return out;
    }
}
