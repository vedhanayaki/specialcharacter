package player;
import java.util.Scanner;
public class SpecialCharactercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
String a=s.nextLine();
int b=a.length()-a.replaceAll("\\*","").length();
System.out.println(b);
	}

}
