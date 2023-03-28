public class Main {
    public static void main(String[] args) {

        DosenS3 divi = new DosenS3("Divi", "1001", "S3","NLP","Italia");
        Dosen margaretha = new Dosen("Margaretha", "1002", "S2", "HCL");
        DosenS3 ganjar = new DosenS3("Ganjar", "1003", "S3", "Ai","Korea");
        Dosen rochana = new Dosen("Rochana", "1004", "S2", "Data Mining");
        Dosen dinar = new Dosen("Dinar", "1005", "S2", "Machine Learning");

        divi.setTopik("sentimen analis");
        divi.setTopik("natural language generation");
        divi.setTopik("speech recognition");
        ganjar.setTopik("healt analys");
        ganjar.setTopik("smart farming");

        Prodi trpl = new Prodi("TRPL", "21321");
        trpl.addDosen(divi);
        trpl.addDosen(margaretha);
        trpl.addDosen(ganjar);
        trpl.addDosen(rochana);
        trpl.addDosen(dinar);

        Mahasiswa aziz = new Mahasiswa("Muhammad Rizky Aziz", 38, 2);
        Mahasiswa rasyd = new Mahasiswa("Rasyd Kusnady", 126, 7);

        trpl.cekTA(aziz);
        trpl.cekTA(rasyd);

        aziz.setMinat("HCL");
        rasyd.setMinat("Sepak Bola");
        trpl.rekomendasi(aziz);
        trpl.rekomendasi(rasyd);
    }
}