package lista1;
import java.text.DecimalFormat;

public class Rio {

    // Variáveis
    public String nome;
    public float nivel;
    public boolean poluido;
    DecimalFormat objeto = new DecimalFormat("#,###.00");
    
    // Construtores
    //Sem parâmetro
    public Rio() {        
    }
    
    //Com parâmetro
    public Rio (String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    //Métodos
    public void chover(float x) {
        this.nivel = this.nivel + x;
    }
    
    public void ensolarar(float x) {
        if (this.nivel >= x) {
            this.nivel = this.nivel - x;
        }
        else {
            System.out.println("Nível do rio não pode ser negativo");
        }
    }
    
    public void limpar() {
        this.poluido = false;
    }
    
    public void sujar() {
        this.poluido = true;
    }
    
    public void mostra() {
        System.out.println("Rio: " + this.nome + ", Nível: " + objeto.format(this.nivel) +
                ", Poluído: " + (this.poluido ? "SIM" : "NÃO"));
    }
    
}
