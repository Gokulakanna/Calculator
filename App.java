class App
{
	public static void main(String[] args)
	{
		Calculator calc = new Calculator();
		System.out.println("---Sum---"+calc.sum(100,50));
		System.out.println("---Difference---"+calc.difference(100,50));
		System.out.println("---Product---"+calc.product(100,50));
	}
}