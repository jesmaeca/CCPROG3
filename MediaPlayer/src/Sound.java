public class Sound implements Playable{
    private String sound;

    public Sound(String sound) {
        this.sound = sound;
    }

    @Override
    public String getAudio() {
        return sound;
    }

    @Override
    public String getVideo() {
        return null;
    }

    @Override
    public boolean hasAudio() {
        return true;
    }

    @Override
    public boolean hasVideo() {
        return false;
    }
}
