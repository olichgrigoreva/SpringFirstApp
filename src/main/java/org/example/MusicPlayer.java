package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MusicPlayer {
    private Music music;
    private List<Music> musicList = new ArrayList<>();

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //IoC инверсия управления (объект извне)
    public MusicPlayer(Music music) {
        this.music = music; //полиморфизм; внедрение зависимости через конструктор
    }

    public MusicPlayer() {
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    public void playMusicList(){
        ListIterator<Music> li = musicList.listIterator();
        while (li.hasNext()){
            System.out.println(li.next().getSong());
        }
    }
}
