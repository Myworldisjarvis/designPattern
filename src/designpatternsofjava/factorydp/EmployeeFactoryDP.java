package designpatternsofjava.factorydp;

class EmployeeFactoryDP {

    public static Employee getE(String eType) {
       if(eType.trim().equalsIgnoreCase("Adev")){
       return  new ADev();
       }else if(eType.trim().equalsIgnoreCase("WDev")){
       return new WDev();
       }else{
       return  null;
       }
        
    }
    
}
