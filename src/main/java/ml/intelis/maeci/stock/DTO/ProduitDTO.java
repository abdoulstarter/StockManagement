package ml.intelis.maeci.stock.DTO;

import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Builder
@Data
public class ProduitDTO {

    private String CodeProduit;

    private String Designation;

    private BigDecimal PrixUnitaireHT;

    private BigDecimal TauxTva;

    private BigDecimal PrixUnitaireTTC;

    private String Photo;

    private Boolean IsActived;

    private Boolean IsDelete;

    private CategoryProduitDTO categoryProduit;

    private TypeProduitDTO typeProduit;

}
