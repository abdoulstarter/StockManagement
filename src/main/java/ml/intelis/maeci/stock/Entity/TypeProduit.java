package ml.intelis.maeci.stock.Entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="TypeProduit")
public class TypeProduit extends AbstractEntity{

    @Column(name = "Code")
    private String Code ;

    @Column(name = "Intitulé")
    private String Intitulé ;

    @OneToMany(mappedBy = "typeProduit")
    private List<Produit> produits;

}
