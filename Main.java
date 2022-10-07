import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       // değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfını tanımladık
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan değerlerei al
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih+ muzik);
        double sonuc = toplam/6.0;
        System.out.println("Ortalamanız : " + sonuc);

        String gecme = ( sonuc >= 60) ? "Geçtiniz." : "Kaldınız";
        System.out.println("Ortalamanız : " + gecme);



    }
}