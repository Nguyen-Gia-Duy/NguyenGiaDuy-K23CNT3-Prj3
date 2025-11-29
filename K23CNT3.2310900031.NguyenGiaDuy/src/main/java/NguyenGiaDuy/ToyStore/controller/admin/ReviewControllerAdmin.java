package NguyenGiaDuy.ToyStore.controller.admin;
import NguyenGiaDuy.ToyStore.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import NguyenGiaDuy.ToyStore.service.ReviewService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/admin/reviews")
public class ReviewControllerAdmin {

    private final ReviewService service;

    public ReviewControllerAdmin(ReviewService service) {
        this.service = service;
    }

    @GetMapping
    public List<Review> getAll() {
        return service.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
