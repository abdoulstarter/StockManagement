package ml.intelis.maeci.stock.Entity;


import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Produit")
public class Produit extends AbstractEntity{

    @Column(name="CodeProduit")
    private String CodeProduit;

    @Column(name="Designation")
    private String Designation;

    @Column(name="PrixUnitaireHT")
    private BigDecimal PrixUnitaireHT;

    @Column(name="TauxTva", nullable = false)
    private BigDecimal TauxTva;

    @Column(name="PrixUnitaireTTC")
    private BigDecimal PrixUnitaireTTC;

    @Column(name="Photo")
    private String Photo;

    @Column(name="IsActived", nullable = false)
    private Boolean IsActived;

    @Column(name="IsDelete", nullable = false)
    private Boolean IsDelete;

    @ManyToOne
    @JoinColumn(name = "idCategoryProduit")
    private CategoryProduit categoryProduit;

    @ManyToOne
    @JoinColumn(name = "idTypeProduit")
    private TypeProduit typeProduit;


}
