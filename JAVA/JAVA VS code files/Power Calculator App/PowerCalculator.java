import java.util.Scanner;

class MyCalculator{
    int Power(int n,int p){
       System.out.println("Enter values to find power: ");
       Scanner scn=new Scanner(System.in);
         n=scn.nextInt();
         p=scn.nextInt();
      try{
       
        if (n<0|| p<0) {
            throw new Exception("n and p should be non-negative");
          } 
          if(n==0||p==0){
            System.out.println("n: n and p should not be zer0");
            return 0;
          }
          else {
            int reslt=(int)Math.pow(n, p);
            System.out.println("Result: "+reslt);
            return reslt;
          }
      } catch (Exception e) {
        System.out.println("n and p should be non-negative");
        return 0;
      }
      
       }
}
public class PowerCalculator {
    public static void main(String[] args) {
        MyCalculator objMc=new MyCalculator();
        objMc.Power(0, 0);
    }
}
