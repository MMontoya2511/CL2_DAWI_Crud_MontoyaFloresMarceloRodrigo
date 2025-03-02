package pe.edu.cibertec.DAWI_CL2_MontoyaFlores_MarceloRodrigo.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class FilmActorId implements Serializable {

    private Integer actorId;
    private Integer filmId;

}