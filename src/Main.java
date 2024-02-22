import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a, b, c;                        //a,b,c değerlerini oluştur

        Scanner input = new Scanner(System.in);         //scanner oluşturma

        System.out.println("1.= a sayısını giriniz : ");       // 1. sayıyı iste ve a değerine kaydet
        a = input.nextInt();

        System.out.println("2.= b sayısını giriniz : ");       //2. sayıyı iste ve b değerine kaydet
        b = input.nextInt();

        System.out.println("3.= c sayısını giriniz ");          // 3. sayıyı iste ve c değerine kaydet
        c = input.nextInt();

        if ((a > b) && (a > c)) {               // a nın en büyük olduğu senaryoda if ile b ve c nin tüm durumlarını
            if (b > c) {                         // belirle ve durumuna göre sıralamyı yazdır
                System.out.println("a > b > c");
            } else if (c > b) {
                System.out.println("a > c > b");
            }
        }
        if ((b > a) && (b > c)) {                  // b nin en büyük olduğu senaryoda diğer olasılıkları belirle ve yazdır
            if (a > c) {
                System.out.println("b > a > c");
            } else if (c > a) {
                System.out.println("b > c > a");
            }
        }
            if ((c > b) && (c > a)) {               // c nin en büyük olduğu senaryoyu belirle ve yazdır
                if (a > b) {
                    System.out.println("c > a > b");
                } else if( b > a ) {
                    System.out.println("c > b > a");
                }
            }
        }
    } // Ali Eren KÖSE  22/02/2024  23:18
