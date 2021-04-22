package ml.intelis.maeci.stock.Service;

import ml.intelis.maeci.stock.Entity.Client;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientServiceImpl implements ClientService {


    /**
     * Toutes les methodes pour la lecture de données selon critere
     */
    @Override
    public List<Client> findAll() {
        return null;
    }

    @Override
    public Client findById(Long id) {
        return null;
    }

    @Override
    public Client findByEmail(String email) {
        return null;
    }

    @Override
    public Client findByRaisonSocial(String RaisonSocial) {
        return null;
    }

    @Override
    public Client findByName(String Nom) {
        return null;
    }

    /**
     * Methode pour enregistrer de la data
     *
     * @param client
     */
    @Override
    public Client save(Client client) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
