package NguyenGiaDuy.ToyStore.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Wishlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Toy toy;
}
