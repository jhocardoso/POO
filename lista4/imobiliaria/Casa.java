package lista4.imobiliaria;

public class Casa extends Moradia {
    private float tamQuintal;
    private boolean piscina;
    
    // CONSTRUTORES
    public Casa() {
        super();
    }   

    public Casa(String endereco, String cidade, float tamanho, float tamQuintal, boolean piscina) {
        super(endereco, cidade, tamanho);
        this.setTamQuintal(tamQuintal);
        this.setPiscina(piscina);
    }

    // GETTERS AND SETTERS
    public boolean isPiscina() {
        return piscina;
    }
    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }
    public float getTamQuintal() {
        return tamQuintal;
    }
    public void setTamQuintal(float tamQuintal) {
        this.tamQuintal = tamQuintal;
    }

    @Override
    public String toString(){
        return super.toString() + ", Quintal: " + this.tamQuintal + ", Tem piscina: " + this.piscina;
    }


    @Override
    public void calcularPreco() {
        float aux;
        aux = (this.tamanho * 500) + (this.tamQuintal * 100);
        if (this.piscina) {
            aux = aux + 1000;
        }
        System.out.print("Valor da casa é de " + aux);

        
    }
    
}
