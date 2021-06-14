package abstractFactory;

public class Concrete2DFactory extends ObjectFactory{

    public AbstractObject fabricarCopo() {
        return new Copo("2D");
    }


    public AbstractObject fabricarGarrafa() {
        return new Garrafa("2D");
    }


    public AbstractObject fabricarPrato() {
        return new Prato("2D");
    }
}
