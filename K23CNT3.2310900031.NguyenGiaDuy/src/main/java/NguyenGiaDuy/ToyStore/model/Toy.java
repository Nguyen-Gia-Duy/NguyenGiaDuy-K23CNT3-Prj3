package NguyenGiaDuy.ToyStore.model;


import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Toy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private String description;

    private int stock;           // Tồn kho
    private String mainImageUrl; // Ảnh chính

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "toy", cascade = CascadeType.ALL)
    private List<ProductImage> images;

    @OneToMany(mappedBy = "toy")
    private List<Review> reviews;
    public void setId(Long id) {
        this.id = id;
    }
}