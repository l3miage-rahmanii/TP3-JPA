package fr.uga.l3miage.tp3.exo1.components;

import fr.uga.l3miage.tp3.exo1.enums.GenreMusical;
import fr.uga.l3miage.tp3.exo1.models.ArtistEntity;
import fr.uga.l3miage.tp3.exo1.models.SongEntity;
import fr.uga.l3miage.tp3.exo1.models.UserEntity;
import fr.uga.l3miage.tp3.exo1.repositories.ArtistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.*;

import java.time.Duration;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class ArtistComponent {
    private final ArtistRepository artistRepository;

    public ArtistEntity getArtist(String name){
        return artistRepository.findById(name).orElseThrow();
    }

    public ArtistEntity creatArtist(ArtistEntity artistEntity){
        return artistRepository.save(artistEntity);
    }

    public void deleteArtist(String name){
        artistRepository.deleteById(name);
    }

    public Set<ArtistEntity> getNumbetArtistesByGenre(GenreMusical genreMusical){
        return  artistRepository.countArtistEntityByGenreMusical(genreMusical);
    }

}
