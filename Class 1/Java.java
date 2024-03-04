public class Java {
  public static void main(String[] args) {
  
  
   System.out.println("Widening");
  
  int a=32588675;
  double b=a;
  System.out.println(b);
  
  
  int c=2;
  long d=c;
  System.out.println(d);
  
  char f='a';
  long e=f;
  System.out.println(e);
  
  short g=-2;
  int h=g;
  System.out.println(h);
  
  byte i=-2;
  short j=i;
  System.out.println(j);
  
  
  
    System.out.println("end");
    System.out.println("Narrowing");
     
  
  double k=5664332.55443677d;
  int l=(int) k;
  System.out.println(l);
  
  float m=5768.777f;
  short n=(short) m;
  System.out.println(n);
  
  long o=57;
  byte p=(byte) o;
  System.out.println(p);
  
  long q=26676;
  int r=(int) q;
  System.out.println(r);
  
  
  char s='b';
  byte t=(byte) s;
  System.out.println(t);   
   
  
  }
}

