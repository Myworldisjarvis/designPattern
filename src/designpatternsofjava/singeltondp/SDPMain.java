package designpatternsofjava.singeltondp;

import java.lang.reflect.Constructor;

public class SDPMain {

    public static void main(String[] args) throws Exception {

        //lazy way object and hashcode same
        SingaltonDPLazyWay sdp = SingaltonDPLazyWay.getSDP();
        System.out.println(sdp.hashCode());
        SingaltonDPLazyWay sdp1 = SingaltonDPLazyWay.getSDP();
        System.out.println(sdp1.hashCode());
        System.out.println(sdp);
        System.out.println(sdp1);

        System.out.println("****************************************");

        //Eager way object and hashcode same
        SingaletonDPEagerWay sdp2 = SingaletonDPEagerWay.getSDP();
        System.out.println(sdp2);
        SingaletonDPEagerWay sdp3 = SingaletonDPEagerWay.getSDP();
        System.out.println(sdp3);

        System.out.println("****************************************");
        //thread safe way
        SingletonDPThreadsafeway sdpts1 = SingletonDPThreadsafeway.getSDP();
        System.out.println(sdpts1);
        SingletonDPThreadsafeway sdpts2 = SingletonDPThreadsafeway.getSDP();
        System.out.println(sdpts2);

        System.out.println("****************************************");

        //reflection API se singleton break karna 
        // solution hai iske 2 
        //(1) if object is exist == throw excption from inside constroctor  ----- SingletonDPThreadsafeway
        //(2) ya fir ham Enum use kare ---- SDPEnumProtection
        SingletonDPThreadsafeway sdpBreak = SingletonDPThreadsafeway.getSDP();
        System.out.println(sdpBreak.hashCode());
        System.out.println(sdpBreak);

//        // singleton break karna ( constructor se exception de di ab to nhi banega naya instance )
//         (agar vo exception hata te const. se to ban jayega ) 
        Constructor<SingletonDPThreadsafeway> constructor = SingletonDPThreadsafeway.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonDPThreadsafeway newInstance = constructor.newInstance();
        System.out.println(newInstance);

        System.out.println("****************************************");
        // protect call enum

        SDPEnumProtection sdpEnum1 = SDPEnumProtection.INCTANCE;
        System.out.println(sdpEnum1.hashCode());
        System.out.println(sdpEnum1);

    }

}
