package designpatternsofjava.factorydp;

public class WDev implements Employee{

    @Override
    public int salary() {
        System.out.println("Gatting WDev salary");
        return 50000;
    }

    
    
}
