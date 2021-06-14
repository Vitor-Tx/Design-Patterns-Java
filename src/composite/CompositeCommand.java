package composite;

import java.util.ArrayList;

public class CompositeCommand implements Command{

    private ArrayList<Command> commandList = null;

    public CompositeCommand(ArrayList<Command> commandList){
        this.commandList = commandList;
    }

    public CompositeCommand(){
        this.commandList = new ArrayList<Command>();
    }

    public void add(Command command){
        this.commandList.add(command);
    }

    public void execute(){
        for(Command c : this.commandList){
            c.execute();
        }
    }
}