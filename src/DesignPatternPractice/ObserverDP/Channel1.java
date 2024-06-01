package DesignPatternPractice.ObserverDP;

import java.util.ArrayList;
import java.util.List;

public class Channel1 {
    List<Subscriber> subs = new ArrayList<>();
    private String title;
    public void subscribe(Subscriber sub){
        subs.add(sub);
    }
    public void unsubscribe(Subscriber sub){
        subs.remove(sub);
    }
    public void notifySubscribers(){
        for(Subscriber sub:subs){
            sub.update();
        }
        //public vois upload;
    }
}
