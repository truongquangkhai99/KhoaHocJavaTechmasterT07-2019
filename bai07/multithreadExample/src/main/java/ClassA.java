public class ClassA extends Thread implements Runnable{
    private ClassD objD;

    public ClassD getObjD() {
        return objD;
    }

    public void setObjD(ClassD objD) {
        this.objD = objD;
    }

    @Override
    public void run() {
        System.out.println("Begin task 1");
        for(int i = 0; i< 1000; i++) {
            System.out.print(i+",");
        }
        System.out.println("\nEnd task 1");
        //inform objD that "I finished"
        this.objD.finishTask(this);
    }
}
