 /**
  * PatternProgramming
  */
 public class PatternProgramming {
 
   public static void main(String[] args) {
      
   
    int n=11;
    for(int i=0; i<n; i++)
     {  
        for(int j=0; j<n; j++)
        { 
          // To Print "A"
          if (i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || j==(n-1)/2 && i>0 || i==(n-1)/2 && j<=(n-1)/2)
          {
            System.out.print("*");
          }
          else
           {
            System.out.print(" ");
           }
        } System.out.print(" ");


        // To Print "N"
        for(int j=0; j<n; j++)
        { 
          if (j==0 || j==(n-1)/2|| i==j)
          {
            System.out.print("*");
          }
          else
           {
            System.out.print(" ");
           }
        } System.out.print(" ");


       
        // To Print "A"
        for(int j=0; j<n; j++)
        { 
          if (i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || j==(n-1)/2 && i>0 || i==(n-1)/2 && j<=(n-1)/2)
          {
            System.out.print("*");
          }
          else
           {
            System.out.print(" ");
           }
        } System.out.print(" ");




         // To Print "N"
         for(int j=0; j<n; j++)
         { 
           if (j==0 || j==(n-1)/2|| i==j)
           {
             System.out.print("*");
           }
           else
            {
             System.out.print(" ");
            }
         } System.out.print(" ");



            // To Print "D"
            for(int j=0; j<n; j++)
         { 
           if (j==0 || i==0 && j<(n-1)/2|| i==n-1 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<n-1)
           {
             System.out.print("*");
           }
           else
            {
             System.out.print(" ");
            }
         } System.out.print(" ");
        
        }
      }
    
}