package toyland.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin") // Đảm bảo URL chính xác
public class AdminController {

    // Trang dashboard chính
    @GetMapping({"", "/", "/index"})
    public String adminHome() {
        return "admin/index";  // Trả về trang admin/index.html
    }
}
