package ma.xproce.reserveflight.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Escal {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String heureDepart;
        private String heureArrive;
        @ManyToOne
        private Aeroport aeroport;
        @ManyToOne
        private Vol vol;


    }

