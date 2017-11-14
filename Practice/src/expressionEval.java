
public class expressionEval {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input = "776 ab+c";
		String set1 = input.trim().split(" ")[0];
		String set2 = input.trim().split(" ")[1];
		int index=0;
		long out = 0;
		if(set2.contains("+")){
			index = set2.indexOf("+");
			out =  Long.parseLong(set1.substring(0,index))+ Long.parseLong(set1.substring(index,set1.length()));
			
		}
		else{
			
			index = set2.indexOf("-");
			 out =  Long.parseLong(set1.substring(0,index))+ Long.parseLong(set1.substring(index,set1.length()));
			
		}
		System.out.println(out);
	}

}
