import java.util.Scanner;

public class Main {
    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PersegiPanjang persegiPanjang;
        SegitigaKu segitigaKu;
        Lingkaran lingkaran;

        int s1,s2,r;

        persegiPanjang = new PersegiPanjang();
        segitigaKu = new SegitigaKu();
        lingkaran = new Lingkaran();

        mainMenu();

        switch (pilihan){
            case '1' :{
                System.out.print("Masukan panjang persegi: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan lebar persegi: ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang: " + persegiPanjang.luas(s1,s2));
                System.out.println("Keliling persegi panjang: " + persegiPanjang.keliling(s1,s2));
                break;
            }

            case '2' : {
                System.out.print("Masukan alas segitiga siku: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan tinggi segitiga siku: ");
                s2 = scanner.nextInt();
                System.out.println("Luas segitiga: " + segitigaKu.luas(s1,s2));
                System.out.println("Keliling segitiga: " + segitigaKu.keliling(s1,s2));
                break;
            }

            case '3' : {
                System.out.print("Masukan jari-jari lingkaran: ");
                r = scanner.nextInt();
                System.out.println("Luas lingkaran: " + lingkaran.luas(r));
                System.out.println("Keliling lingkaran: " + lingkaran.keliling(r));
                break;
            }

            default: {
                System.out.println("tidak ada pilihan");
                break;
            }
        }
    }

    private static void mainMenu(){
        //pilihan menu
        System.out.println("====================");
        System.out.println("Hitung Luas dan Keliling :");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukan Menu : ");
        pilihan = scanner.next().charAt(0);
    }
}
