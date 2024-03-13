import java.util.*;
class Letter{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c=sc.next().charAt(0);
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==c){
				System.out.println("Found "+c+" at postion "+i);
				break;
			}
			else if(i==a.length-1)
			{
				System.out.println("Not Found");
			}
		}
	}
}