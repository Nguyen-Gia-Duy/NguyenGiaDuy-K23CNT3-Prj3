package NguyenGiaDuy.ToyStore.controller.admin;

import NguyenGiaDuy.ToyStore.model.Toy;
import NguyenGiaDuy.ToyStore.service.CategoryService;
import NguyenGiaDuy.ToyStore.service.ToyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/toys")
public class ToyControllerAdmin {

    private final ToyService toyService;
    private final CategoryService categoryService;

    public ToyControllerAdmin(ToyService toyService, CategoryService categoryService) {
        this.toyService = toyService;
        this.categoryService = categoryService;
    }

    // Hiển thị danh sách đồ chơi
    @GetMapping
    public String listToys(Model model) {
        model.addAttribute("toys", toyService.findAll());
        return "admin/toy-list"; // templates/admin/toy-list.html
    }

    // Form thêm mới
    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("toy", new Toy());
        model.addAttribute("categories", categoryService.findAll());
        return "admin/toy-form"; // templates/admin/toy-form.html
    }

    // Form sửa
    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        Toy toy = toyService.findById(id);
        model.addAttribute("toy", toy);
        model.addAttribute("categories", categoryService.findAll());
        return "admin/toy-form";
    }

    // Lưu (thêm hoặc sửa)
    @PostMapping
    public String saveToy(@ModelAttribute Toy toy) {
        toyService.save(toy);
        return "redirect:/admin/toys";
    }

    // Xóa
    @GetMapping("/delete/{id}")
    public String deleteToy(@PathVariable Long id) {
        toyService.delete(id);
        return "redirect:/admin/toys";
    }
}
