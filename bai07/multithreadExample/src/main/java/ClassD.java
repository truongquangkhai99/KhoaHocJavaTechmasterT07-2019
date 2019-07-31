import java.util.ArrayList;

public class ClassD extends Thread implements Runnable{
    private ArrayList<Object> tasks = new ArrayList<>();

    public ArrayList<Object> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Object> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        System.out.println("Begin task 4");
        for(int i = 0; i< 4000; i++) {
            System.out.print(i+",");
        }
        System.out.println("\nEnd task 4");
    }
    public void finishTask(Object task) {
        if(task instanceof ClassA ||
                task instanceof ClassB ||
        task instanceof ClassC) {
            this.tasks.add(task);
        }
        if(tasks.size() == 3) {
            this.start();
            tasks.clear();
        }
    }
}
