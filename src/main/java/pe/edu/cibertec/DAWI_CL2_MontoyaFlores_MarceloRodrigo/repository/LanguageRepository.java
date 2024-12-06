package pe.edu.cibertec.DAWI_CL2_MontoyaFlores_MarceloRodrigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DAWI_CL2_MontoyaFlores_MarceloRodrigo.entity.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer> {
}
