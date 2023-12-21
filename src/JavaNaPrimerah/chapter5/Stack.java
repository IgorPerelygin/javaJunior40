package JavaNaPrimerah.chapter5;

public class Stack { // LIFO
    private Object[] theArray;
    private int topOfStack;

    static final int DEFAULT_CAPACITY = 10;

    // установка объема стека по умолчанию
    public Stack(){
        theArray = new Object[DEFAULT_CAPACITY];
        topOfStack = -1;
    }

    // провверка пуст ли стек, возвращает true если стек пустой, иначе false
    boolean isEmpty(){
        return topOfStack == -1;
    }

    // @return возвращает последний добавленный элемент стека, нее изменяет стек.
    Object top(){
        if(isEmpty())
            return null;
        return theArray[topOfStack];
    }

    // извлекает элемент из стека
    void pop() {
        if (isEmpty())
            return;
        topOfStack--;
    }

    // извлекает и возвращает элемент с вершины стека.
    Object topAndPop() {
        if (isEmpty())
            return null;
        return theArray[topOfStack--];
    }

    // добавляет новый элемент в стек. х - добавляемый объект
    void push(Object x) {
        if (topOfStack + 1 == theArray.length)
            doubleArray();
        theArray[++topOfStack] = x;
    }

    // очистка стека

    void makeEmpty(){
        topOfStack = -1;
    }

    // внуторенний мето удвоения размера стека

    private void doubleArray(){
        Object [] newArray;

        newArray = new Object[theArray.length * 2];
        for (int i = 0; i < theArray.length; i++){
            System.arraycopy(theArray, 0, newArray, 0, theArray.length);
        }
        theArray = newArray;
    }
}

class Queue{  // FIFO
    private char q[];
    private int putloc; // входной индекс
    private int getloc; // выходной индекс

    // создание пустой очереди
    Queue(int size){
        q = new char[size + 1]; // резервирование памяти
        getloc = putloc = 0;
    } // конструктор queue

    //создание очереди из другой очереди
    Queue(Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new  char[ob.q.length];

        // копирование элементов из предыдущей очереди
        System.arraycopy(ob.q, 0, q,0, ob.q.length);
    }

    // создание очереди из массива
     Queue(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1];

        // копирование элементов символьного массива в очередь
         for (int i = 0; i < a.length; i++)
             put(a[i]);
     }

     // проверка выполнения очереди
    boolean isFull() {
        return (putloc == (q.length - 1));
    }

    // проверка пустоты очереди
    boolean isEmpty() {
        return (getloc == putloc);
    }

    // добавления символа в очередь
    void put(char ch) throws IllegalStateException {
        if (isFull()) {
            throw new IllegalStateException("Очередь переполнена.");
        }
        putloc++;
        q[putloc] = ch;
    }

    //извлечение символа из очереди
    char get() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста   ");
        }

        getloc++;
        return q[getloc];
    }
}
