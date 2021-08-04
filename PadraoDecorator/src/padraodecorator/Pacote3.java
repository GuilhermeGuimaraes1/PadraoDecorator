
package padraodecorator;

public class Pacote3 extends AssinaturaDecorator {
    
    public Pacote3(Stream strem) {
        super(strem);
    }
    
    @Override
    public void assinar() {
        super.assinar();
        System.out.println("Pacote 03: ");
        System.out.println("Caixa surpresa com produtos relacionados a filmes e séries R$29,99.");
    }
    
}
