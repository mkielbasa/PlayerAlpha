package com.grnroom.playeralphaserver.discord;

import com.grnroom.playeralphaserver.config.EngineProperties;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class EngineBot {

    private DiscordApi api;
    private static EngineBot instance;
    private static final String INTRO =
            """
                     _____  _                       ______             _           \s
                    |  __ \\| |                     |  ____|           (_)          \s
                    | |__) | | __ _ _   _  ___ _ __| |__   _ __   __ _ _ _ __   ___\s
                    |  ___/| |/ _` | | | |/ _ \\ '__|  __| | '_ \\ / _` | | '_ \\ / _ \\
                    | |    | | (_| | |_| |  __/ |  | |____| | | | (_| | | | | |  __/
                    |_|    |_|\\__,_|\\__, |\\___|_|  |______|_| |_|\\__, |_|_| |_|\\___|
                                     __/ |                        __/ |            \s
                                    |___/                        |___/       \s""".indent(1);
    private static final String VERSION = "0.1";

    public static EngineBot getInstance () {
        if (instance == null) {
            instance = new EngineBot();
            instance.initialize();
        }
        return instance;
    }

    public void displayIntro () {
        System.out.println(INTRO);
        System.out.println("Version: " + VERSION);
    }

    private void initialize () {
        String token = EngineProperties.getString("discord_api_token");
        this.api = new DiscordApiBuilder().setToken(token).login().join();
    }

    public DiscordApi getApi() {
        return api;
    }


}
