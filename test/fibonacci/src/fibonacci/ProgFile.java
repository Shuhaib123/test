package fibonacci;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import fibonacci.Sum;

public class ProgFile extends Sum {
	
	public static void main(String[] args, String sum) throws IOException {
		
		PrintWriter f0 = new PrintWriter(new FileWriter("output.txt"));

		for(int i=0;i<100;i++)
		{
		    f0.println("Result "+ i +" : "+ sum);
		}
		f0.close();

}
}
