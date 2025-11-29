package NguyenGiaDuy.ToyStore.controller.admin;
import NguyenGiaDuy.ToyStore.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import NguyenGiaDuy.ToyStore.service.OrderService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/admin/orders")
public class OrderControllerAdmin {

    private final OrderService service;

    public OrderControllerAdmin(OrderService service) {
        this.service = service;
    }

    @GetMapping
    public List<Order> getAll() {
        return service.findAll();
    }

    @PutMapping("/{id}/status")
    public Order updateStatus(@PathVariable Long id, @RequestParam String status) {
        Order order = service.findById(id);
        order.setStatus(status);
        return service.save(order);
    }
}

