package NguyenGiaDuy.ToyStore.controller.admin;
import NguyenGiaDuy.ToyStore.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import NguyenGiaDuy.ToyStore.service.CategoryService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/admin/categories")
public class CategoryControllerAdmin {

    private final CategoryService service;

    public CategoryControllerAdmin(CategoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<Category> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Category create(@RequestBody Category category) {
        return service.save(category);
    }

    @PutMapping("/{id}")
    public Category update(@PathVariable Long id, @RequestBody Category category) {
        category.setId(id);
        return service.save(category);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}

