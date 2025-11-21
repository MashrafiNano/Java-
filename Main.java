import java.util.ArrayList;
import java.util.Iterator;
public class Main{
  public static void main(String[] args){
    ArrayList<Integer> numbers=new ArrayList<Integer>();
    System.out.println("Numbers : " + numbers.size());
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(0,50);
    System.out.println(numbers);
    System.out.println("The size of the Arrya: " + numbers.size());
    for(int x:numbers){
      System.out.println("Values : " + x);
    }
    // Iterator itr=numbers.iterator();
    // while(itr.hasNext()){
    //   System.out.println(" " + itr.next());
    // }
    // Iterator itr=numbers.iterator();
    // while(itr.hasNext()){
    //   System.out.println(" " + itr.next());
    // }
    numbers.remove(2);
    System.out.println("After remove");
    System.out.println(numbers);
    System.out.println("All remove : ");
   
    System.out.println("ArrayList empty or not: ");
  boolean check=numbers.isEmpty();
  System.out.println("Array List Empty:" + check);
  System.out.println("Search something: ");
  boolean contain=numbers.contains(30);
  System.out.println("30 is in the list : " + contain);
  int pos=numbers.indexOf(40);
  System.out.println("Index position of 40 is : " + pos);
  numbers.set(3,50);
  System.out.println(numbers);
  int x = numbers.get(0);
  System.out.println("Index of x : " + x);
  }
}
  