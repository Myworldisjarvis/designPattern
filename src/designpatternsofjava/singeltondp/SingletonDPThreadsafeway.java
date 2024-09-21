package designpatternsofjava.singeltondp;

public class SingletonDPThreadsafeway {

    private static SingletonDPThreadsafeway singletonDPThreadsafeway;

    private SingletonDPThreadsafeway() {
        
        // 1) tarika 1 to protect 
        if(singletonDPThreadsafeway!=null){
        
            throw  new RuntimeException("You are tring to break singleton dp");
        }
        
    }

//it is good in without thread seafty (in single thread) its not good for multiple threads
//***********************lazy way of creating single object***********************
    public static SingletonDPThreadsafeway getSDP() {

        if (singletonDPThreadsafeway == null) {

            synchronized (SingletonDPThreadsafeway.class) {
                if (singletonDPThreadsafeway == null) {
                    singletonDPThreadsafeway = new SingletonDPThreadsafeway();
                }
            }

        }

        return singletonDPThreadsafeway;
    }
}
