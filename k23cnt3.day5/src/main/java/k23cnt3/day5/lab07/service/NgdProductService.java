package k23cnt3.day5.lab07.service;
import k23cnt3.day5.lab07.entity.NgdProduct;
import k23cnt3.day5.lab07.entity.NgdCategory;
import k23cnt3.day5.lab07.repository.NgdProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class NgdProductService {
    @Autowired
    private NgdProductRepository productRepository;
    // Đọc toàn bộ dữ liệu bảng Product
    public List<NgdProduct> getAllProducts() {
        return productRepository.findAll();
    }
    // Đọc dữ liệu bảng Product theo id
    public Optional<NgdProduct> findById(Long id) {
        return productRepository.findById(id);
    }
    // Cập nhật: create / update
    public NgdProduct saveProduct(NgdProduct product) {
        System.out.println(product);
        return productRepository.save(product);
    }
    // Xóa product theo id
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
