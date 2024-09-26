package designpatternsofjava.observerdp;

public class Subsriber implements Observer{

    String name;
    
    
    Subsriber(String name)
    {
    this.name = name;
    }
    
    @Override
    public void notified(String title) {
            System.out.println("Hello "+name+" new video uploaded : "+title);
    }
    
}
