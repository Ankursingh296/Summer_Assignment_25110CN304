import java.util.Scanner;
public class waptoprintmultiplicationtableofgivennumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int n=sc.nextInt();
        int fact=n;
        for(int i=1;i<=10;i++){
            
            System.out.print(fact*i+" ");
        }

    }
}
