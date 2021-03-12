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
@Table(name="Fournisseur")
public class Fournisseur extends AbstractEntity{

    @Column(name="CodeFournisseur")
    private String CodeFournisseur;

    @Column(name="RaisonSocial")
    private String RaisonSocial;

}
