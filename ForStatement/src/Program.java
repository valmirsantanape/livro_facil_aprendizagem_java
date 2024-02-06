public class Program {
    public static void main(String[] args) {
        for(int i = 1; i <= 64; i++){
            System.out.print("* ");
            if(i % 8 == 0){
                System.out.println("");
            }
        }
    }
}
