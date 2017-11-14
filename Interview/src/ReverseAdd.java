import java.io.*;


public class ReverseAdd  {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("rev.txt"));
		String s,s2;
		System.out.println(2);
		
		while ((s = br.readLine()) != null) {
			int count =0;
			s=s.trim();
			
			do{
				count++;
				StringBuilder sb = new StringBuilder(s).reverse();
				 long num = Long.parseLong(s) +Long.parseLong(sb.toString());
				s2 = Long.toString(num);
				
			}while(!palin(s2));
			System.out.println(count+" "+s2);
			
		}
	}

	public static boolean palin(String s2){
		char[] ch = s2.toCharArray();
		for(int i=0;i<ch.length/2;i++){
			if(ch[i]!=ch[ch.length-1-i]){
				return false;
			}
		}
		return true;
		
		
		
	}

}
