import java.io.Serializable;

public class Person implements IPlayable, ILearning,Serializable, Cloneable {
    //1 class can implement many interfaces
    private String name, email;
    private int age;

    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void playFootball() {
        System.out.println("Play football");
    }
    @Override
    public void playTennis(){
        System.out.println("Play tennis");
    }
    @Override
    public void gotoLibrary() {
        System.out.println("Go to library");

    }
    @Override
    public void buyBook() {
        System.out.println("Buy book");
    }
}
