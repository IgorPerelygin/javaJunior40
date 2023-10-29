package lesson17.threads;

import java.util.LinkedList;

public class TaskStorageImpl implements TasksStorage{
    private LinkedList<Task> tasks = new LinkedList<>();

    @Override
    public synchronized void add(Task task) throws NullPointerException {
        tasks.add(task);
    }

    @Override
    public synchronized Task get() {
        if(tasks.size() != 0){
            return tasks.remove(0);
        }
        return null;
    }

    @Override
    public synchronized int count() {
        return tasks.size();
    }
}
