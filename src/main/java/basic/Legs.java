package basic;

public class Legs {

    private static final Object ball = new Object();
    private static final long millis = 1000;

    public static void main(String[] args)  {

        final boolean[] left = {false};

        Runnable leftLeg = new Runnable() {

            public void run() {
               try {
                    synchronized (ball) {

                        while (!Thread.currentThread().isInterrupted()) {

                            if (!left[0]) {
                                ball.wait();
                            }

                            System.out.println("* LEFT " + Thread.currentThread().getName());

                            left[0] = false;
                            ball.notifyAll();
                            Thread.sleep(millis);
                        }

                    }
                } catch (InterruptedException ex) {
                    System.out.println("Left leg is destroyed!");
                }
            }
        };



        Runnable rightLeg = new Runnable() {
            public void run() {

                try {
                    synchronized (ball) {

                        while (!Thread.currentThread().isInterrupted()) {

                            if (left[0]) {
                                ball.wait();
                            }

                            System.out.println("RIGHT " + Thread.currentThread().getName() + " *");

                            left[0] = true;
                            ball.notifyAll();


                            Thread.sleep(millis);
                        }

                    }
                } catch (InterruptedException ex) {
                    System.out.println("Right leg is destroyed!");
                }

            }
        };


        // for (int i = 0; i < 10; ++i) {
        Thread leftLegThread = new Thread(leftLeg);
        Thread rightLegThread = new Thread(rightLeg);

       leftLegThread.start();
       rightLegThread.start();



    }
}
