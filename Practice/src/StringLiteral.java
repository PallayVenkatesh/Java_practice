import java.util.Arrays;


public class StringLiteral {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abdbcccddd";
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		String out="";
		String s2="";
		for(int i=0;i<s.length();i++){
			 s2 = s2+ch[i];
		}
		
		
		for(int i = 0;i<ch.length;i++){
			int count=0;
			for(int j = 0;j<ch.length;j++){
				if(s2.charAt(i)==s2.charAt(j)){
					count++;
				}
			}
			if(!out.contains(s2.substring(i,i+1))){
				out = out+ s2.charAt(i) + "-" + count;
			}
			 
			
		}
		System.out.println(out);
	}

}
