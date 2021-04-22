package ml.intelis.maeci.stock.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="Client")
public class Client extends AbstractEntity{

    @Column(name="Nom", nullable = false)
    private String Nom;

    @Column(name="Prenom", nullable = false)
    private String Prenom;

    @Column(name="RaisonSocial", nullable = false)
    private String RaisonSocial;

    @Column(name="CodeProduit", nullable = false)
    private String CodeProduit;

    @Column(name="Tel")
    private String Tel;

    @Column(name="Email", nullable = false)
    private String Email;

}

