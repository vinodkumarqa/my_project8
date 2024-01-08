package arrays;

public class Arrays2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]rollno=new int[4][4];
		rollno[0][0]=1;
		rollno[0][1]=2;
		rollno[0][2]=3;
		rollno[0][3]=4;
		rollno[1][0]=10;
		rollno[1][1]=11;
		rollno[1][2]=12;
		rollno[1][3]=13;
		rollno[2][0]=21;
		rollno[2][1]=22;
		rollno[2][2]=23;
		rollno[2][3]=24;
		rollno[3][0]=31;
		rollno[3][1]=32;
		rollno[3][2]=33;
		rollno[3][3]=34;
		for(int i=0;i<=rollno.length;i++) {
			for(int j=0;j<i;j++) {
				System.out.println(rollno[j]);
			}
		System.out.println(rollno);
		}
		
		
	}

}
