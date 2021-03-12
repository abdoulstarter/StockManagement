package ml.intelis.maeci.stock.Entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Vente")
public class Vente extends AbstractEntity{

    @Column(name="Date")
    private Date DateVente;
}
