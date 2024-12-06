package pe.edu.cibertec.DAWI_CL2_MontoyaFlores_MarceloRodrigo.service;

import pe.edu.cibertec.DAWI_CL2_MontoyaFlores_MarceloRodrigo.dto.FilmCreateDto;
import pe.edu.cibertec.DAWI_CL2_MontoyaFlores_MarceloRodrigo.dto.FilmDetailDto;
import pe.edu.cibertec.DAWI_CL2_MontoyaFlores_MarceloRodrigo.dto.FilmDto;

import java.util.List;

public interface MaintenanceService {

    List<FilmDto> findAllFilms();

    FilmDetailDto findFilmById(int id);

    Boolean updateFilm(FilmDetailDto filmDetailDto);

    Boolean createFilm(FilmCreateDto filmCreateDto);

    Boolean deleteFilm(int filmId);
}
