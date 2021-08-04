
package padraodecorator;

public class AssinaturaDecorator implements Stream{
    public Stream strem;

    public AssinaturaDecorator(Stream strem) {
        this.strem = strem;
    }

    @Override
    public void assinar() {
        this.strem.assinar();
    }
    
}
