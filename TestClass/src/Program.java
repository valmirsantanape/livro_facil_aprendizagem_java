public class Program {
    public static void main(String[] args) {
        //Criando objeto diretamente pelo construtor
        System.out.println("1º Pessoa");
        Person p1 = new Person("Valmir", 32);
        p1.say();

        System.out.println("------------------------------------");
        System.out.println("2º Pessoa");
        //Criando objeto utilizando os metodos get e set
        Person p2 = new Person();
        p2.setName("Antonia");;
        p2.setAge(44);
        p2.say();
        System.out.println(p2.getName() + " " + p2.getAge());
        System.out.println("------------------------------------");
        System.out.println("3º Pessoa");
        //Objeto anônimo
        new Person("Francielly", 20).say();



    }
}
