package pe.edu.cibertec.DAWI_CL2_MontoyaFlores_MarceloRodrigo.dto;


import java.util.List;

public record FilmDto(
        Integer filmId,
        String title,
        Integer releaseYear,
        Integer rentalDuration,
        Double rentalRate,
        String languageName,
        Integer languageId,
        List<Integer> inventoryIds,
        List<Integer> categoryIds,
        List<Integer> actorIds) {
}