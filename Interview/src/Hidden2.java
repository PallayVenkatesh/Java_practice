import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Hidden2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader in = new BufferedReader(new FileReader("hidden.txt"));
        String s;
        
        while ((s = in.readLine()) != null)
        {	String result="";
        	
        	for(int i=0;i<s.length();i++ ){
        		
        		char c = s.charAt(i);
        		if(c>='a'&&c<='j'){
        			result = result + (c-'a');
        		}
        		else if(c>='0' && c<='9'){
        			result = result + (c);
        		}
        		else{
        			result += "";
        		}
        		
        	}
        	if(result.equals("")){
        		result = "NONE";
        	}
        	System.out.println(result);
        	
        }
	}

}
