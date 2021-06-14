package simpleFactory;
import java.util.Random;

public class Ponto2dFactory {

    public static Ponto2d fabricar(){
        Random rand = new Random();
        int x = rand.nextInt(101);
        int y = rand.nextInt(101);
        return new Ponto2d(x, y);
    }

}
