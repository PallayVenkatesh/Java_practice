import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class StackPractice {

	/**
	 * @param args
	 */

	  private static Stack<Integer> st = new Stack<Integer>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=br.readLine())!=null){

			
			String[] s2 = s.trim().split(" ");
			
			for(String num :s2 ){
				
				push(Integer.parseInt(num));
			}
			
			StringBuilder bil = new StringBuilder();
			while(!st.empty()){
				bil.append(pop()+" ");
				if(!st.empty()){
					pop();
				}
			}
			System.out.println(bil);
			
			
		}
		
	}
	
	public static void push(Integer num){
		st.push(num);
	}
	public static Integer pop(){
		return st.pop();
	}

}
