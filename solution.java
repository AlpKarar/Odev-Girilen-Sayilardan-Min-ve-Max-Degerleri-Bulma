/*
  Ödev
  Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        int N, num;
        Scanner input = new Scanner(System.in);
        
        System.out.print("N: ");
        N = input.nextInt();
        
        int min = 0, max = 0;
        
        for (int i=0; i<N; i++) {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            
            if (i == 0) {
                min = num; 
                max = num;
            }
            
            if (max < num) {
                max = num;
            }
            
            if (num < min) {
                min = num;
            }
        }
        
        System.out.printf("Max number: %d\nMin number: %d", max, min);
    }
}
