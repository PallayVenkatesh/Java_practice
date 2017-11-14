	
public class armstrong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "371";
		int i = Integer.parseInt(s.trim());
		int temp = i;
		int sum=0;
		
		while(i>0){
			int r = i%10;
			 i =i/10;
			 sum += Math.pow(r, 3);
		}
		 
		if(sum == temp){
			System.out.println("Armstrong");
		}
		else{
			System.out.println("Not Armstrong");
		}
		
	}

}
