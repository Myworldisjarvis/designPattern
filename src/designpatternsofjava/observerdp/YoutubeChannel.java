package designpatternsofjava.observerdp;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

    List<Observer> subscriber = new ArrayList<>();
    String tital;

    @Override
    public void subscrib(Observer ob) {
        this.subscriber.add(ob);
    }

    @Override
    public void unSubscrib(Observer ob) {
      this.subscriber.remove(ob);
    }

    @Override
    public void notifyChanges(String title) {
        for(Observer ob : this.subscriber){
            ob.notified(title);
        }
    }

    
}
