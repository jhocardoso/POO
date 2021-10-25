package lista1;
public class TestaAluno {
    
    public static void main(String args[]) {
        
        // cria um objeto chamando o método construtor
        Aluno obj1 = new Aluno(2, "Jhonatan", 31, 10, 8);        
        System.out.println(obj1.dadosAluno());
        System.out.println(obj1.passou());
              
        Aluno obj2 = new Aluno(1, "Italo", 27, 8.4f, 2);        
        System.out.println(obj2.dadosAluno());
        System.out.println(obj2.passou());        
    }
}
