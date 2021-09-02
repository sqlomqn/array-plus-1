import	java.util.Scanner;
public	class	array	{
	public	static	void	main(String[] args)	{
		Scanner	sc	=	new	Scanner(System.in);
		System.out.println("Enter the length of the array=");
		int	number	=	sc.nextInt();
		int[]	array	=	new	int[number];
		System.out.println("Array length=" + array.length);	
		sc.close();
		for	(int i=0;i<number;i++) {
			for (int j=0;j<number;j++) {
				array[j]++;
			}
		System.out.println(array[i]);
		}
	}
}	

        
	