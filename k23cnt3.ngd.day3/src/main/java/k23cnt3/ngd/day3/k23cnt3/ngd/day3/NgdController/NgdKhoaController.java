package k23cnt3.ngd.day3.k23cnt3.ngd.day3.NgdController;

import k23cnt3.ngd.day3.k23cnt3.ngd.day3.NgdEntity.NgdKhoa;
import k23cnt3.ngd.day3.k23cnt3.ngd.day3.NgdService.NgdKhoaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/khoa")
public class NgdKhoaController {

    private final NgdKhoaService khoaService;

    public NgdKhoaController(NgdKhoaService khoaService) {
        this.khoaService = khoaService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<NgdKhoa>> getAll() {
        return ResponseEntity.ok(khoaService.getAll());
    }

    @GetMapping("/{makh}")
    public ResponseEntity<NgdKhoa> getByMakh(@PathVariable String makh) {
        NgdKhoa k = khoaService.getByMakh(makh);
        return k != null ? ResponseEntity.ok(k) : ResponseEntity.notFound().build();
    }

    @PostMapping("/add")
    public ResponseEntity<NgdKhoa> add(@RequestBody NgdKhoa k) {
        return ResponseEntity.ok(khoaService.add(k));
    }

    @PutMapping("/update/{makh}")
    public ResponseEntity<NgdKhoa> update(@PathVariable String makh, @RequestBody NgdKhoa k) {
        NgdKhoa updated = khoaService.update(makh, k);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{makh}")
    public ResponseEntity<Void> delete(@PathVariable String makh) {
        boolean deleted = khoaService.delete(makh);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
