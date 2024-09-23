package designpatternsofjava.prototypedp;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating object");
        NeworkConnection nc = new NeworkConnection();
        nc.setIp("192.168.4.4");
        nc.loadVeryImpornentData();

        System.out.println(nc);

        try {

            NeworkConnection nc2 = (NeworkConnection) nc.clone();
            NeworkConnection nc3 = (NeworkConnection) nc.clone();

            nc.getDomains().remove(0);

            System.out.println(nc);
            System.out.println(nc2);
            System.out.println(nc3);
        } catch (Exception e) {
        }

    }

}
