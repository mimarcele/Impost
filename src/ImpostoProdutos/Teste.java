package ImpostoProdutos;

public class Teste{
    public static void main(String[] args) {
        Produto p = new Produto ("Computador", 4, 3000);
        p.calculaImposto ();
        p.calculaFrete ();
        System.out.println (p );

        Produto p2 = new Produto ("Celular", 0.8, 2500);
        p2.calculaImposto ();
        p2.calculaFrete ();
        System.out.println (p2 );
    }
}

