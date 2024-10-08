package HW12;

import java.util.ArrayList;
import java.util.List;

public class WorkerPool {
    private int poolSize;
    private List<Worker> workers;
    private int nextWorkerIndex = 0;




    public  WorkerPool(int poolSize){
        this.poolSize = poolSize;
        this.workers = new ArrayList<>(poolSize);

        for(int i = 0; i <= poolSize; i++){
            workers.add(new Worker(i));
        }
    }

    public Worker getWorker(){
        Worker worker = workers.get(nextWorkerIndex);

        nextWorkerIndex = (nextWorkerIndex + 1) % poolSize;
        return worker;
    }
}
