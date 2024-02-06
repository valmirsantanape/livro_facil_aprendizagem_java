public class Program {
    public static void main(String[] args) {
        int[] scores = {90, 70, 50, 80, 60, 85};

//        System.out.println(scores[0]);
//        System.out.println(scores[2]);
//        System.out.println(scores[4]);

        for(int i = 0; i < scores.length; i++){
            if (i < scores.length - 1){
                System.out.print(scores[i] + ", ");
            }else{
                System.out.print(scores[i] + ".");
            }

        }
    }
}
