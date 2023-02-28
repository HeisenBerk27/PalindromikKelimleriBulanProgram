package diğerKonular;
import java.util.Scanner;

public class PalindromKelime {
	
	public static boolean isPalindrome(String kelime) {
        int uzunluk = kelime.length();

        for (int i = 0; i < uzunluk / 2; i++) {
            if (kelime.charAt(i) != kelime.charAt(uzunluk - i - 1)) {
                return false;
            }
        }
        return true;
    }
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kelime girin: ");
        String kelime = scanner.nextLine();

        if (isPalindrome(kelime)) {
            System.out.println(kelime + " palindromiktir.");
        } else {
            System.out.println(kelime + " palindromik değildir.");
        }
    }
}

