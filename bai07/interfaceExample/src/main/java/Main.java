public class Main {
    public static void main(String [] args) {
        //IPlayable x = new IPlayable();//cannot init an object from an Interface !
        Person person = new Person("Hoang", "hoang123@gmail.com", 30);
        //Person person2 = person;//reference to an object
        //manual clone = do not USE !
        Person person4 = new Person(person.getName(), person.getEmail(), person.getAge());
        try {
            Person person3 = (Person) person.clone();//clone an object
            System.out.println("aa");
        } catch (CloneNotSupportedException e) {

        }
        person.buyBook();
        person.playFootball();
    }
}
