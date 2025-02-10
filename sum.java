import java.util.Scanner;
class sum{
public static void main(String[]args){
int b=0;
Scanner scanner=new Scanner(System.in);
System.out.println("enter the number ");
int n=scanner.nextInt();
for(int i=1;i<=n;++i){
 b+=i;
 System.out.println(b);
}
}
}
