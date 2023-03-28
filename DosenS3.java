import java.util.ArrayList;

public class DosenS3 extends Dosen {
    private String loksiS3;
    private ArrayList<Topik> daftartopik;

    public String getLoksiS3() {
        return loksiS3;
    }

    public void setLoksiS3(String loksiS3) {
        this.loksiS3 = loksiS3;
    }

    public ArrayList<Topik> getTopik() {
        return daftartopik;
    }

    public void setTopik(String nama) {
        Topik myTopik = new Topik(nama);
        daftartopik.add(myTopik);
    }

    public DosenS3(String nama, String nika, String pendidikan, String keahlianUtama,String lokasiS3) {
        super(nama, nika, pendidikan, keahlianUtama);
        daftartopik = new ArrayList<>();
        this.loksiS3 = lokasiS3;
    }
}
