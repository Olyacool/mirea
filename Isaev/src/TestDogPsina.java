import java.lang.*;
public class TestDogPsina {
    public static void main(String[] args) {
        DogPsina s1 = new DogPsina("Puppy", 1);
        DogPsina s2 = new DogPsina("Duppy", 4);
        DogPsina s3 = new DogPsina("Suppy", 23);
        s3.setAge(6);
        System.out.println(s3);
        s1.intoHumanAge();
        s2.intoHumanAge();
        s3.intoHumanAge();
    }
}
