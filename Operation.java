import java.util.Scanner;

public class Operation {
 
 private int X,Y,R;
 
 public void init(int X,int Y)
 {
  this.X=X;
  this.Y=Y;
 }
 public void add()
 {
  R = X + Y;
 }
 public void multiply()
 {
  R = X * Y;
 }
 public void power()
 {
  R = 1;
  while(Y!=0)
  {
   R*=X;
   --Y;
  }
 }
 public void mod()
 {
  R = X % Y;
 }
 
 public void display()
 {
  System.out.println("Output "+R);
 }

 public static void main(String[] args) {
  int n=0;
  Operation m1 = new Operation();
  Scanner s = new Scanner(System.in);
  //System.out.println("Enter X and Y");
  //int x = s.nextInt();
  //int y = s.nextInt();
  int x = 3;
  int y = 8;
  m1.init(x, y);
  //do{
   //System.out.println("Enter Your Choice\n1.Addition 2.Multiplication 3.Power 0.Exit");
   //n = s.nextInt();
   //switch(n)
   //{
   //case 0:
   // n=0;
   // break;
   //case 1:
    m1.add();
    m1.display();
   // break;
   //case 2:
    m1.multiply();
    m1.display();
   // break;
   //case 3:
    m1.power();
    m1.display();
   // break;
    
   //default:
   // System.out.println("Invalid Input");
   //}
  //}while(n!=0);
  
 }
}
