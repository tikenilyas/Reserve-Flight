package ma.xproce.reserveflight.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Reservation {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String date;
        @ManyToOne
        private Vol vol;
        @ManyToOne
        private Client client;
        @ManyToOne
        private Passager passager;

}
