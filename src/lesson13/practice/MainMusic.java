package startKmet.lesson13.practice;

public class MainMusic extends MusicStyles {

    public static void main(String[] args) {
        MusicStyles adele = new PopMusic();
        adele.playMusic();

        MusicStyles beethoven = new ClassicMusic();
        beethoven.playMusic();
    }

    @Override
    public void playMusic() {

    }
}
