//In here i using multi threading.


// class NewThread implements Runnable{
//      Thread t;
//      NewThread(){
//           t=new Thread(this,"Runnable Thread");
//           t.start();
//      }
//      @Override
//      public void run(){
//           System.out.println("Hello");
//      }
// }
// public class RunThread{
//      public static void main(String[] args){
//           new NewThread();
//      }
// }
class newThread implements Runnable{
     Thread t;
     int threadNo;
     newThread(int threadNo){
          t=new Thread(this,"Runnable thread");
          this.threadNo=threadNo;
          t.start();
     }
     @Override
     public void run(){
          for(int i=1;i<=10;i++){
               try{
                    System.out.println(threadNo + " -> Child Thread : "+i);
                    Thread.sleep(1000);
               }
               catch(InterruptedException e){
                    e.printStackTrace();
               }
          }
          System.out.println("Complete");
     }
}
public class RunThread{
     public static void main(String[] args){
          new newThread(1);
          new newThread(2);
     }
}