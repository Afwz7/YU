/*****************************************************************************************************************/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/************************      Yangtze assignements repo : Afw7 | https://github.com/Afwz/YU   *******************/
/************************              DARE AND COPY IT DOUCHEBAG IM THE DEVIL!!!!!(*_-) :XD   *******************/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*****************************************************************************************************************/

import	java.util.Scanner;
import	java.lang.Math;

class Wind_Chill_Temperature
{
	static void	wct()
	{
		double	ta;
		double	v;
		double	twc;

		twc = 0;
		Scanner _var1 = new Scanner(System.in);
		System.out.printf("Enter the temperature in Fahrenheit between -58°F and 41°F : ");
		ta = _var1.nextFloat();
		System.out.printf("Enter the wind speed (>= 2) in miles per hour : ");
		v = _var1.nextFloat();
		_var1.close();
		if (v >= 2)
		{
			twc = 35.74 + 0.6215 * ta + (-35.75) * Math.pow(v, 0.16) + 0.4275 * ta * Math.pow(v, 0.16);
			System.out.printf("the wind chill index is : %f\n", twc);
		}
		else
		{
			System.out.printf("error -1 [wind speed <= 2]\n");
		}
	}
	public static void main(String[] arguments)
	{
		wct();
	}
}
