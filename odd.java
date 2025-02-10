import java.util.Scanner;
class odd{
public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
System.out.println("enter the number ");
int a=scanner.nextInt();
for(int i=1;i<=a;++i){
 if(i%2!=0){
 System.out.println(i);
}
}
}
}