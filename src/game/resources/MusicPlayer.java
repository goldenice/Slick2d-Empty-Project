package game.resources;

import org.newdawn.slick.Music;
import org.newdawn.slick.MusicListener;

public class MusicPlayer {

    private Music music;
    private Music next;

    public void setNext(Music music) {
        if (this.music == null) {
            this.music = music;
            this.music.play();
            final MusicPlayer player = this;
            this.music.addListener(new MusicListener() {
                @Override
                public void musicEnded(Music music) {
                    if (next == null) {
                        player.music.play();
                    } else {
                        player.music = next;
                        player.music.play();
                        next = null;
                    }
                }

                @Override
                public void musicSwapped(Music music, Music music1) {}
            });
            return;
        }
        next = music;
    }

}
