import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Stack;


public class Stack2
{
	private static Stack<Integer> stack = new Stack<>();
	
	public static void main(String[] args) throws Exception
	{
		
		try (BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)))
		{
			String line;
			while ((line = buffer.readLine()) != null)
			{
				line = line.trim();
				String[] numbers = line.split(" ");

				for (String number : numbers)
				{
					push(Integer.valueOf(number));
				}
				
				StringBuilder builder = new StringBuilder();
				while (!stack.empty())
				{
					builder.append(pop() + " ");
					if (!stack.empty())
					{
						pop();
					}
				}
				
				if(builder.length() > 0)
				{
					builder.deleteCharAt(builder.length() - 1);
				}
				System.out.println(builder);
			}
		}
	}

	public static void push(Integer number)
	{
		stack.push(number);
	}
	
	public static Integer pop()
	{
		return stack.pop();
	}
}