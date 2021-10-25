package lista1;
import java.text.DecimalFormat;

public class Cliente {

    // Variáveis
    int numeroConta, numeroAgencia;
    String nome;
    float saldo;
    DecimalFormat objeto = new DecimalFormat("#,###.00");
    
    //Construtores
    //Sem parâmetro
    public Cliente(){        
    }
    //Com parâmetro
    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;        
    }
    
    //Métodos
    public void realizarDeposito(float x) {
        this.saldo = this.saldo + x;
    }
    
    public void realizarSaque(float x) {
        if (this.saldo >= x) {
            this.saldo = this.saldo - x;
        }
        else {
            System.out.println("Saldo insuficiente. Seu saldo atual é de R$" + objeto.format(this.saldo));
        }
    }
    
    public String dadosCliente() {        
        return "Numero da conta: " + this.numeroConta + ", Cliente: " + this.nome + ", Saldo atual: R$" + objeto.format(this.saldo);
    }    
    
}
