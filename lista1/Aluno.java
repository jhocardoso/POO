package lista1;
public class Aluno {
    
    // variáveis
    public int numeroAluno, idade;
    public String nome;
    public float p1, p2;

    // método construtor com parâmetro
    // Na classe TestaAluno - Aluno obj1 = new Aluno(2, "Jhonatan", 31, 10, 8)
    public Aluno (int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }
        
    // método construtor sem parâmetro
    // Na classe TestaAluno - Aluno obj1 = new Aluno()
    public Aluno () {        
    }
        
    // retornar média
    public float notaFinal() {
        return (this.p1 + this.p2) / 2;
    }
    
    // retorna String
    public String dadosAluno() {
        return "Número do Aluno: " + this.numeroAluno + ", Nome: " + this.nome + ", Idade: " + this.idade + ", Média final: " + this.notaFinal();
    }
    
    // não retorna nada
    public String passou() {
        if (this.notaFinal() >= 6) {
            return "Aprovado!";
        }
        else {
            return "Reprovado";
        }
    }
}
