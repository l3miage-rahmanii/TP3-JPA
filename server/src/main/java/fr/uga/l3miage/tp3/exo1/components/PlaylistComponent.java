package fr.uga.l3miage.tp3.exo1.components;

import fr.uga.l3miage.tp3.exo1.models.PlaylistEntity;
import fr.uga.l3miage.tp3.exo1.models.SongEntity;
import fr.uga.l3miage.tp3.exo1.repositories.PlaylistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.*;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class PlaylistComponent {

    private final PlaylistRepository playlistRepository;

    public PlaylistEntity getPlaylist(String name){
        return playlistRepository.findById(name).orElseThrow();
    }

    public PlaylistEntity creatPlaylist(PlaylistEntity playlistEntity){
        return playlistRepository.save(playlistEntity);
    }

    public void deletePlaylist(String titel){
        playlistRepository.deleteById(titel);
    }

    public Set<PlaylistEntity> getPlaylistsContainingSong(SongEntity songEntity){
        return playlistRepository.findPlaylistEntitiesBySongEntities(songEntity);
    }

}
