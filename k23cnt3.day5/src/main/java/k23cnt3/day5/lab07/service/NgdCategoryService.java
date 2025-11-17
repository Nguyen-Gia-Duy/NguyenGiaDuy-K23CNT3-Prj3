package k23cnt3.day5.lab07.service;
import  k23cnt3.day5.lab07.entity.NgdCategory;
import k23cnt3.day5.lab07.repository.NgdCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class NgdCategoryService {
    @Autowired
    private NgdCategoryRepository categoryRepository;
    public NgdCategoryService(NgdCategoryRepository
                                   categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    // Lấy danh sách
    public List<NgdCategory> getAllCategories() {
        System.out.println(categoryRepository.findAll());
        return categoryRepository.findAll();
    }
    // Lấy category theo id
    public Optional<NgdCategory> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }
    // Cập nhật dữ liệu bảng category: create / update
    public NgdCategory saveCategory(NgdCategory category) {
        return categoryRepository.save(category);
    }
// Xóa category theo id
public void deleteCategory(Long id) {
    categoryRepository.deleteById(id);
}
}
