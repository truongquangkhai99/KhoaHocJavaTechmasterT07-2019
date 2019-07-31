public class ClassB extends Thread implements Runnable{
    private ClassD objD;

    public ClassD getObjD() {
        return objD;
    }

    public void setObjD(ClassD objD) {
        this.objD = objD;
    }
    @Override
    public void run() {
        System.out.println("Begin task 2");
        for(int i = 0; i< 2000; i++) {
            System.out.print(i+",");
        }
        System.out.println("\nEnd task 2");
        //inform objD that "I finished"
        this.objD.finishTask(this);
    }
}
