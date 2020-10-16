package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //обращение к applicationContext и помещает описанные бины в контекст
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        //Music music = context.getBean("musicBean", Music.class); //интф подход! (id, интф)
        //объект с конкретной реализацией берется из applicationContext, т.е. заново компилировать не надо

        //внедрение зависомости (dependency injection) вручную
        //MusicPlayer musicPlayer = new MusicPlayer(music);
        //dependency injection
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        System.out.println(musicPlayer.getName() + " " + musicPlayer.getVolume());
        context.close();
    }
}
