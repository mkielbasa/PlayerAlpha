package com.grnroom.playeralphaserver;

import com.grnroom.playeralphaserver.discord.EngineBot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayerAlphaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlayerAlphaServerApplication.class, args);
        EngineBot.getInstance().displayIntro();
    }
}
