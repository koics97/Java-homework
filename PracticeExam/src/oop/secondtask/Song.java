package oop.secondtask;

public class Song {
    private String title;
    private int length;

    public Song() {

    }

    public Song(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
}
