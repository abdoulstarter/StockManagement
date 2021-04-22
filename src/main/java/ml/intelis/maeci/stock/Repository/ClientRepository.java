package ml.intelis.maeci.stock.Repository;

import ml.intelis.maeci.stock.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ClientRepository extends JpaRepository<Client, Long> {

    /**
     * Finds Client by email
     * @param Email to look for
     * @return Client by given email
     */
    Client findByEmail(String Email);

    /**
     * Finds Client by name
     * @param Nom to look for
     * @return Client by given name
     */
    Client findByNom(String Nom);


    /**
     * Finds Client by name
     * @param RaisonSocial to look for
     * @return Client by given RaisonSocial
     */
    Client findByRaisonSocial(String RaisonSocial);

    /**
     * Finds Client by Id
     * @param Id to look for
     * @return Client by given Id
     */
    Client findById(Integer Id);


}
