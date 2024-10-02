import java.util.Objects;

public class Song {
    private String title;
    private String artist;
    private int length;

    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(title, song.title) && Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }

    public static void main(String[] args) {
        Song song1 = new Song("Imagine", "John Lennon", 183);
        Song song2 = new Song("Imagine", "John Lennon", 183);
        System.out.println(song1.equals(song2)); // true
        System.out.println(song1.hashCode() == song2.hashCode()); // true
    }
}

