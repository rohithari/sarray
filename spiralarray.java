public class spiralarray

{

void spiral(int eri, int eci, int a[][])
	{
    		int i, sri = 0, sci = 0;

   

    		while (sri < eri && sci < eci)
    		{
        		/* Print the first row from the remaining rows */
        		for (i = sci; i < eci; ++i)
        			{
            				System.out.println(" ", a[sri][i]);
        			}
        			sri++;

        		/* Print the last column from the remaining columns */
        		for (i = sri; i < eri; ++i)
        			{
            				System.out.println(" ", a[i][eci-1]);
        			}
        			eci--;

        		/* Print the last row from the remaining rows */
        		if ( sri < eri)
        			{
            				for (i = eci-1; i >= sci; --i)
            					{
                					System.out.println(" ", a[eri-1][i]);
            					}
            					eri--;
        			}

        		/* Print the first column from the remaining columns */
        		if (sci < eci)
        			{
            				for (i = eri-1; i >= sri; --i)
            					{
                					System.out.println(" ", a[i][sci]);
            					}
            					sci++;    
        			}        
    		}

	}

public static void main(String args[])
	{
    		int a[][] = { {1,  2,  3,  4,  5,  6},
        	{7,  8,  9,  10, 11, 12},
        	{13, 14, 15, 16, 17, 18}
    			      };

    		spiral(2, 5, a);
    		return 0;
	}

}
