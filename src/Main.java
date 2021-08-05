import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double dersSayac=0, notToplam=0;
        double matematik, fizik, turkce, kimya, muzik, ortalama;
        String errorMessage = "Hatalı Giriş Yaptınız!!!\nGirilen Not 0-100 Arasında Olmalıdır. Bu Ders Ortalama Hesaplamasına Dahil Edilmeyecektir...";

        System.out.print("Matematik Notu\t:");
        matematik = input.nextDouble();
        if (matematik < 0 || matematik > 100) {
            System.out.println(errorMessage);
        } else {
            dersSayac++;
            notToplam+=matematik;
        }

        System.out.print("Fizik Notu\t:");
        fizik = input.nextDouble();
        if (fizik < 0 || fizik > 100) {
            System.out.println(errorMessage);
        } else {
            dersSayac++;
            notToplam+=fizik;
        }

        System.out.print("Türkçe Notu\t:");
        turkce = input.nextDouble();
        if (turkce < 0 || turkce > 100) {
            System.out.println(errorMessage);
        } else {
            dersSayac++;
            notToplam+=turkce;
        }

        System.out.print("Kimya Notu\t:");
        kimya = input.nextDouble();
        if (kimya < 0 || kimya > 100) {
            System.out.println(errorMessage);
        } else {
            dersSayac++;
            notToplam+=kimya;
        }

        System.out.print("Müzik Notu\t:");
        muzik = input.nextDouble();
        if (muzik < 0 || muzik > 100) {
            System.out.println(errorMessage);
        } else {
            dersSayac++;
            notToplam+=muzik;
        }
        ortalama = notToplam/dersSayac;

        if (ortalama>=55){
            System.out.println("Hesaplanan Ders Sayısı:"+dersSayac);
            System.out.println("Ortalama:"+ortalama);
            System.out.println("Tebrikler Sınıfı Geçtiniz");
        }
        else{
            System.out.println("Hesaplanan Ders Sayısı:"+dersSayac);
            System.out.println("Ortalama:"+ortalama);
            System.out.println("Maalesef Sınıfta Kaldınız");
        }

    }
}