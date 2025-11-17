package k23cnt3.day5.lab07.repository;
import k23cnt3.day5.lab07.entity.NgdProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface NgdProductRepository extends
        JpaRepository<NgdProduct, Long>{
}
