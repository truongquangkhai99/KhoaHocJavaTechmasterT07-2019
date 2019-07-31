public class ClassC extends Thread implements Runnable{
    private ClassD objD;

    public ClassD getObjD() {
        return objD;
    }

    public void setObjD(ClassD objD) {
        this.objD = objD;
    }
    @Override
    public void run() {
        System.out.println("Begin task 3");
        for(int i = 0; i< 3000; i++) {
            System.out.print(i+",");
        }
        System.out.println("\nEnd task 3");
        //inform objD that "I finished"
        this.objD.finishTask(this);
    }
}
