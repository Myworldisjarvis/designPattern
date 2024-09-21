package designpatternsofjava.abstractfactorydp;


public class ClientABFDPMain {
    public static void main(String[] args) {
        
        //i want to get adev
        Employee e = EmployeeFactory.getE(new ADevFactory());
        System.out.println(e.getName()+" "+e.salary());
        
        
    }
  
}
