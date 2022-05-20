class scanner2
{
public static void main(String[] args)
{
java.util.scanner scn=new java.util.scanner(System.in);
System.out.println("Enter your Name");
String name=scn.next();
System.out.println("Enter your Age");
int age=scn.nextInt();
System.out.println("Enter your Gender);
char c=scn.next().charAt(0);
System.out.println("Name="+name+",Age="+age+,gender="+c);
}
}