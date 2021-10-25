package lista1;
import java.text.DecimalFormat;

public class Produto {
    // Variáveis
    int id, qtde;
    String descricao;
    float preco;
    DecimalFormat objeto = new DecimalFormat("#,###.00");
    
    //Construtores
    //Sem parâmetro
    public Produto(){        
    }
    
    //Com parâmetro
    public Produto (int id, String descricao, int qtde, float preco) {
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    // Métodos
    public void comprar(int x) {
        this.qtde = this.qtde + x;
    }
    
    public void vender(int x) {
        if (this.qtde >= x) {
            this.qtde = this.qtde - x;
        }
        else {
            System.out.println("Quantidade indisponível.");
        }
    }
    
    public void subir(float x) {
        this.preco = this.preco + x;
    }
    
    public void descer(float x) {
        this.preco = this.preco - x;
    }
    
    public String mostra() {
        return "ID: " + this.id + ", Descrição: " + this.descricao + ", Qtde: " + this.qtde +
                ", Preço: R$" + objeto.format(this.preco);
    }
    
}
