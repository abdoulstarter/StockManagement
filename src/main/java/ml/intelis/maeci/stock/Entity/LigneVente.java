package ml.intelis.maeci.stock.Entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="LigneVente")
public class LigneVente extends AbstractEntity{

    @Column(name="Quantite")
    private String Quantite;
}
