package eu.ase.hello;

public class ProgMain 
{
 public static void main(String args[]) {
   Certificate a = new Certificate(234, "Ion");
   Certificate b = new Certificate(355, "Vasile");

   System.out.println("\n a="+a.toString());
   System.out.println("\n b="+b.toString());

   //b = a;		//e gresit
   b = a.cloneaza();
   b.setUid(888);
   b.setIssuerName("WWW");

   System.out.println("\n a="+a.toString());
   System.out.println("\n b="+b.toString());
   
 }
}