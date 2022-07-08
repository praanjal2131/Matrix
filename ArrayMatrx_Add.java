


import java.util.*;
class ArrayMatrx_Add
   {

       public static void main(String args[])
       {
            
        Scanner x = new Scanner(System.in);

        int [][]  a = new int [3][3];
	int [][]  b = new int [3][3];
	int [][] c= new int[3][3];

          int row , col;
        System.out.print("Enter the elementsof Matrix a="+ " ");
           for(row=0; row<3; row++)
             {
              for(col=0; col<3; col++)
                a[row][col]=x.nextInt();
             }

	System.out.print("Enter the elements of Matrix b="+ " ");
           for(row=0; row<3; row++)
             {
              for(col=0; col<3; col++)
                a[row][col]=x.nextInt();
             }

           System.out.println("Printing Matrix a =");
	System.out.println("a[3][3]=");     
        for(row=0; row<3; row++)
             {
              for(col=0; col<3; col++)
                System.out.print(a[row][col]+" ");
		
            System.out.println();
	}
	 System.out.println("Printing Matrix b ="); 
	System.out.println("b[3][3]=");    
        for(row=0; row<3; row++)
             {
              for(col=0; col<3; col++)
                System.out.print(b[row][col]+" ");
		
            System.out.println();
	}
	//System.out.println("c[3][3]=");
	for(row=0; row<3; row++)
             {
              for(col=0; col<3; col++)

	      c[row][col]=a[row][col]+b[row][col];
		System.out.println();
	}
	System.out.println("====Addition of both====");
	System.out.println("c[3][3]=");
	for(row=0; row<3; row++)
             {
              for(col=0; col<3; col++)
	System.out.print(c[row][col]+" ");
	
            
	System.out.println();
        }



	for(row=0; row<3; row++)
             {
              for(col=0; col<3; col++)

	      c[row][col]=a[row][col]-b[row][col];
		System.out.println();
	}
	System.out.println("====Substraction of both====");
	System.out.println("c[3][3]=");
	for(row=0; row<3; row++)
             {
              for(col=0; col<3; col++)
	System.out.print(c[row][col]+" ");
	
            
	System.out.println();
        }
	}

  }
     