package k23cnt3.ngd.day3.k23cnt3.ngd.day3.NgdEntity;

public class NgdKhoa {

        private String makh;
        private String tenkh;

        public NgdKhoa() {}
        public NgdKhoa(String makh, String tenkh) {
            this.makh = makh;
            this.tenkh = tenkh;
        }

        public String getMakh() { return makh; }
        public void setMakh(String makh) { this.makh = makh; }

        public String getTenkh() { return tenkh; }
        public void setTenkh(String tenkh) { this.tenkh = tenkh; }
    }

