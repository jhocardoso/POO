package lista4.rh;

public class Assistente extends Funcionario {
    
    private float horaExtra; 
    
    public Assistente() {
        super(); // chama construtor da superclasse
    }

    public Assistente(String nome, String rg, float salario, float horaExtra) {
        super(nome, rg, salario); // chama construtor da superclasse - reutilização de cósigo
        this.setHoraExtra(horaExtra);
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    // apesar de herdarmos o toString(), teremos que reescreve-lo
    @Override // indica que estamos anulando algo que foi herdado
    public String toString() {
        return super.toString() + ", Hora extra: " + this.horaExtra;
    }

    @Override
    public void receberSalarioToral() {
        float aux = this.salario + 40 * this.horaExtra;
        System.out.println("Salário toral: " + aux);
        
    }

    



}
