import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;
        System.out.println("Hoşgeldiniz");
        System.out.println("**************");
        System.out.println("Lütfen ortalama hesaplamak için sırasıyla istenilen dersin notlarını giriniz");
        System.out.println("*********");
        System.out.println("Matematik notunuzu giriniz:");
        mat = sc.nextInt();
        System.out.println("Fizik notunuzu giriniz:");
        fizik = sc.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        kimya = sc.nextInt();
        System.out.println("Turkce notunuzu giriniz:");
        turkce = sc.nextInt();
        System.out.println("Tarih notunuzu giriniz:");
        tarih = sc.nextInt();
        System.out.println("Müzik notunuzu giriniz:");
        muzik = sc.nextInt();
        int ort = mat + fizik + kimya + turkce + tarih + muzik;
        ort = ort / 6;

        System.out.println("Ortalamanız: " + ort);
    }
}
