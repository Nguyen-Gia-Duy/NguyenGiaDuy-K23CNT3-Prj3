package NguyenGiaDuy.ToyStore.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime createDate;
    private double totalPrice;

    private String shippingAddress;
    private String status; // PENDING, CONFIRMED, SHIPPING, COMPLETED

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> items;
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}