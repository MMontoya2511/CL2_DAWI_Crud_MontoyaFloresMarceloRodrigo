package pe.edu.cibertec.DAWI_CL2_MontoyaFlores_MarceloRodrigo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer languageId;
    private String name;
    private Date lastUpdate;

    @OneToMany(mappedBy = "language")
    private List<Film> films;
}
