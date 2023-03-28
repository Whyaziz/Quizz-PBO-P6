public class Mahasiswa extends CivitasAkademik {
    private int sks;
    private int semester;
    private String minat;
    private Dosen dosbing;

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getMinat() {
        return minat;
    }

    public void setMinat(String minat) {
        this.minat = minat;
    }

    public Dosen getDosbing() {
        return dosbing;
    }

    public void setDosbing(Dosen dosbing) {
        this.dosbing = dosbing;
    }

    public Mahasiswa(String nama, int sks, int semester) {
        super(nama);
        this.sks = sks;
        this.semester = semester;
    }
}
