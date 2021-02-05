import java.util.Scanner;

import static java.lang.Math.sqrt;

public class FataAndHisCompany {

    public static void main(String[] args) {
        int counter = 0;
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if(n>= 0 && n<= 100000)
        for(int i= 0; i<sqrt(n)+1 ; i++){
            if(n % i == 0){
                counter++;
            }
        }
        System.out.println(counter);

    }
}
