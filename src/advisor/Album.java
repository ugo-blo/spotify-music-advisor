package advisor;

import java.util.Collections;
import java.util.List;

public class Album {
    private final String name;
    private final List<Artist> artist;

    public Album(String name, List<Artist> artist) {
        this.name = name;
        this.artist = Collections.unmodifiableList(artist);
    }

    public String getName() {
        return name;
    }

    public List<Artist> getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" [");
        for (int i = 0; i < artist.size(); i++) {
            sb.append(artist.get(i).getName());
            if (i < artist.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
