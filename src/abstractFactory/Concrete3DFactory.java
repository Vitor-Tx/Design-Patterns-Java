package abstractFactory;

public class Concrete3DFactory extends ObjectFactory{

    public AbstractObject fabricarCopo() {
        return new Copo("3D");
    }


    public AbstractObject fabricarGarrafa() {
        return new Garrafa("3D");
    }


    public AbstractObject fabricarPrato() {
        return new Prato("3D");
    }
}
