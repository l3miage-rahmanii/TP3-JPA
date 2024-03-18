package fr.uga.l3miage.tp3.exo1.components;

import fr.uga.l3miage.tp3.exo1.models.AlbumEntity;
import fr.uga.l3miage.tp3.exo1.models.SongEntity;
import fr.uga.l3miage.tp3.exo1.repositories.AlbumRepository;
import fr.uga.l3miage.tp3.exo1.repositories.SongRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.*;

import java.time.Duration;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class SongComponent {

    private final SongRepository songRepository;

    public SongEntity getSong(String title){
        return songRepository.findById(title).orElseThrow();
    }

    public SongEntity creatSong(SongEntity songEntity){
        return songRepository.save(songEntity);
    }

    public void deleteSong(String title){
        songRepository.deleteById(title);
    }

    public Set<SongEntity> getSongByDuration(Duration min, Duration max){
        return  songRepository.findAllByDurationBetween(min,max);
    }

}