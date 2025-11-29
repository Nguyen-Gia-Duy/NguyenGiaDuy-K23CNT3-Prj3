package NguyenGiaDuy.ToyStore.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Toy toy;

    private int quantity;

    // GETTERS & SETTERS
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }

    public Toy getToy() { return toy; }

    public void setToy(Toy toy) { this.toy = toy; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }
}
