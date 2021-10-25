package lista4.rh;

import java.util.ArrayList;

public class Testa {

    public static void exemploPolimorfismo(Funcionario camaleao) {
        // camaleao pode representar um assistente, um gerente ou um diretor
        System.out.println(camaleao.toString());
        camaleao.receberSalarioToral();
    }

    public static void fecharFolha(ArrayList<Funcionario> funcs) {
        
        for(int i=0; i<funcs.size(); i++) {
            funcs.get(i).receberSalarioToral(); // POLIMORFISMO
        }
    }
    
    public static void main(String arg[]) {
        Assistente as1 = new Assistente("Fulano", "123", 2000, 2);
        exemploPolimorfismo(as1);
        Gerente ge1 = new Gerente("Sicrano", "456", 4000, 10, "batida 100%");
        exemploPolimorfismo(ge1);
        Diretor dir1 = new Diretor("Beltrano", "789", 6000, "Mercedes");  
        exemploPolimorfismo(dir1);
        
        ArrayList<Funcionario> funcs = new ArrayList<Funcionario>();
        funcs.add(as1);
        funcs.add(ge1);
        funcs.add(dir1);
        fecharFolha(funcs);
        
        //System.out.println(as1.toString());
        //as1.receberSalarioToral();
        //System.out.println("----------------------------------------");
        //System.out.println(ge1.toString());
        //ge1.receberSalarioToral();
        //System.out.println("----------------------------------------");
        //System.out.println(dir1.toString());
        //dir1.receberSalarioToral();
    }
}
