public class Person {

    private String name;
    private int age;


    //Construtor sem parametros
    public Person() {
        //System.out.println("Person is instantimated");
    }
    //Construtor com parametros
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void say() {
        System.out.println("My name is: " + name +", this age: " + age +" yars old. ") ;
    }
}
