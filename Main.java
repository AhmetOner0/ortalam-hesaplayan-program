import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,tarih,muzik;
        double ort;
        Scanner input = new Scanner(System.in);

        System.out.print("matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("tarih notunuz: ");
        tarih = input.nextInt();

        System.out.print("kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("müzik notunuz: ");
        muzik = input.nextInt();

        System.out.print("türkçe notunuz: ");
        turkce = input.nextInt();

        ort = (mat + turkce +muzik + fizik + kimya + tarih) / 6 ;

        System.out.println("ortalamanız: "+ ort);

        boolean  isValid = (ort > 60);

        String sonuc = isValid ? "sınıf geçti" : "sınıfta kaldı";
        System.out.print("" + sonuc);

    }
}