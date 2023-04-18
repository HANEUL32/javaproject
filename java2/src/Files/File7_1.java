package Files;

import java.util.ArrayList;
import java.util.Arrays;

public class File7_1 {
	
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
		ArrayList<String> a2 = new ArrayList<>();
		//2차 배열값을 적용할 때 사용 LinkedList, List, Map
		ArrayList<ArrayList<String>> all = new ArrayList<>(2);
		String data = "1,2,3,4,5,10,20,30,40,50";
		String data2[] = data.split(",");
		int ea = data2.length;
		int w = 0;
		while(w < ea) {
			if(w < 5) {
				a1.add(data2[w]);
			}
			else {
				a2.add(data2[w]);
			}
			w++;
		}
			all.add(a1);
			all.add(a2);
			System.out.println(all);
	}

}
