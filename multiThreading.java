public class multiThreading{
     public static void main(String[] args){
          Thread t=Thread.currentThread();
          System.out.println("Current Thread : " + t);
          t.setName("My Thread");
          System.out.println("After change : " + t);
          for(int n=5;n>=1;n--){
               try{
                    System.out.println(n);
                    Thread.sleep(1000);
               }
               catch(InterruptedException e){
                    e.printStackTrace();
               }
          }
     }
}