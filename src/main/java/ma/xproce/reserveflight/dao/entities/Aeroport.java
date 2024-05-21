package ma.xproce.reserveflight.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Aeroport {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
    private String name;
    @OneToMany(mappedBy = "aeroportDepart")
    private Collection<Vol> volsDepart;
    @OneToMany(mappedBy = "aeroportArrive")
    private Collection<Vol> volsArrive;
    @OneToMany
    private Collection<Escal> escals;

}





