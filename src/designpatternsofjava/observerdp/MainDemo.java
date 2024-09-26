package designpatternsofjava.observerdp;

public class MainDemo {

    public static void main(String[] args) {

        YoutubeChannel yc = new YoutubeChannel();
        

        Subsriber sadaf = new Subsriber("sadaf");
        Subsriber aman = new Subsriber("aman");
        
        yc.subscrib(sadaf);
        yc.subscrib(aman);
        
        yc.unSubscrib(aman);
        yc.notifyChanges("Learn dessigne pattern");
        yc.notifyChanges("angular cource one shot");
        
        
    }

}
