
public class distinctelement {
	public static void main(String[] args) {
		int[] arr= {10,20,10,30,50,20};
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(i!=j && arr[i]==arr[j])
				{
					arr[i]=0;
				}
			
			}
			if(arr[i]!=0)
				System.out.println(arr[i]);
		}
	}

}
