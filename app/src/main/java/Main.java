import simulator.SimulatorMain;

/**
 * 这只是纯java模拟，希望别瞎搞，能运行，然后编译就ok,但是某些上下文是没发模拟的，比如用到了context的地方会出问题的。
 */
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
//模拟收到消息的测试 RobotConfigInterface

		/*
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		double number1 = input.nextDouble();

		System.out.print("Enter second number: ");
		double number2 = input.nextDouble();

		double product = number1 * number2;
		System.out.printf("The product of both numbers is: %f", product);

		*/

		SimulatorMain.startSimulate();





	}


}
