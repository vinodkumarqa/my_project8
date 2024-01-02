package stringss;

public class Wordcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="we are all indians";
		int count=1;
		for(int i=0;i<=str.length();i++) {
			System.out.println();
		    if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){
		       count++; 
		    }
		}
		System.out.println(count);

	}

}
