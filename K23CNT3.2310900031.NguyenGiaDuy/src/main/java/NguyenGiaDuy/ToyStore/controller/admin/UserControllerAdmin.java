package NguyenGiaDuy.ToyStore.controller.admin;
import NguyenGiaDuy.ToyStore.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import NguyenGiaDuy.ToyStore.service.UserService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/admin/users")
public class UserControllerAdmin {

    private final UserService service;

    public UserControllerAdmin(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getAll() {
        return service.findAll();
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return service.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

