import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;


public class Armstrong {

	/**
	 * @param args
	 * @throws IOException 
	 */
public static void main(String[] args) throws IOException{

	BufferedReader br = new BufferedReader(new FileReader("num.txt"));
	String s="";
	while((s=br.readLine())!=null){
		
		int num = Integer.parseInt(s);
		int temp = num;
		int sum=0;
		
		while(num>0){
			
			int j = num%10;
			num = num/10;
			sum= (int) ( sum+ Math.pow(j, 3));
		
		}
		System.out.println(sum);
		if(temp == sum){
			System.out.println("Armstrong");
		}
		else{
			System.out.println("not Armstrong");
			
		}
		
		
		
	}	
		
		
	}

}
