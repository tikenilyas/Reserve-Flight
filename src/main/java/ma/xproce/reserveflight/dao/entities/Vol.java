package ma.xproce.reserveflight.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Vol {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String jourDepart;
        private String heureDepart;
        private String jourArrive;
        private String heureArrive;
        @ManyToOne
        private Compagnie compagnie;
        @ManyToOne
        private Aeroport aeroportDepart;
        @ManyToOne
        private Aeroport aeroportArrive;
        @OneToMany(mappedBy = "vol")
        private Collection<Reservation> reservations;
        @OneToMany
        private Collection<Escal> escals;


    }
