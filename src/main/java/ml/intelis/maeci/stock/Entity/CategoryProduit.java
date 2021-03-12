package ml.intelis.maeci.stock.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="CategoryProduit")
public class CategoryProduit extends AbstractEntity{

    @Column(name = "Code")
    private String Code ;

    @Column(name = "Intitulé")
    private String Intitulé ;

    @OneToMany(mappedBy = "typeProduit")
    private List<Produit> produits;
}
