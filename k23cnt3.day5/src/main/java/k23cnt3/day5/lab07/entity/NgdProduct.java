package k23cnt3.day5.lab07.entity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.context.annotation.Primary;
@Entity
@Table (name = "products")
@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NgdProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String imageUrl;
    Integer quantity;
    Double price;
    String content;
    Boolean status;
    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    NgdCategory category;
}
