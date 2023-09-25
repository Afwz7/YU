/*****************************************************************************************************************/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/************************      Yangtze assignements repo : Afw7 | https://github.com/Afwz/YU   *******************/
/************************              DARE AND COPY IT DOUCHEBAG IM THE DEVIL!!!!!(*_-) :XD   *******************/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*****************************************************************************************************************/
import java.util.Scanner;

class	DisplayTime
{
	static void	convert_time()
	{
		int	scs;
		int	mnt;
		int	rem_scs;


		scs = 0;
		Scanner time = new Scanner(System.in);
		System.out.printf("Enter an integer for seconds : ");
		scs = time.nextInt();

		mnt = scs / 60;
		rem_scs = scs % 60;
		System.out.printf("%d seconds is %d minutes and %d seconds\n", scs, mnt, rem_scs);
	}
	public static void main (String[] arguments)
	{
		convert_time();
	}
}
