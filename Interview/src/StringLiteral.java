import java.util.Arrays;


public class StringLiteral {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "abdbcccddd";
		char[] ch = st.toCharArray();
		Arrays.sort(ch);
		String result="";
		for(int i =0;i<ch.length;i++){
			result=result+ch[i];
			
		}
		String out="";
		for(int i=0;i<result.length();i++){
			int count = 0;	
			for(int j=0;j<result.length();j++){
				
				if(result.charAt(i) == result.charAt(j)){
					count++;
				}
				
			}
			
			
			if(!out.contains(result.substring(i,i+1))){
				out=out+result.charAt(i)+" "+count;
			}
			
		}
		System.out.println(out);
		
		
	}

}
