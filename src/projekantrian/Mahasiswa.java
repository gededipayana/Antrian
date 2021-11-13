package projekantrian;

public class Mahasiswa {

    private int noAntrian;
    private String nama, nim;

    public Mahasiswa() {
    }

    public Mahasiswa(int noAntrian, String nim, String nama) {

        this.noAntrian = noAntrian;
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getNoAntrian() {
        return noAntrian;
    }

    public void setNoAntrian(int noAntrian) {
        this.noAntrian = noAntrian;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
