import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //degiskenler
        double tutar;
        //scanner tanimlamasi
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen ücreti girin : ");
        tutar = input.nextDouble();

        if(tutar>=0 && tutar<= 1000){
            System.out.println("KDV'siz fiyat : " + tutar);
            System.out.println("KDV'li fiyat : " + (tutar + tutar*0.18));
            System.out.println("KDV tutarı : " + tutar*0.18);
        } else if (tutar > 1000) {
            System.out.println("KDV'siz fiyat : " + tutar);
            System.out.println("KDV'li fiyat : " + (tutar + tutar*0.08));
            System.out.println("KDV tutarı : " + tutar*0.08);
        }else {
            System.out.print("Tutar geçerli değil ");
        }
    }
}