import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String s=sc.nextLine();
            int n=Integer.parseInt(s);
            int n2=n*n;
            int count=0;
            boolean flag=false;
            for(int i=n,j=n2;i>0;i/=10,j/=10){
                if(i%10==j%10){
                    count++;
                }else{
                    flag=true;
                    break;
                }
            }
            if(!flag){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
