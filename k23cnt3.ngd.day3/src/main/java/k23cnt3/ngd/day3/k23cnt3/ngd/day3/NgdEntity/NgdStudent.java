package k23cnt3.ngd.day3.k23cnt3.ngd.day3.NgdEntity;

public class NgdStudent {
    long ngdId;
    String ngdName;
    int ngdAge;
    boolean ngdGender;
    String ngdAddress;
    String ngdPhone;
    String ngdEmail;

    public NgdStudent() {
    }

    public NgdStudent(long ngdId, String ngdName, int ngdAge, boolean ngdGender, String ngdAddress, String ngdPhone, String ngdEmail) {
        this.ngdId = ngdId;
        this.ngdName = ngdName;
        this.ngdAge = ngdAge;
        this.ngdGender = ngdGender;
        this.ngdAddress = ngdAddress;
        this.ngdPhone = ngdPhone;
        this.ngdEmail = ngdEmail;
    }

    public long getNgdId() {
        return ngdId;
    }

    public void setNgdId(long ngdId) {
        this.ngdId = ngdId;
    }

    public String getNgdName() {
        return ngdName;
    }

    public void setNgdName(String ngdName) {
        this.ngdName = ngdName;
    }

    public int getNgdAge() {
        return ngdAge;
    }

    public void setNgdAge(int ngdAge) {
        this.ngdAge = ngdAge;
    }

    public boolean isNgdGender() {
        return ngdGender;
    }

    public void setNgdGender(boolean ngdGender) {
        this.ngdGender = ngdGender;
    }

    public String getNgdAddress() {
        return ngdAddress;
    }

    public void setNgdAddress(String ngdAddress) {
        this.ngdAddress = ngdAddress;
    }

    public String getNgdPhone() {
        return ngdPhone;
    }

    public void setNgdPhone(String ngdPhone) {
        this.ngdPhone = ngdPhone;
    }

    public String getNgdEmail() {
        return ngdEmail;
    }

    public void setNgdEmail(String ngdEmail) {
        this.ngdEmail = ngdEmail;
    }
}