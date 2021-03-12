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
@Table(name="CommandeClient")

public class CommandeClient extends AbstractEntity{

    @Column(name="CodeCommande")
    private String CodeCommande;

}
