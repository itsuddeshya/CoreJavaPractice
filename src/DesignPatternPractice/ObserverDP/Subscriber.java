package DesignPatternPractice.ObserverDP;

import java.nio.channels.Channel;

public class Subscriber {
    private String name;
    private Channel1 channel1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void update(){
        System.out.println("Video uploaded");
    }
}
