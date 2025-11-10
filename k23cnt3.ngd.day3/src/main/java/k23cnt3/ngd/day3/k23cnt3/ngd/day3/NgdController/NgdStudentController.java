package k23cnt3.ngd.day3.k23cnt3.ngd.day3.NgdController;

import k23cnt3.ngd.day3.k23cnt3.ngd.day3.NgdEntity.NgdStudent;
import k23cnt3.ngd.day3.k23cnt3.ngd.day3.NgdService.NgdServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NgdStudentController {

    @Autowired
    public NgdServiceStudent ngdServiceStudent;

    @GetMapping("/student-list")
    public List<NgdStudent> getAllStudents() {
        return ngdServiceStudent.getNgdStudents();
    }

    @GetMapping("/student/{ngdId}")
    public NgdStudent getNgdStudentById(@PathVariable String ngdId) {
        Long param = Long.parseLong(ngdId);
        return ngdServiceStudent.getNgdStudent(param);
    }
}
