
package padraodecorator;

public class PadraoDecorator {

    public static void main(String[] args) {
        
        Stream usuarioAssBasica = new AssinaturaBase();
        usuarioAssBasica.assinar();
        System.out.println("----------------------------------");
        
        Stream Assinatura01 = new Pacote1(new AssinaturaBase());
        Assinatura01.assinar();
        System.out.println("----------------------------------");
        
        Stream Assinatura02 = new Pacote3(new Pacote2(new AssinaturaBase()));
        Assinatura02.assinar();
        System.out.println("----------------------------------");
        
        Stream Assinatura03 = new Pacote4(new AssinaturaBase());
        Assinatura03.assinar();
    }
    
}
