package designpatternsofjava.abstractfactorydp;


public class EmployeeFactory {


public static Employee getE(EmployeeAbstractFactory factory){

    return factory.createEmployee();
}

    
}
