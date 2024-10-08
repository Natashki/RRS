package HW12;

public class Worker {
    int id;

    public void doWork(String taskSummary){
        System.out.println("Worker " + this.id + " is doing " + taskSummary);
    }

    public int getId() {
        return id;
    }

    public Worker(int id){
        this.id = id;
    }
}
