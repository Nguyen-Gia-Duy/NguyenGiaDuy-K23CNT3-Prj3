package NguyenGiaDuy.ToyStore.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int rating;            // 1–5 sao
    private String comment;
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "toy_id")
    private Toy toy;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
