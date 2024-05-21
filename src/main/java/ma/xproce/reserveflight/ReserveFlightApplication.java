package ma.xproce.reserveflight;

import ma.xproce.reserveflight.dao.entities.Aeroport;
import ma.xproce.reserveflight.dao.entities.Passager;
import ma.xproce.reserveflight.dao.entities.Vol;
import ma.xproce.reserveflight.dao.repositories.AeroportR;
import ma.xproce.reserveflight.dao.repositories.PassagerR;
import ma.xproce.reserveflight.dao.repositories.VolR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReserveFlightApplication {
    @Autowired
    VolR volR;
    @Autowired
    AeroportR aeroportR;
    @Autowired
    PassagerR passagerR;
    public static void main(String[] args) { SpringApplication.run(ReserveFlightApplication.class, args);}
        @Bean
        public CommandLineRunner start() {
            return args -> {
                Vol vol=new Vol(null,"jeudi","12:00","vendredi","01:00",null,null,null,null,null);
                Aeroport aeroport=new Aeroport(null,"m5",null,null,null);
                Passager passager=new Passager(null,"ilyas",null);
                volR.save(vol);
                aeroportR.save(aeroport);
                passagerR.save(passager);

            };
        }


}
