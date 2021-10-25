package lista1;
import javax.swing.JOptionPane;

public class TestaRio {

    public static void main(String[] args) {
        // Criar objetos
        String nome = JOptionPane.showInputDialog("Informe o nome do rio:");
        String nivel = JOptionPane.showInputDialog("Informe o nível do rio:");
        String poluido = JOptionPane.showInputDialog("Informe se o rio está poluido:");
        Rio obj0 = new Rio (nome, Float.parseFloat(nivel), Boolean.parseBoolean(poluido));
        obj0.mostra();
        Rio obj1 = new Rio ("Tietê", 2.46f, true);
        Rio obj2 = new Rio();
        obj2.nome = "Bagres";
        obj2.nivel = 1.62f;
        obj2.poluido = false;
        
        // Testar métodos
        obj1.chover(0.33f);
        obj1.ensolarar(0.15f);
        obj1.limpar();
        obj1.sujar();
        obj1.mostra();
        System.out.println("***************************************");
        obj2.chover(1.24f);
        obj2.ensolarar(1.04f);
        obj2.sujar();
        obj2.limpar();        
        obj2.mostra();
    }
    
}
