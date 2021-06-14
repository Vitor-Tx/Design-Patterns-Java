package singleton;

public class Principal {

    public static void main(String[] args){

        Ponto2dFactory firstFactory = Ponto2dFactory.getSingleFactory();
        Ponto2d p = firstFactory.fabricar();
        System.out.println(p.x + " " + p.y);


    }

}