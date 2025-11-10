package k23cnt3.ngd.day3.k23cnt3.ngd.day3.NgdService;

import k23cnt3.ngd.day3.k23cnt3.ngd.day3.NgdEntity.NgdStudent;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NgdServiceStudent {
    List<NgdStudent> ngdStudents ;

    public NgdServiceStudent(){
        ngdStudents = List.of(
                new NgdStudent(1L, "Nguyễn Gia Duy", 20, true, "Hà Nội", "0123456789", "duy.nguyen@example.com"),
                new NgdStudent(2L, "Nguyễn Thị Huyền Trang", 19, false, "Hà Nội", "0987654321", "trang.nguyen@example.com"),
                new NgdStudent(3L, "Trần Minh Quân", 21, true, "Đà Nẵng", "0905123456", "quan.tran@example.com"),
                new NgdStudent(4L, "Phạm Thảo Vy", 19, false, "TP.HCM", "0978123456", "vy.pham@example.com")
        );
    }

    public List<NgdStudent> getNgdStudents() {
        return ngdStudents;
    }

    public NgdStudent getNgdStudent(Long ngdId) {
        return ngdStudents.stream()
                .filter(student -> student.getNgdId() == ngdId)
                .findFirst().orElse(null);
    }
}
