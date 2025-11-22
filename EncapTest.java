class Info{
     private String name;
     private String profession;
     private int age;
     Info(String name,String profession,int age){
          this.name=name;
          this.profession=profession;
          this.age=age;
     }
     String getName(){
          return name;
     }
     String getProfile(){
          return profession;
     }
     int getAge(){
          return age;
     }
     void showInfo(){
          System.out.println("Name : " + name);
          System.out.println("Profession : " + profession);
          System.out.println("Age : " + age);
     }
     
     
}
public class EncapTest{
     public static void main(String[] args){
          Info obj1=new Info("Mashrafi","Programmer",21);
          obj1.showInfo();
     }
}