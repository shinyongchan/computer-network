//Mission 1
class Worker extends Thread{
    public void run(){
        for (int i = 0; i <= 4; i++){
            System.out.println("작업 스레드 : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){

            }
        }

    }
}


public class Day22Mission {
    public static void main(String args[]) {
        Thread thread = new Worker();
        thread.start();

        int i = 0;
        int alphabet = 'a';
        while (true){
            if (!thread.isAlive())
                break;
            System.out.println("메인 스레드 : " + (char)(alphabet+i));
            i ++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e){

            }
        }

    }
}

