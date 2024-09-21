package designpatternsofjava.factorydp;

public class FactoryDPMain {
    public static void main(String[] args) {
        
        // tight cupling object creation 
        Employee e = new ADev();
        System.out.println(e.salary());
        
        Employee e1 = EmployeeFactoryDP.getE("wDev");
        System.out.println(e1.salary());
        
        
        
    }
}
