import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MethodVault {
	public static void append (LinkedList<String> linkedList, String str){
		linkedList.add(str);
	}
	
	public static void iterate (LinkedList<String> linkedList){
		Iterator Iterator = linkedList.iterator();
		while (Iterator.hasNext()) {
			System.out.println(Iterator.next());
		}
	}
	
	public static void iterate2 (LinkedList<String> linkedList, int position){
		Iterator Iterator = linkedList.listIterator(position);
		while (Iterator.hasNext()) {
			System.out.println(Iterator.next());
		}
	}
	
	public static void reverseIterate (LinkedList<String> linkedList){
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(linkedList.size() - 1 - i));
		}
	}
	
	public static void insertAtPosition (LinkedList<String> linkedList, int position, String element){
		linkedList.add(position, element);
	}
	
	public static void insertAtFrontAndEnd (LinkedList<String> linkedList, String element){
		linkedList.push(element);
		linkedList.add(element);
	}
	
	public static void insertAtFront (LinkedList<String> linkedList, String element){
		linkedList.push(element);
	}
	
	public static void insertAtEnd (LinkedList<String> linkedList, String element){
		linkedList.add(element);
	}
	
	public static void insertGroupAtPosition (LinkedList<String> linkedList, int position, String ...elements){
		for (int i = 0; i < elements.length; i++){
			linkedList.add(position + i, elements[i]);
		}
	}
	
	public static void getOccurrences (LinkedList<String> linkedList, String element){
		int firstOccurrence = linkedList.indexOf(element);
		int lastOccurrence = linkedList.lastIndexOf(element);
		int[] indices = {firstOccurrence, lastOccurrence};
		System.out.println("The string \"" + element + "\" first occurs "
				+ "index " + firstOccurrence + ".\r\n"
				+ "It last appears at index " + lastOccurrence + ".");
		}
	
	public static void removeFirstAndLast (LinkedList<String> linkedList){
		linkedList.pop();
		linkedList.removeLast();
	}
	
	public static void removeAllElements (LinkedList<String> linkedList){
		linkedList.clear();
	}
	
	public static void swapElements (LinkedList<String> linkedList, String element1, String element2){
		if (linkedList.contains(element1) && linkedList.contains(element2)){
			int index1 = linkedList.indexOf(element1);
			int index2 = linkedList.indexOf(element2);
			linkedList.removeFirstOccurrence(element1);
			linkedList.add(index1, element2);
			linkedList.removeLastOccurrence(element2);
			linkedList.add(index2, element1);
		}
	}
	
	public static void swapElements (LinkedList<String> linkedList, int index1, int index2){
		String str1 = linkedList.get(index1);
		String str2 = linkedList.get(index2);
		linkedList.remove(index1);
		linkedList.add(index1, str2);
		linkedList.remove(index2);
		linkedList.add(index2, str1);	
	}
	
	public static List<String> toArrayList (LinkedList<String> linkedList){
		List<String> arrList = new ArrayList<String>(linkedList);
		return arrList;
	}
	
	public static void isEmptyLinkedList (LinkedList<String> linkedList){
		if (linkedList.isEmpty()){
			System.out.println("This linked list appears to be empty at the moment.");
		} else {
			System.out.println("This linked list is definitely NOT empty.");
		}
		
	}
	
	
	
	
}
