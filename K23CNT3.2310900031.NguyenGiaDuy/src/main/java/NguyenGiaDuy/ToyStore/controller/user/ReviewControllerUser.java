package NguyenGiaDuy.ToyStore.controller.user;
import NguyenGiaDuy.ToyStore.model.Review;

import NguyenGiaDuy.ToyStore.service.ReviewService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/reviews")
public class ReviewControllerUser {

    private final ReviewService service;

    public ReviewControllerUser(ReviewService service) {
        this.service = service;
    }

    @PostMapping
    public Review create(@RequestBody Review review) {
        return service.save(review);
    }

    @GetMapping("/toy/{toyId}")
    public List<Review> getByToy(@PathVariable Long toyId) {
        return service.findByToy(toyId);
    }
}
