
public class countofcharacer {

	public static void main(String[] args) {
		String s="java developer";
		System.out.println(getcount(s,'e'));
		System.out.println(getcount(s,'a'));
		System.out.println(getcount(s,'1'));
		System.out.println(getcount(s,'1'));
		System.out.println(getcount(s,'b'));
		}
public static int getcount(String s,char c) {
	return s.length()-s.replace(c+"","").length();
	}
}
