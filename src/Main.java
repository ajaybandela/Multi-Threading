public class Main {

    static class Ronaldo implements Runnable{
        public void run() {
            for(int i=0;i<5;i++){
                System.out.println("Ronaldo");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Ronaldo r=new Ronaldo();
        Thread t=new Thread(r);
        t.start();

        for (int i=0;i<5;i++){
            System.out.println("Messi");
            Thread.sleep(1);
        }
    }
}