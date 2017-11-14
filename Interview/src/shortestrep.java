import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class shortestrep {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("short.txt"));
		
		String s="";
		while((s=br.readLine())!=null){
			
			System.out.println(check(s));
			
		}
		
	}
	
	public static int check( String s){
		
		for(int i=1;i<s.length();i++){
			
			String sub = s.substring(0,i);
			if(s.matches("("+sub+")+")){
				return i;
			}
			
		}
		
		return s.length();
		
	}

}
