package abstractFactory;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args){

        ArrayList<AbstractObject> objetos = new ArrayList<AbstractObject>();
        Concrete2DFactory c2DFactory = new Concrete2DFactory();
        Concrete3DFactory c3DFactory = new Concrete3DFactory();


        objetos.add(c2DFactory.fabricarCopo());
        objetos.add(c3DFactory.fabricarGarrafa());
        objetos.add(c2DFactory.fabricarPrato());
        objetos.add(c3DFactory.fabricarCopo());
        objetos.add(c2DFactory.fabricarGarrafa());
        objetos.add(c2DFactory.fabricarPrato());
        objetos.add(c3DFactory.fabricarPrato());
        objetos.add(c3DFactory.fabricarCopo());
        objetos.add(c2DFactory.fabricarGarrafa());

        for(AbstractObject i : objetos)
            i.showObject();




    }

}