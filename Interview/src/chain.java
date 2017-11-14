import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class chain {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

BufferedReader br = new BufferedReader(new FileReader("chain.txt"));
		
		String s="";
		while((s=br.readLine())!=null){
			s.trim();
			String[] first = s.split(";");
			Map <String,String> mp = new HashMap<String,String>();
			for(String pair : first){
				String[] elem = pair.split("-");
				mp.put(elem[0], elem[1]);
			}
			
			String itr = "BEGIN";
			int count = 0;
			while(!itr.equals("END")){
				itr = mp.get(itr);
				count++;
				if(count>mp.size()){
					break;
				}
			}
			
			if(count==mp.size()){
				System.out.println("Good");
			}
			else{
				System.out.println("Bad");
			}
			
			
			
		}
		
		
	}

}
