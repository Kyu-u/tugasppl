public class DataPelanggan {

    private String namadepan;
    private String namabelakang;
    private String email;
    private String telpon;

    public DataPelanggan(String namadepan, String namabelakang, String email, String telpon) {
        this.namadepan = namadepan;
        this.namabelakang = namabelakang;
        this.email = email;
        this.telpon = telpon;
    }
    
    public String getNamadepan() {
        return namadepan;
    }
    public void setNamadepan(String namadepan) {
        this.namadepan = namadepan;
    }
    public String getNamabelakang() {
        return namabelakang;
    }
    public void setNamabelakang(String namabelakang) {
        this.namabelakang = namabelakang;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelpon() {
        return telpon;
    }
    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }

}
