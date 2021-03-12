package ml.intelis.maeci.stock.Entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Data
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class AbstractEntity implements Serializable {
    @Id
    @GeneratedValue
        private Integer id;
    @CreatedDate
    @Column(name="DateCreation", nullable = false)
        private Instant DateCreation;
    @LastModifiedDate
        private Instant DateModification;
}
