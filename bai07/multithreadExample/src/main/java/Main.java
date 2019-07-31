public class Main {
    public static void main(String [] args) {
        ClassA objA = new ClassA();
        ClassB objB = new ClassB();
        ClassC objC = new ClassC();
        ClassD objD = new ClassD();

        //Relations
        objA.setObjD(objD);
        objB.setObjD(objD);
        objC.setObjD(objD);

        objA.start();
        objB.start();
        objC.start();
    }
}
