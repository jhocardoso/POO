package lista4.rh;

public class Diretor extends Funcionario {

    private String carro;

    // Construtores
    public Diretor() {
        super();
    }
    public Diretor(String nome, String rg, float salario, String carro) {
        super(nome, rg, salario);
        this.setCarro(carro);
    }

    // Getters e Setters
    public String getCarro() {
        return carro;
    }
    public void setCarro(String carro) {
        this.carro = carro;
    }

    @Override
    public String toString(){
        return super.toString() + ", Carro: " + this.carro;
    }
    @Override
    public void receberSalarioToral() {
        float preco = 80000;
        float aux = this.salario + (5 * preco) / 100;
        System.out.println("Salário total: " + aux);
        
    }
    

    


    
}
