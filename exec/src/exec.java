import java.io.IOException;


public class exec {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Runtime run = Runtime.getRuntime();
			Process proc = run.exec("lxterminal");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
