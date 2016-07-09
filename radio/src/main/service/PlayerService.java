package main.service;

import java.io.File;

/**
 * This Class represent the Player and plays/stops etc Streams
 * Created by Kiox on 09.07.2016.
 */
public class PlayerService {

    File radioStream;

    public PlayerService(File radioStream){
        this.radioStream = radioStream;
    }

    public void playStream(){

    }

    public boolean isFileValid(){
        return radioStream.exists();
    }
}
