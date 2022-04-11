import java.util.Scanner;

public class MenghitungLuas {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        byte pilihanMenu = input.nextByte();

        switch (pilihanMenu) {
            case 1  -> menuPersegi();
            case 2  -> menuSegitiga();
            case 3  -> menuLingkaran();
            default -> System.out.println("Input yang anda masukan tidak sesuai");
        }
    }

    static void menuPersegi() {
        int sisi = input.nextInt();

        Persegi persegi1 = new Persegi(sisi);
        System.out.println(persegi1.hitungLuas());
    }

    static void menuSegitiga() {
        int alas   = input.nextInt();
        int tinggi = input.nextInt();

        Segitiga segitiga1 = new Segitiga(alas, tinggi);
        System.out.println(segitiga1.hitungLuas());
    }

    static void menuLingkaran() {
        int radius = input.nextInt();

        Lingkaran lingkaran1 = new Lingkaran(radius);
        int luas = lingkaran1.hitungLuas();
        System.out.println((double) luas);

    }
}

class Persegi {
    int sisi;

    Persegi(int paramSisi) {
        this.sisi = paramSisi;
    }

    public int hitungLuas() {
        return sisi * sisi;
    }
}

class Segitiga {
    int alas, tinggi;

    Segitiga(int paramAlas, int paramTinggi) {
        this.alas   = paramAlas;
        this.tinggi = paramTinggi;
    }

    public int hitungLuas() {
        return (alas * tinggi) / 2;
    }
}

class Lingkaran {
    int radius;

    Lingkaran(int paramRadius) {
        this.radius = paramRadius;
    }

    public int hitungLuas() {
        if (radius % 7 == 0) {
            return (int) (22 / 7 * radius * radius);
        } else {
            return (int) (3.14 * radius * radius);
        }
    }
}