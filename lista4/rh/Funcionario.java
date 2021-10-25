package lista4.rh;

public abstract class Funcionario {
    // # - protected -> permite que a variável seja herdada para as classes filhas
    protected String nome;   
    protected String rg;
    protected float salario;
    
    public Funcionario() {
    }
    
    public Funcionario(String nome, String rg, float salario) {
        this.setNome(nome);
        this.setRg(rg);
        this.setSalario(salario);
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String toString(){
        return "RG:" + this.rg + ", Nome: " + this.nome + ", Salário " + this.salario;
    }

    public abstract void receberSalarioToral(); 
        // é possível implementar este método na classe Fucnionário?
        // este método teria a mesma implem,entação nas classes filhas?
        // Classes podem ser abstratas -> não podem ser instanciadas
        // 1) Servir apenas de modelo para as classes filhas
        // 2) poder possuir métodos abstratos

        // O MÉTODO É APENAS DECLARADO E NÃO IMPLEMENTADO
        // O MÉTODO É IMPLEMENTADO NAS FILHAS
    


}
