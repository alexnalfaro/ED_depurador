
public class factorial_alex {

	public static void main(String[] args) 
	{
		// TODO Esbozo de método generado automáticamente
		System.out.print("Dame un numero: ");
		int n = Console.readInt();
		int factorial = crearFactorial(n);
		System.out.println("La factorial de "+n+" es: "+factorial);
	}
	public static int crearFactorial (int n)
	{
		int multi = 1;
		for (int i=n;i>0;i--)
		{
			multi = multi * i;
		}
		return multi;
	}

}
