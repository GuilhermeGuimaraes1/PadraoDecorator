
package padraodecorator;

public class Pacote4 extends AssinaturaDecorator{
    
    public Pacote4(Stream strem) {
        super(strem);
    }
    
    @Override
    public void assinar() {
        super.assinar();
        System.out.println("Pacote 04:");
        System.out.println("Cartão de crédito Platinum R$49,99.");
        
    }
    
}
