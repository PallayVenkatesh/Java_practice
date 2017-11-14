import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ShortestDist {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("short.txt"));
		String s;
		while((s=br.readLine())!=null){
			
			System.out.println(shortt(s));
			
			
			
		}
		
		br.close();	
	}
	
	public static int shortt(String s){
		
		
		for(int i =1;i<s.length();i++){
			
			if(s.matches("("+s.substring(0,i)+")+")){
				return i;
			}
			
			
		}
		
		
		
		return s.length();
		
		
		
	}

}
