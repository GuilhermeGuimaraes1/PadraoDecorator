
package padraodecorator;

public class Pacote2 extends AssinaturaDecorator{
    
    public Pacote2(Stream strem) {
        super(strem);
    }
    
    @Override
    public void assinar() {
        super.assinar();
        System.out.println("Pacote 02");
        System.out.println("Frete Grátis em produtos R$9,99.");
    }
    
}
