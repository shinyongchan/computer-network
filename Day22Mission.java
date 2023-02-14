//Mission 2



public class Day22Mission {
    public static void main(String args[]) {
          Thread worker = new Thread(()->{
          for (int i = 0; i <= 4; i++){
              System.out.println("작업 스레드 : " + i);
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e){

              }
            }
          });

          worker.start();
          int i = 0;
          int alphabet = 'a';
          while (true){
              if (!worker.isAlive())
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

