
package kuvet_bulma;

import java.util.Scanner;

public class Kuvet_bulma {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.print("N sayisini girin: ");
        int n= input.nextInt();
        
        System.out.print("K sinir degerini girin: ");
        int k=input.nextInt();
        
        for(int i = 1; i <= k; i *= n){
            System.out.println(i);
            
        
        }
    }
    
}
