package Adapter;

public class BToAAdapter implements Aplayer{

    private Bplayer media;

    public BToAAdapter(Bplayer media) {
        this.media = media;
    }

    @Override
    public void play(String fileName) {
        System.out.print("Using Adapter : ");
        media.playFile(fileName);
    }

    @Override
    public void stop() {
    }
}
