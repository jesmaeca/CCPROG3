public class Song extends Sound{
    private String coverImg;

    @Override
    public Song(String sound, String coverImg) {

    }

    @Override
    public String getVideo() {
        return coverImg;
    }

    public boolean hasVideo() {
        return true;
    }

}
