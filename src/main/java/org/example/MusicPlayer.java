package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;

    //IoC инверсия управления (объект извне)
    @Autowired
    public MusicPlayer(ClassicalMusic music) {
        this.classicalMusic = music; //полиморфизм; внедрение зависимости через конструктор
    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong();
    }

}
