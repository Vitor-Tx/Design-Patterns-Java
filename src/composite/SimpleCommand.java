package composite;

public class SimpleCommand implements Command{

    private String command;

    public SimpleCommand(String command){
        this.command = command;
    }

    public void execute(){
        System.out.println(this.command + '\n');
    }
}