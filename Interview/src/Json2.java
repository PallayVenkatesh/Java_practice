import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Json2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader in = new BufferedReader(new FileReader("json.txt"));
        String s;
        while ((s = in.readLine()) != null) {
        
        	
        	s=s.trim();
        	if(s.length()==0){
        		continue;
        	}
        	int sum=0;

        	Pattern p = Pattern.compile("\"id\": (\\d+), \"label\"");
        	Matcher m = p.matcher(s);
        	
        	while(m.find()){
        		
        		sum += Integer.parseInt(m.group(1));
        	}
        	
        	
        	System.out.println(sum);
        }
		
	}

}
