package designpatternsofjava.abstractfactorydp;

public class ADev implements Employee{

    
    @Override
    public int salary() {
        System.out.println("getaing A dev salary...");
        return 70000;
    }

    @Override
    public String getName() {
        System.out.println("I am A Dev");
        return "Sadaf Hussain";
                
    }
    
}
