package fr.uga.l3miage.tp3.exo1.repositories;

import fr.uga.l3miage.tp3.exo1.models.AlbumEntity;
import fr.uga.l3miage.tp3.exo1.models.PlaylistEntity;
import fr.uga.l3miage.tp3.exo1.models.SongEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface PlaylistRepository extends JpaRepository<PlaylistEntity, String> {
    Set<PlaylistEntity> findPlaylistEntitiesBySongEntities(SongEntity songEntity);
}
