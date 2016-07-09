package main.offTopic;

import main.service.PlayerService;

import java.io.File;

/**
 * Created by Kiox on 09.07.2016.
 */
public class start {

    public static void main(String[] args){
        PlayerService service = new PlayerService(new File("radio/ressources/streams/technobase.asx"));
        System.out.println("File is valid: "+service.isFileValid());
    }
}
