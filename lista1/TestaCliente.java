package lista1;
public class TestaCliente {

    public static void main(String args[]) {
        // Criar objetos
        Cliente obj1 = new Cliente (123456, 0001, "Fulano", 15350.93f);
        Cliente obj2 = new Cliente (654321, 0002, "Beltrano", 10f);
        
        // Testar métodos
        obj1.realizarDeposito(1500);
        obj1.realizarSaque(5000);
        System.out.println(obj1.dadosCliente());
        System.out.println("***************************************");  
  
        obj2.realizarDeposito(50.25f);
        obj2.realizarSaque(100);
        System.out.println(obj2.dadosCliente());
    }
    
}
