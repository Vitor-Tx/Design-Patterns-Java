package singleton;
import java.util.Random;

public class Ponto2dFactory {

    private static Ponto2dFactory singleton = null;

    private Ponto2dFactory(){

    }

    public static Ponto2dFactory getSingleFactory(){
        if(singleton == null){
            singleton = new Ponto2dFactory();
        }
        return singleton;
    }
    public Ponto2d fabricar(){
        Random rand = new Random();
        int x = rand.nextInt(101);
        int y = rand.nextInt(101);
        return new Ponto2d(x, y);
    }

}
