package composite;

public class Principal{

    public static void main(String[] args){


       CompositeCommand composite1 = new CompositeCommand();
       CompositeCommand composite2 = new CompositeCommand();
       ConditionalCommand cond = new ConditionalCommand(new SimpleCommand("cond.ifCommand"),
               new ConditionalCommand(composite2, new SimpleCommand("cond.cond.elseCommand")));
       composite1.add(cond);
       for(int i = 1; i<=10; i++){
           composite1.add(new SimpleCommand("composite1.SimpleCommand " + i));
           composite2.add(new ConditionalCommand(new SimpleCommand("composite2.ifCommand " + i) , new SimpleCommand("composite2.elseCommand " + i)));
       }

       composite1.execute();


    }

}