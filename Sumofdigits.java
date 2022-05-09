package selenium;

public class Sumofdigits {
	public static void main(String[] args) {
		int a=120;
		int sum=0;
		while(a>0) {
		int rem=a%10;
		sum =sum+rem;
		a=a/10;
		}
		System.out.println(sum);
	}


}