import java.lang.*;
public class DogPsina {
    private String name;
    private int age;

    public DogPsina(String n, int a){
        name = n;
        age = a;
    }
    public DogPsina(String n){
        name = n;
        age = 0;
    }
    public DogPsina(){
        name = "Puppy";
        age = 0;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
}
