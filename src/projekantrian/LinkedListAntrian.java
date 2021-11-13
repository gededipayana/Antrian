package projekantrian;

import java.util.NoSuchElementException;

public class LinkedListAntrian {

    private Antrian head;
    int size;

    public LinkedListAntrian() {
        head = new Antrian();
        head.next = head;
        head.prev = head;
        size = 0;
    }

    public Antrian getHead() {
        return head;
    }

    public void setHead(Antrian head) {
        this.head = head;
    }

    public boolean isEmpty() {
        if (head.next == head) {
            return true;
        } else {
            return false;
        }
    }

    private Antrian addBefore(Mahasiswa elemen, Antrian bantu) {
        Antrian baru = new Antrian(elemen);
        baru.next = bantu;
        baru.prev = bantu.prev;
        bantu.prev = baru;
        baru.prev.next = baru;
        size++;
        return baru;
    }

    private Antrian remove(Antrian bantu) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            bantu.prev.next = bantu.next;
            bantu.next.prev = bantu.prev;
            bantu.prev = null;
            bantu.next = null;
            size--;
        }
        return bantu;
    }

    public void enqueue(Mahasiswa elemen) {
        addBefore(elemen, head);
    }

    public Antrian dequeue() {
        return remove(head.next);
    }
}
