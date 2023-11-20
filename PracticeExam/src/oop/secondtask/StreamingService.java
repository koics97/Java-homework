package oop.secondtask;

import java.util.List;

public class StreamingService implements MusicPlayer, Playlist {
    private final List<Song> songList;
    private int actualSongId;
    private final boolean isRepeatAllowed;

    public StreamingService(List<Song> songList, boolean isRepeatAllowed) {
        this.songList = songList;
        this.isRepeatAllowed = isRepeatAllowed;
        this.actualSongId = 0;
    }

    @Override
    public void play() throws InterruptedException {
        for (Song song : songList) {
            System.out.println("Now playing " + ++actualSongId + ". song: " + song.getTitle());
            Thread.sleep(song.getLength());
            System.out.println("Song ended");
        }
        if (isRepeatAllowed) {
            actualSongId = 0;
            play();
        }
        stop();
    }

    @Override
    public void stop() {
        System.out.println("App is closing... Bye!");
    }

    @Override
    public void addSong(Song song) {
        songList.add(song);
    }

    @Override
    public void removeSong(Song song) {
        songList.remove(song);
    }
}
