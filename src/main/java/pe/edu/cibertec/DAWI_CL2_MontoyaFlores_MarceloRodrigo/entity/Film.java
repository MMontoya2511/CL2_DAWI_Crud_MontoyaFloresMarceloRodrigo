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
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer filmId;
    private String title;
    private String description;
    private Integer releaseYear;
    private Integer originalLanguageId;
    private Integer rentalDuration;
    private Double rentalRate;
    private Integer length;
    private Double replacementCost;
    private String rating;
    private String specialFeatures;
    private Date lastUpdate;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;

    //Relacion con Inventory
    @OneToMany(mappedBy = "film")
    private List<Inventory> inventories;

    //Relacion con filmCategory
    @OneToMany(mappedBy = "film")
    private List<FilmCategory> filmCategories;

    //Relacion con filmActor
    @OneToMany(mappedBy = "film", cascade = CascadeType.REMOVE)
    private List<FilmActor> filmActors;




}