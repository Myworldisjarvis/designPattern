package designpatternsofjava.abstractfactorydp;

public class WDev implements Employee{

    @Override
    public int salary() {
        System.out.println("Gat salary ...");
        return 40000;
    }

    @Override
    public String getName() {
        System.out.println("I am WDEV");
        return "Sadaf";
    }
    
}
