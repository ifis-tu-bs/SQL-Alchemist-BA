package de.tu_bs.cs.ifis.sqlgame;

import com.typesafe.config.ConfigFactory;
import com.typesafe.config.Config;

public class Template {
    
    public static void main(String[] args) {
        Config conf = ConfigFactory.load();
        String welcometext = conf.getString("template.welcometext");
        System.out.println(welcometext);
    }
    
}