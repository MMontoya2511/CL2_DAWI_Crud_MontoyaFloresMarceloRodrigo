package pe.edu.cibertec.DAWI_CL2_MontoyaFlores_MarceloRodrigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.DAWI_CL2_MontoyaFlores_MarceloRodrigo.entity.Rental;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Integer> {
    @Modifying
    @Transactional
    @Query("DELETE FROM Rental r WHERE r.inventory.id IN (SELECT i.id FROM Inventory i WHERE i.film.id = :filmId)")
    void deleteByFilmId(Integer filmId);
}
