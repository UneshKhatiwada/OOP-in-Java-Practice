public class ThreadA extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Running thread" + "i" + " from class A.");

        }
        System.out.println("Exit from class A.");
    }
}

public class ThreadB extends Thread {
    public void run() {
        for (int j = 0; i < 5; j++) {
            System.out.println("Running thread" + "j" + " from class B.");

        }
        System.out.println("Exit from class B.");
    }
}

public class ThreadC extends Thread {
    public void run(){
    for(int k = 0; k<5; k++)
    {
        System.out.println("Running thread"+"k"+"from class C.");

    }    
    System.out.println("Exit from class C.")
}
}

public class Thread2 {
    public static void main(String[] args) {
        ThreadA obj1 = new ThreadA();
        ThreadB obj2 = new ThreadB();
        ThreadC obj3 = new ThreadC();

        obj1.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj3.setPriority(Thread.NORM_PRIORITY);
        obj1.start();
        obj2.start();
        obj3.start();
    }
}
