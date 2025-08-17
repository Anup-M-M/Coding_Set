package test.tsttt;

public class TreadSequence {

    private static final int N = 10;

    private static int counter = 1;

    private static final Object lock = new Object();

    static class NumberPrint implements Runnable{

        private int threadId;

        public NumberPrint(int threadId) {
            this.threadId = threadId;
        }

        @Override
        public void run() {
            while (true){
                synchronized (lock){
                    while(counter <= N && (counter - 1) % 3 != threadId){
                        try{
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    if(counter > N){
                        //lock.notifyAll();
                        break;
                    }

                    System.out.println("THREAD-" + (threadId + 1) + " : " + counter);

                    counter++;

                    lock.notifyAll();
                }
            }
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new NumberPrint(0));
        Thread t2 = new Thread(new NumberPrint(1));
        Thread t3 = new Thread(new NumberPrint(2));

        t1.start();

        t2.start();

        t3.start();
    }
}
