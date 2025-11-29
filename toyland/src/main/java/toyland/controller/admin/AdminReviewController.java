package toyland.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import toyland.repository.ReviewRepository;

@Controller
@RequestMapping("/admin/reviews")
public class AdminReviewController {

    @Autowired
    private ReviewRepository reviewRepository;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("reviews", reviewRepository.findAll());
        return "admin/reviews/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        reviewRepository.deleteById(id);
        return "redirect:/admin/reviews";
    }
}
