import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void swap(ArrayList<String> list, int index1, int index2) {
		String temp = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, temp);

	}

	public static ArrayList<Double> createArrayList (double[] arr){
		ArrayList<Double> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		return list;
		
	}

	public static ArrayList<Integer> mergeLists (ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> merge = new ArrayList<>();
		for (int i =0; i <list1.size(); i++) {
			merge.add(list1.get(i));
		}
		for (int i =0; i <list2.size(); i++){
			merge.add(list2.get(i));
		}
		return merge;
	}


}
