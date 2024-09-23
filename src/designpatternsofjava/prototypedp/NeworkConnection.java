package designpatternsofjava.prototypedp;

import java.util.ArrayList;
import java.util.List;

public class NeworkConnection implements Cloneable{

    private  String Ip;
    private String  data;
    private List<String> domains = new ArrayList<>();

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getIp() {
        return Ip;
    }

    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public void loadVeryImpornentData() throws InterruptedException{
        this.data = "Very Very Important data";
//           it will take 5 minitues


        domains.add("www.xyz.com");
        domains.add("www.abc.com");
        domains.add("www.pq.com");
        domains.add("www.google.com");
        Thread.sleep(2000);
    }

    @Override
    public String toString() {
        return "NeworkConnection{" + "Ip=" + Ip + ", data=" + data + ", domains=" + domains + '}';
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        
        //logic for cloning
        
        NeworkConnection nc = new NeworkConnection();
        nc.setIp(this.getIp());
        nc.setDomains(this.getDomains());
        nc.setData(this.getData());
        
        for(String d : this.getDomains()){
        
        nc.getDomains().add(d);
        
        }
        
        return nc;
    }

    
    
}
