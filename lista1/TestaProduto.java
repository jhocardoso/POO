package lista1;

public class TestaProduto {
    public static void main(String[] args) {
        // Criar objetos
        Produto obj1 = new Produto (1, "Pão", 12, 9.99f);
        Produto obj2 = new Produto();
        obj2.id = 5;
        obj2.descricao = "Leite";
        obj2.qtde = 2;
        obj2.preco = 3.2f;
        
        // Testar métodos
        obj1.comprar(5);
        obj1.vender(2);
        obj1.subir(1.01f);
        obj1.descer(2);
        System.out.println(obj1.mostra());
        System.out.println("***************************************");
        obj2.comprar(5);
        obj2.vender(2);
        obj2.subir(2);
        obj2.descer(1.2f);
        System.out.println(obj2.mostra());
        
    }
    
}
