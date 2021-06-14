package simpleFactory;

public class Principal {

    public static void main(String[] args){


        Ponto2d p = Ponto2dFactory.fabricar();
        System.out.println(p.x + " " + p.y);


    }

}