import java.util.ArrayList;

public class MemoryCard {
    private ArrayList<Playable> mediaList;
    private int id;

    public MemoryCard(int id) {

    }

    public Playable getPlayable(int idx) {
        return mediaList.get(idx);
    }

    public void addPlayable (Playable p) {
    }

}
