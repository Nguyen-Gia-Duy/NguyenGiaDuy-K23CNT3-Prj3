package k23cnt3.day5.lab07.repository;
import k23cnt3.day5.lab07.entity.NgdCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface NgdCategoryRepository extends JpaRepository<NgdCategory,Long>{


}
