package stringss;

public class Strings {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str="marolix";
		String str="welcome to marolix";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
		   reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);

	}

}
