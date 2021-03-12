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
@Table(name="Permission")
public class Permission extends AbstractEntity{

    @Column(name="Nom")
    private String Nom;
}
