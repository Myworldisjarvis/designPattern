package designpatternsofjava.abstractfactorydp;


public class ADevFactory extends EmployeeAbstractFactory{

    @Override
    public Employee createEmployee() {
        return new ADev();
    }

    
}
