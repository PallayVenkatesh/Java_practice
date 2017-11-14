import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Jolly2 {

	/**
	 * @param args
	 */
	public static String Jol(int[] num){
		for(int j=0;j<num.length-1;j++){
			int diff=Math.abs(num[j]-num[j+1]);
			if(diff==0 || diff>num.length-1){
				
				return "not jolly";
			}
			
		}
		return "jolly";
		
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		String s;
		
		while((s=br.readLine())!=null){
			
			String[] s2 = s.trim().split(" ");
			int[] num = new int[s2.length];
			for (int i=0;i<num.length;i++){
				num[i]=Integer.parseInt(s2[i]);
			}
			
			System.out.println(Jol(num));
			
		}
		
	}

}
