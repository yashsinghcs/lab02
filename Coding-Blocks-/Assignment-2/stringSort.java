import java.util.*;
public class stringSort {
    public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<String> str = new ArrayList<>();
		for (int i = 0; i <n ; i++) {
            str.add(sc.nextLine());
        }
        Collections.sort(str,new Comparator<String>(){
			@Override
			public int compare(String o1,String o2){
				if(o1.contains(o2)||o2.contains(o1)){
					return o2.length()-o1.length();
				}
				return o1.compareTo(o2);
			}
		});
		for (int i=0;i <n;i++){
			System.out.println(str.get(i));
		}
    }
}