

public class Pelanggan extends DataPelanggan {

    private String id;
    private String password;

    public Pelanggan(String namadepan, String namabelakang, String email, String telpon, String id, String password) {
        super(namadepan, namabelakang, email, telpon);
        this.id = id;
        this.password = password;
    }

    KeranjangBelanja k = new KeranjangBelanja();
    Alamat a = new Alamat();
    StatusPelanggan s;
    DataPelanggan d;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public boolean tambahAlamat(Alamat a) {
        // Scanner s = new Scanner(System.in); // Create a Scanner object

        // String newJalan = s.nextLine();
        // String newKota = s.nextLine();
        // String newNoHp = s.nextLine();
        // int newKodepos = s.nextInt();

        // s.close();

        this.a.setJalan(a.getJalan());
        this.a.setKodepos(a.getKodepos());
        this.a.setKota(a.getKota());
        this.a.setNoHP(a.getNoHP());

        if (a.getJalan() == this.a.getJalan() && this.a.getKodepos() == a.getKodepos() && this.a.getKota() == a.getKota()
                && this.a.getNoHP() == a.getNoHP()) {
            return true;
        } else
            return false;
    }
    
    public boolean hapusAlamat(Alamat a) {

        a.setJalan(null);
        a.setKodepos(0);
        a.setKota(null);
        a.setNoHP(null);

        if (a.getJalan() == null && a.getKodepos() == 0 && a.getKota() == null && a.getNoHP() == null) {
            return true;
        } else
            return false;
    }
    
    public boolean ubahEmail(String email) {

        String newEmail = email;
        setEmail(newEmail);

        if (getEmail() == newEmail) {
            return true;
        } else
            return false;
    }
    
    public boolean ubahPassword(String password) {

        String newPass = password;

        setPassword(newPass);

        if (this.getPassword() == newPass) {
            return true;
        } else
            return false;
    }

    public void keranjangKosong() {
        k.arr.clear();
    }

    public boolean updateKeranjang(ItemKeranjang itemaa) {
        k.arr.add(itemaa);
        if (itemaa == k.arr.get(k.arr.size() - 1)) {
            return true;
        } else
            return false;

    }
    
    public void updateStatus(StatusPelanggan status) {
        s = status;
    }
    
}