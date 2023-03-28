import java.util.ArrayList;

public class Prodi {
    private String nama;
    private String id;
    private ArrayList<Dosen> daftarDosen;

    public Prodi(String nama, String id) {
        this.nama = nama;
        this.id = id;
        daftarDosen = new ArrayList<>();
    }

    public void addDosen(Dosen dosen){
        daftarDosen.add(dosen);
    }

    public ArrayList<Dosen> getDaftarDosen() {
        return daftarDosen;
    }

    public void cekTA(Mahasiswa mahasiswa){
        if (mahasiswa.getSemester()>=7){
            if (mahasiswa.getSks() >= 126){
                System.out.println("Mahasiswa dnegan nama : " + mahasiswa.getNama() + " dinyatakan Bisa ambil TA");
            }
            else {
                System.out.println("Mahasiswa dnegan nama : " + mahasiswa.getNama() + " dinyatakan Blum Bisa TA, SKS yang diambil kurang");
            }
        }
        else {
            System.out.println("Mahasiswa dnegan nama : " + mahasiswa.getNama() + " dinyatakan Belum Bisa TA, Smester kurang");
        }
    }

    public void rekomendasi(Mahasiswa mahasiswa){
        String minat = mahasiswa.getMinat();
        boolean hasil = false;

        for(int i = 0; i < daftarDosen.size(); i++){
            if (minat.equals(daftarDosen.get(i).getKeahlianUtama())){
                System.out.println("Mahasiswa " + mahasiswa.getNama() + " direkomendasikan dosen : " + daftarDosen.get(i).getNama());
                hasil = true;
                break;
            }
            else {
               hasil = false;
            }
        }
        if (hasil == false){
            for (int i=0 ; i<daftarDosen.size();i++){
                if (daftarDosen.get(i).getPendidikan().equals("S3")){
                    System.out.println("Mahasiswa " + mahasiswa.getNama() + " direkomendasikan dosen : " +daftarDosen.get(i).getNama() );
                }
            }
        }
    }

//    public void assignDosbing(Mahasiswa mahasiswa, String nika) {
//        int indeks = daftarDosen.indexOf();
//    }
}
