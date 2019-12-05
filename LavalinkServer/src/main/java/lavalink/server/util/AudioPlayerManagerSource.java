package lavalink.server.util;

import com.sedmelluq.discord.lavaplayer.player.AudioPlayerManager;

public interface AudioPlayerManagerSource {
    AudioPlayerManager get();
}
