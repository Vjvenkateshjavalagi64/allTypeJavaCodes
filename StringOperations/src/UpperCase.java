import java.util.*;

public class UpperCase {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
         int v=A.compareTo(B);
         if(v>1)
         {
             System.out.println("Yes");
         }
         else 
         {
             System.out.println("No");
         }
        String res= A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1);
        
        System.out.println(res);
    }
}

