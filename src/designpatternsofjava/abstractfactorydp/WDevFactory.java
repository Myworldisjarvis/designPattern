package designpatternsofjava.abstractfactorydp;

public class WDevFactory extends EmployeeAbstractFactory{

    @Override
    public Employee createEmployee() {
        return new WDev();
    }

    
}
