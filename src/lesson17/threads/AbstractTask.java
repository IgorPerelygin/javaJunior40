package lesson17.threads;

public abstract class AbstractTask implements Task{
    private int tryCount = 0;

    @Override
    public int getTryCount() {
        return tryCount;
    }

    @Override
    public void incTryCount() {
        tryCount++;
    }

}
