package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    @Autowired
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(Genre genre) {
        Random random = new Random();
        int song = random.nextInt(3);
        if (genre == Genre.CLASSICAL) {
            return classicalMusic.getSong().get(song).toString();
        }
        if (genre == Genre.ROCK) {
            return rockMusic.getSong().get(song).toString();
        }
        return "fgngj";
    }

}
