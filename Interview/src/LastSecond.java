
public class LastSecond {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = " hi ra ala unav ra?";
		s=s.trim();
		
		String[] s2 = s.split(" "); 
//		System.out.println(s2[s2.length-2]);
		String out="";
		for(int i=s2.length-1;i>=0;i--){
			out += s2[i]+" ";
		}
		System.out.println(out);
		
		
	}

}
