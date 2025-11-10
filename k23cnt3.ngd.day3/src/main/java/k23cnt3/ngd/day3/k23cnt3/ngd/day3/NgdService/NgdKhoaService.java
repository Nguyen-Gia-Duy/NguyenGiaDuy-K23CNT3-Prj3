package k23cnt3.ngd.day3.k23cnt3.ngd.day3.NgdService;

import k23cnt3.ngd.day3.k23cnt3.ngd.day3.NgdEntity.NgdKhoa;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class NgdKhoaService {
    private List<NgdKhoa> khoaList = new ArrayList<>();

    public NgdKhoaService() {
        khoaList.add(new NgdKhoa("KH01", "Công nghệ thông tin"));
        khoaList.add(new NgdKhoa("KH02", "Kinh tế"));
        khoaList.add(new NgdKhoa("KH03", "Điện tử viễn thông"));
        khoaList.add(new NgdKhoa("KH04", "Xây dựng"));
        khoaList.add(new NgdKhoa("KH05", "Quản trị kinh doanh"));
    }

    public List<NgdKhoa> getAll() {
        return khoaList;
    }

    public NgdKhoa getByMakh(String makh) {
        return khoaList.stream().filter(k -> k.getMakh().equals(makh)).findFirst().orElse(null);
    }

    public NgdKhoa add(NgdKhoa k) {
        khoaList.add(k);
        return k; // trả về đối tượng vừa thêm
    }

    public NgdKhoa update(String makh, NgdKhoa k) {
        NgdKhoa existing = getByMakh(makh);
        if(existing != null) {
            existing.setTenkh(k.getTenkh());
            return existing; // trả về đối tượng vừa cập nhật
        }
        return null; // nếu không tìm thấy
    }

    public boolean delete(String makh) {
        return khoaList.removeIf(k -> k.getMakh().equals(makh)); // trả về true nếu xóa thành công
    }
}
