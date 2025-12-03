package toyland.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import toyland.entity.News;

public interface NewsRepository extends JpaRepository<News, Long> {
}
