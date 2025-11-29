package NguyenGiaDuy.ToyStore.controller.user;

import NguyenGiaDuy.ToyStore.service.CategoryService;
import NguyenGiaDuy.ToyStore.service.ToyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ToyControllerUser {

    private final ToyService toyService;
    private final CategoryService categoryService;

    public ToyControllerUser(ToyService toyService, CategoryService categoryService) {
        this.toyService = toyService;
        this.categoryService = categoryService;
    }

    // Trang chủ
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("toys", toyService.findAll());
        return "index"; // templates/index.html
    }

    // Trang danh sách đồ chơi
    @GetMapping("/toys")
    public String toyList(Model model) {
        model.addAttribute("toys", toyService.findAll());
        return "user/toy-list"; // templates/user/toy-list.html
    }

    // Chi tiết đồ chơi
    @GetMapping("/toys/{id}")
    public String toyDetails(@PathVariable Long id, Model model) {
        model.addAttribute("toy", toyService.findById(id));
        return "user/toy-details"; // templates/user/toy-details.html
    }
}
