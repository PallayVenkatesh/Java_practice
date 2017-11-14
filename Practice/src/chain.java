
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class chain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("chain.txt"));
		String s;
		while((s=br.readLine())!=null){
			Map<String,String> mp = new HashMap<String,String>();
			String[] group1 = s.trim().split(";");
			
			for(String node : group1){
			
				String[] group2 = node.trim().split("-");
				mp.put(group2[0], group2[1]);
				
			}
			int count=0;
			String trav = "BEGIN";
			while(!trav.equals("END")){
				
				trav = mp.get(trav);
				count++;
				if(count>mp.size()){
					break;
				}
				
			}
			
			System.out.println(count==mp.size()?"GOOD":"BAD");
			
			
			
		}
		
	}

}
