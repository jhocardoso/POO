package lista2.banco;

public class Cliente {
    private String numeroConta, numeroAgencia;
    private float saldo;
    private String nome;

    public Cliente(){

    }
    public Cliente(String numeroConta, String numeroAgencia, float saldo, String nome){
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setSaldo(saldo);
        this.setNome(nome);
    }

    public final void setNumeroConta(String numeroConta){
        if ((numeroConta.length() == 8) && (numeroConta.charAt(6) == '-')){
            this.numeroConta = numeroConta;
        }
        else {
            System.out.println("Número de conta inválido");
            this.numeroConta = "Não definido";
        }
    }
    //O número da agência deve ter tamanho 6, também contando o traço do dígito verificador
    public final void setNumeroAgencia(String numeroAgencia) {
        if((numeroAgencia.length() == 6) && (numeroAgencia.charAt(4) == '-')) {
            this.numeroAgencia = numeroAgencia;
        }
        else {
            System.out.println("Número da agência inválida");
            this.numeroAgencia = "Não definido";
        }        
    }
    //O saldo da conta não tem restrição
    public final void setSaldo(float x) {
        if(x >= 0) {
            this.saldo = x;
        }
        else {
            System.out.println("Saldo não pode ficar negativo");
        }
    }
    //O nome do cliente não pode ultrapassar 30 caracteres
    public final void setNome(String nome) {
        if(nome.length() <= 30) {
            this.nome = nome;
        }
        else {
            System.out.println("Nome não pode ultrapassar 30 caracteres");
        }        
    }

    // getters
    public String getNumeroAgencia() {
        return this.numeroAgencia;
    }
    public String getNumeroConta() {
        return this.numeroConta;
    }
    public String getNome() {
        return this.nome;
    }
    public float getSaldo(){
        return this.saldo;
    }

    public String toString() { //converte o objeto em uma String
        return "Número da conta: " + this.numeroConta + ", Número da agência: " + this.numeroAgencia + ", Nome: " + this.nome + ", Saldo: " + this.saldo;
    }

    // MÉTODOS
    public void realizarDeposito(float x){
        if (x >= 0)
            this.saldo += x;
    }
    public void realizarSaque(float x){
        if (x >= 0)
            this.setSaldo(this.saldo - x);
    }









}
