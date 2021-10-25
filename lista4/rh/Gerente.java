package lista4.rh;

public class Gerente extends Funcionario {
    private float bonus;    
    private String meta;

    // CONSTRUTORES
    public Gerente() {
        super();
    }      
    public Gerente(String nome, String rg, float salario, float bonus, String meta) {
        super(nome, rg, salario);
        this.setBonus(bonus);
        this.setMeta(meta);
    }

    // GETTERS E SETTERS
    public float getBonus() {
        return bonus;
    }
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
    public String getMeta() {
        return meta;
    }
    public void setMeta(String meta) {
        this.meta = meta;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bônus: " + this.bonus + ", Meta: " + this.meta;
    }
    @Override
    public void receberSalarioToral() {
        float aux = this.salario + (this.bonus * this.salario)/100;
        System.out.println("Salário total: " + aux);
        
    }




    
}
