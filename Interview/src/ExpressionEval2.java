
public class ExpressionEval2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String in = "	567 a+bc";
		
		String first = in.trim().split(" ")[0];
		String second = in.trim().split(" ")[1];
		long result =  0;
		int index=0;
		if(in.contains("+")){
			index = second.indexOf("+");
			result = Long.parseLong(first.substring(0,index))+ Long.parseLong(first.substring(index,first.length()));
			
			
		}
		else{
			index = second.indexOf("-");
			result = Long.parseLong(first.substring(0,index))- Long.parseLong(first.substring(index,first.length()));
			
			
		}
		System.out.println(result);
		
		
		
		
		
	}

}
