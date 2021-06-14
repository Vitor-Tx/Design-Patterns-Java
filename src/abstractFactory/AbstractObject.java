package abstractFactory;

public class AbstractObject {
    String nome;
    String tipo;

    public void showObject(){
        System.out.println(this.nome + " " + this.tipo);
    }
}
