import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class jollynew
{
	public static void main(String[] args) throws Exception
	{
		
		try (BufferedReader buffer = new BufferedReader(new FileReader("test.txt")))
		{
			String line;
			while ((line = buffer.readLine()) != null)
			{
				line = line.trim();
				String[] numbers = line.split(" ");
				
				numbers = Arrays.copyOfRange(numbers, 1, numbers.length);

				Set<Integer> diffs = new HashSet<>();

				if (numbers.length > 1)
				{
					for (int i = 1; i < numbers.length; ++i)
					{
						Integer a = Integer.valueOf(numbers[i - 1]);
						Integer b = Integer.valueOf(numbers[i]);

						Integer diff = 0;
						if (a > b)
						{
							diff = a - b;
						}
						else
						{
							diff = b - a;
						}
						
						if (diffs.contains(diff) || diff > numbers.length - 1 || diff == 0)
						{
							System.out.println("Not jolly");
							break;
						}
						diffs.add(diff);
					}
					
					if(diffs.size() + 1 == numbers.length)
					{
						System.out.println("Jolly");
					}
				}
				else
				{
					System.out.println("Jolly");
				}
			}
		}
	}
}