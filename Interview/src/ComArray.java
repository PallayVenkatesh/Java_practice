import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class ComArray {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=br.readLine())!=null){
			String first = s.split(";")[0];
			String second = s.split(";")[1];
			
			String[] arr1 = first.split(",");
			String[] arr2 = first.split(",");
			int[] nums1 = new int[arr1.length];
			int[] nums2 = new int[arr2.length];
			for(int i=0;i<arr1.length;i++){
				nums1[i]=Integer.parseInt(arr1[i]);
				
			}
			for(int i=0;i<arr2.length;i++){
				nums2[i]=Integer.parseInt(arr2[i]);
				
			}
			ArrayList<Integer> ar =new ArrayList<Integer>();
			for(int i=0;i<nums1.length;i++){
				for(int j=0;j<nums2.length;j++){
					if(nums1[i] == nums2[j]){
						
						ar.add(nums1[i]);
					}
					
				}
			}
			for(int num : ar){
				System.out.println(num);	
			}
			
			
			
			
		}
		
		
	}

}
