package org.example;

public class MusicPlayer {
    private Music music;

    //IoC инверсия управления (объект извне)
    public MusicPlayer(Music music) {
        this.music = music; //полиморфизм; внедрение зависимости через конструктор
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
