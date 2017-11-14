import java.io.*;
import java.util.ArrayList;


public class commonArr {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		while((s=br.readLine())!=null){
			
			String set1 = s.split(";")[0];
			String set2 = s.split(";")[1];
			
			String[] temp1 = set1.split(",");
			String[] temp2 = set2.split(",");
			int[] num1 = new int[temp1.length];
			int[] num2 = new int[temp2.length];
			for(int i =0;i<temp1.length;i++){
				num1[i] = Integer.parseInt(temp1[i]);
			}
			for(int i =0;i<temp2.length;i++){
				num2[i] = Integer.parseInt(temp2[i]);
			}
			String out="";
			for(int i=0;i<num1.length;i++){
				for(int j=0;j<num2.length;j++){
					if(num1[i]==num2[j]){
						out +=  num1[i]+ "\n";
					}
				}
				
			}
			
				System.out.println(out);
					
			
			
		}
		
		
	}

}
