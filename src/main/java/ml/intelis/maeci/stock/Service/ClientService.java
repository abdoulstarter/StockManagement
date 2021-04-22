package ml.intelis.maeci.stock.Service;

import ml.intelis.maeci.stock.Entity.Client;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ClientService {

        /**Toutes les methodes pour la lecture de données selon critere
         *
         */

        List<Client> findAll();
        Client findById(Long id);
        Client findByEmail(String email);
        Client findByRaisonSocial(String RaisonSocial);
        Client findByName(String Nom);

        /**
        *Methode pour enregistrer de la data
         */
        Client save(Client client);

        /*
        *Methode pour supprimer de la data
         */
        void delete(Long id);

        /**
         * Methode pour mettre a jour da la data
         */



}
