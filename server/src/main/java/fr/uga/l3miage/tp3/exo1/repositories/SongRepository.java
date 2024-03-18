package fr.uga.l3miage.tp3.exo1.repositories;

import fr.uga.l3miage.tp3.exo1.models.AlbumEntity;
import fr.uga.l3miage.tp3.exo1.models.SongEntity;
import fr.uga.l3miage.tp3.exo1.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Duration;
import java.util.Set;

public interface SongRepository extends JpaRepository<SongEntity, String> {
    Set<SongEntity> findAllByDurationBetween(Duration min, Duration max);
}
