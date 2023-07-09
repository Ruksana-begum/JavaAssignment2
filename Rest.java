package Rate;
import java.util.Scanner;

public class Rest {

	public static void main(String[] args) {
		
			   Scanner sc= new Scanner(System.in);
			   String[] a= {"sedan","hatchback","seater5","sedan","hatchback"};
			   String[] b= {"A","B","C","D","E"};
			   double[] c= {4,4.3,4.8,4.1,4.7};
			   int[]    d= {500,1000,200,700,430};
			   int cpkm=8;
			   System.out.println("driver | carname | rating | distfrom");
			   for(int i=0;i<5;i++) {
				   System.out.println(b[i]+" | "+a[i]+" | "+c[i]+" | " +d[i]);
			   }
			   System.out.println("Customer Ride Distance: ");
			   Double dist=sc.nextDouble();
			   System.out.println("Car Requested:");
			   String carn=sc.next();
			   switch(carn) {
			   case "sedan":
				   Sedan s1=new Sedan();
				   s1.print();
				   System.out.println("total charge: "+cpkm*dist);
				   break;
			  case "seater5" :
				  Seater5 s2= new Seater5();
				  s2.print();
				  System.out.println("total charge: "+cpkm*dist);
				  break;
			  case "hatchback":
				  Hatchback h1=new Hatchback();
				  h1.print();
				  System.out.println("total charge: "+cpkm*dist);
				  break;
			  default:
				  System.out.println("invalid car selection");
			   }
			   sc.close();
		   }
}
		// TODO Auto-generated method stub

	
