public class Conto {
    private String nome;
    private double saldo;
    public Conto(){
        this.nome = "";
        this.saldo = 0.0; 
    }
    public Conto(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }
    public Conto(Conto c){
        this.nome = c.nome;
        this.saldo = c.saldo;
    }
    // get e set nome
    public void setNome(String nome){
        if(nome!=null){
            this.nome = nome;
        }
    }
    public String getNome(){
        return nome;
    }
    // get e set saldo
    public void setSaldo(double saldo){
        if(saldo!=0.0){
            this.saldo = saldo;
        }
    }
    public double getSaldo(){
        return saldo;
    }
    public boolean effettuaPagamento(Pagamento pagamento){
        if(pagamento.getImporto() <= this.saldo){
            this.saldo -= pagamento.getImporto();
            return true;
        }else{
            throw new SaldoInsufficienteException("Saldo Insufficiente");
        }
    }
    // toString
    public String toString() {
        String out = "\n";
        out += "Il conto intestato a:" + nome + "ha saldo" + saldo + "\n";
        return out;
    }
}