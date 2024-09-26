package designpatternsofjava.adapterdp;

public class AdapterMain {
    public static void main(String[] args) {
        
        System.out.println("Program started");
        
        AppleCharger charger = new AdapterCharger(new DkCharger());
        
        Iphone13 iphone13 = new Iphone13(charger);
        iphone13.chargeIphone();
    }


    
}
