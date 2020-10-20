package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //обращение к applicationContext и помещает описанные бины в контекст
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusicBean1 = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusicBean2 = context.getBean("musicBean", ClassicalMusic.class);
        //System.out.println(classicalMusicBean.getSong());

        context.close();
    }
}
