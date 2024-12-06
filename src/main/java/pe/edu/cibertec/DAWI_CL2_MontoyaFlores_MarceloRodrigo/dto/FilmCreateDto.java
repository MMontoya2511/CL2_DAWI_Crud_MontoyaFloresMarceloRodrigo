package pe.edu.cibertec.DAWI_CL2_MontoyaFlores_MarceloRodrigo.dto;

public record FilmCreateDto(
        String title,
        String description,
        Integer releaseYear,
        Integer languageId,
        Integer rentalDuration,
        Double rentalRate,
        Integer length,
        Double replacementCost,
        String rating,
        String specialFeatures
) {
}
