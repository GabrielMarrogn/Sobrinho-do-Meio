import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int[] arr = {a,b,c};

        Arrays.sort(arr);

        if(arr[1] == a){
            System.out.println("huguinho");
        }else if(arr[1] == b){
            System.out.println("zezinho");
        }else{
            System.out.println("luisinho");
        }

    }
}
