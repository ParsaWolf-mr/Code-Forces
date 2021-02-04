import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        String str;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 2; i <100; i +=2) {
            for(int j = 2; j< 100; j+= 2) {
                if (j + i == n) {
                    System.out.println("YES");
                    return ;
                }
            }
        }
        System.out.println("NO");
    }
}
