package projekantrian;

public class Antrian {

    Mahasiswa elemen;
    Antrian next, prev;

    public Antrian() {
    }

    public Antrian(Mahasiswa elemen) {
        this.elemen = elemen;
    }

    public Antrian(Mahasiswa elemen, Antrian next, Antrian prev) {
        this.elemen = elemen;
        this.next = next;
        this.prev = prev;

    }

}
