import java.util.*;
public class Word {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String word=sc.nextLine();
        String a[]=s.split(" ");
        for(int i=0;i<a.length;i++)
        {
            if(word.equals(a[i]))
            {
                System.out.println("Found "+word+" at postion "+i);
                break;
            }
            else if(i==(a.length)-1)
            {
                System.out.println("Not Found");
            }
        }
    }
}
