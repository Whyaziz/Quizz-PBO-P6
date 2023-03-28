import java.util.ArrayList;

public class Dosen extends CivitasAkademik {
    private String nika;
    private String pendidikan;
    private String KeahlianUtama;
    private ArrayList<Mahasiswa> daftarBimbingan;

    private String getNika() {
        return nika;
    }

    public void setNika(String nika) {
        this.nika = nika;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public String getKeahlianUtama() {
        return KeahlianUtama;
    }

    public void setKeahlianUtama(String keahlianUtama) {
        KeahlianUtama = keahlianUtama;
    }

    public Dosen(String nama, String nika, String pendidikan, String keahlianUtama) {
        super(nama);
        this.nika = nika;
        this.pendidikan = pendidikan;
        KeahlianUtama = keahlianUtama;
        daftarBimbingan = new ArrayList<>();
    }
}
