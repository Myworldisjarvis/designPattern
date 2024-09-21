package designpatternsofjava.factorydp;

public class ADev implements Employee{

    @Override
    public int salary() {
        System.out.println("Gating ADev salary");
        return  80000;
    }



    
}
