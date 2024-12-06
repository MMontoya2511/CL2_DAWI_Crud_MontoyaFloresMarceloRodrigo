package pe.edu.cibertec.DAWI_CL2_MontoyaFlores_MarceloRodrigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.DAWI_CL2_MontoyaFlores_MarceloRodrigo.entity.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {
    @Modifying
    @Transactional
    @Query("DELETE FROM Film f WHERE f.id = :filmId")
    void deleteByFilmId(Integer filmId);
}
