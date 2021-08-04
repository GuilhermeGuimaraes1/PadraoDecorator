
package padraodecorator;

public class Pacote1 extends AssinaturaDecorator {
    
    public Pacote1(Stream strem) {
        super(strem);
    }
    
    @Override
    public void assinar() {
        super.assinar();
        System.out.println("Pacote 01");
        System.out.println("Assistir vídeos em vários dispositivos R$19,99.");
    }
    
}
