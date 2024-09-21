package designpatternsofjava.singeltondp;


//*****************************Eager Way to create single object (it is not good consume memory if we not use )
public class SingaletonDPEagerWay {
private static SingaletonDPEagerWay singaletonDPEagerWay = new SingaletonDPEagerWay();

private SingaletonDPEagerWay(){}

public static SingaletonDPEagerWay getSDP(){
     return singaletonDPEagerWay;
}
    
    
}
