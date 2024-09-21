package designpatternsofjava.singeltondp;

public class SingaltonDPLazyWay {
    
private static SingaltonDPLazyWay singaltonDP;

private SingaltonDPLazyWay(){

}

//it is good in without thread seafty (in single thread) its not good for multiple threads
//***********************lazy way of creating single object***********************
public static SingaltonDPLazyWay getSDP(){
    
    if(singaltonDP==null){
    singaltonDP = new SingaltonDPLazyWay();
    }
    return singaltonDP;
}
}
