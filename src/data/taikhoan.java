package data;

public class taikhoan {
        private String tendangnhap;
        private String matkhau;
        private String doDate, doMonth, doYear;
        private String lienhe;
        private String email;
        private double sodu;
        
        public taikhoan(String tendangnhap, String matkhau, String doDate, String doMonth, String doYear, String lienhe, String email, double sodu) {
            this.tendangnhap = tendangnhap;
            this.matkhau = matkhau;
            this.doDate = doDate;
            this.doMonth = doMonth;
            this.doYear = doYear;
            this.lienhe = lienhe;
            this.email = email;
            this.sodu = sodu;
        }
        public String getTendangnhap() {
            return tendangnhap;
        }
        public void setTendangnhap(String tendangnhap) {
            this.tendangnhap = tendangnhap;
        }
        public String getMatkhau() {
            return matkhau;
        }
        public void setMatkhau(String matkhau) {
            this.matkhau = matkhau;
        }
        public String getDoDate() {
            return doDate;
        }
        public void setDoDate(String doDate) {
            this.doDate = doDate;
        }
        public String getDoMonth() {
            return doMonth;
        }
        public void setDoMonth(String doMonth) {
            this.doMonth = doMonth;
        }
        public String getDoYear() {
            return doYear;
        }
        public void setDoYear(String doYear) {
            this.doYear = doYear;
        }
        public String getLienhe() {
            return lienhe;
        }
        public void setLienhe(String lienhe) {
            this.lienhe = lienhe;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public double getSodu() {
            return sodu;
        }
        public void setSodu(double sodu) {
            this.sodu = sodu;
        }
        private String _ten;
    public double _sodu;
    
  
}