package lavalink.server.player;

import com.sedmelluq.discord.lavaplayer.tools.FriendlyException;
import com.sedmelluq.discord.lavaplayer.track.AudioTrack;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;

class LoadResult {
    public ResultStatus loadResultType;
    public List<AudioTrack> tracks;
    public String playlistName;
    public String playlistAuthor;
    public String playlistAuthorUrl;
    public String playlistImage;
    public Integer selectedTrack;
    public FriendlyException exception;

    public LoadResult(ResultStatus loadResultType, List<AudioTrack> tracks,
                      @Nullable String playlistName, @Nullable String playlistAuthor, @Nullable String playlistAuthorUrl,
                      @Nullable String playlistImage, @Nullable Integer selectedTrack) {

        this.loadResultType = loadResultType;
        this.tracks = Collections.unmodifiableList(tracks);
        this.playlistName = playlistName;
        this.playlistAuthor = playlistAuthor;
        this.playlistAuthorUrl = playlistAuthorUrl;
        this.playlistImage = playlistImage;
        this.selectedTrack = selectedTrack;
        this.exception = null;
    }

    public LoadResult(FriendlyException exception) {
        this.loadResultType = ResultStatus.LOAD_FAILED;
        this.tracks = Collections.emptyList();
        this.playlistName = null;
        this.playlistAuthor = null;
        this.playlistAuthorUrl = null;
        this.playlistImage = null;
        this.selectedTrack = null;
        this.exception = exception;
    }
}
