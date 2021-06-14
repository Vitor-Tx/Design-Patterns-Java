package composite;

import java.util.Random;

public class ConditionalCommand implements Command{
    private Command ifCommand;
    private Command elseCommand;

    public ConditionalCommand(Command ifCommand, Command elseCommand){
        this.ifCommand = ifCommand;
        this.elseCommand = elseCommand;
    }

    public void execute(){
        Random rand = new Random();
        double randN = rand.nextDouble();
        if(randN < 0.5)
            ifCommand.execute();
        else elseCommand.execute();

    }

}