package oop.secondtask;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            songs.add(new Song("Highway to hell", 2000));
            songs.add(new Song("Stairway to heaven", 2000));
        }

        StreamingService streamingService = new StreamingService(songs, false);
        streamingService.addSong(new Song("We're not gonna take it", 2000));
        streamingService.removeSong(songs.get(1));
        streamingService.play();
    }
}
