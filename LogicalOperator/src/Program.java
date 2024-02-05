public class Program {
    public static void main(String[] args) {

        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);
        System.out.println(true&&true);
        System.out.println("-------------------------------");
        System.out.println(false||false);
        System.out.println(false||true);
        System.out.println(true||false);
        System.out.println(true||true);
        System.out.println("-------------------------------");
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("-------------------------------");
        boolean b1 = true;
        System.out.println(b1);
        System.out.println(2 > 1 || b1);
        System.out.println(1 > 2 || b1);
    }
}
