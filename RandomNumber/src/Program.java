import java.util.Random;

public class Program {
    static Random rn = new Random();
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            int num = rn.nextInt(10);
            System.out.print(num + ",");
        }
    }
}
