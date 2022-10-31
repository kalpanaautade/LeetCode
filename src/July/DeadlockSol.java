package July;

public class DeadlockSol {

    public static void main(String[] args) {

        SharedObj s1 = new SharedObj();
        SharedObj s2= new SharedObj();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    s1.test1(s2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    s2.test2(s1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        System.out.println("Finished Main work.");
    }
}

class SharedObj
{
    public synchronized void test1(SharedObj obj) throws InterruptedException {

        System.out.println("Inside Test1 Work.");
        test2(obj);
        Thread.sleep(10000);
        System.out.println("Done Test1 Work..");

    }
    public synchronized void test2(SharedObj obj) throws InterruptedException {

        System.out.println("Inside Test2 Work.");
        test1(obj);
        Thread.sleep(10000);
        System.out.println("Done Test2 Work..");

    }
}
