public class Loops {

    public static void main(String[] args) {

        int x=1;

        for(int i=1;i<=5;i++){
            System.out.println(x+i);
            if (x!=0)
            {
                System.out.println("hello");
            }

        }
        do{

                System.out.println("hello");

                x++;

        }while(x<4);

        if (x!=0)
        {
            System.out.println("hello");
        }



    }
}
