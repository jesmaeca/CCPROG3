public class Video implements Playable{
    private String video;
    private String sound;

    public Video(String video) {
        this.video = video;
    }

    @Override
    public String getAudio() {
        return sound;
    }

    @Override
    public String getVideo() {
        return video;
    }

    @Override
    public boolean hasAudio() {
        return true;
    }

    @Override
    public boolean hasVideo() {
        return true;
    }
}
