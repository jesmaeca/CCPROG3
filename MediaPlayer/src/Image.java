public class Image implements Playable{
    private String img;

    public Image(String img) {
        this.img = img;
    }

    @Override
    public String getAudio() {
        return null;
    }

    @Override
    public String getVideo() {
        return img;
    }

    @Override
    public boolean hasAudio() {
        return false;
    }

    @Override
    public boolean hasVideo() {
        return true;
    }
}
