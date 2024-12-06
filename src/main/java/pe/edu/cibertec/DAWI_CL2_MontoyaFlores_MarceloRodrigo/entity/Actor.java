package pe.edu.cibertec.DAWI_CL2_MontoyaFlores_MarceloRodrigo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer actorId;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "actor")
    private List<FilmActor> filmActors;
}
