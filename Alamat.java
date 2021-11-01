public class Alamat {
    private String jalan;
    private int kodepos;
    private String kota;
    private String noHP;
    
    public Alamat(String jalan, int kodepos, String kota, String noHP) {
        this.jalan = jalan;
        this.kodepos = kodepos;
        this.kota = kota;
        this.noHP = noHP;
    }

    public Alamat() {
        //constructor
    }

    public String getJalan() {
        return jalan;
    }
    public void setJalan(String jalan) {
        this.jalan = jalan;
    }
    public int getKodepos() {
        return kodepos;
    }
    public void setKodepos(int kodepos) {
        this.kodepos = kodepos;
    }
    public String getKota() {
        return kota;
    }
    public void setKota(String kota) {
        this.kota = kota;
    }
    public String getNoHP() {
        return noHP;
    }
    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }
    
}
