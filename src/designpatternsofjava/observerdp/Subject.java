package designpatternsofjava.observerdp;

public interface Subject {
    
    void subscrib(Observer ob);
    void unSubscrib(Observer ob);
    
    void notifyChanges(String title);
    
}
