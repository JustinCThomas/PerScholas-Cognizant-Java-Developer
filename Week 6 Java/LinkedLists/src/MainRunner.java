import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainRunner {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		System.out.println(linkedList);
		System.out.println();
		
//		Part 1
		System.out.println("Part 1:");
		MethodVault.append(linkedList, "Hello World!");
		MethodVault.append(linkedList, "Java");
		MethodVault.append(linkedList, "Scala");
		System.out.println(linkedList);
		System.out.println();	
		
//		Part 2
		System.out.println("Part 2:");
		MethodVault.iterate(linkedList);
		System.out.println();
		
//		Part 3
		System.out.println("Part 3:");
		MethodVault.iterate2(linkedList, 1);
		System.out.println();
		
//		Part 4
		System.out.println("Part 4:");
		MethodVault.reverseIterate(linkedList);
		System.out.println();
		
//		Part 5
		System.out.println("Part 5:");
		MethodVault.insertAtPosition(linkedList, 2, "COBOL");
		System.out.println(linkedList);
		System.out.println();
		
//		Part 6
		System.out.println("Part 6:");
		MethodVault.insertAtFrontAndEnd(linkedList, "FORTRAN");
		System.out.println(linkedList);
		System.out.println();
		
//		Part 7
		System.out.println("Part 7:");
		MethodVault.insertAtFront(linkedList, "Python");
		System.out.println(linkedList);
		System.out.println();
		
//		Part 8
		System.out.println("Part 8:");
		MethodVault.insertAtEnd(linkedList, "Ruby");
		System.out.println(linkedList);
		System.out.println();
		
//		Part 9
		System.out.println("Part 9:");
		MethodVault.insertGroupAtPosition(linkedList, 4, "TypeScript", "Kotlin", "Clojure");
		System.out.println(linkedList);
		System.out.println();
		
//		Part 10
		System.out.println("Part 10:");
		MethodVault.getOccurrences(linkedList, "FORTRAN");
		System.out.println();
		
//		Part 11
		System.out.println("Part 11:");
		MethodVault.removeFirstAndLast(linkedList);
		System.out.println(linkedList);
		System.out.println();

//		Part 12
		System.out.println("Part 12:");
		LinkedList<String> clonedList = (LinkedList<String>) linkedList.clone();
		MethodVault.removeAllElements(linkedList);
		System.out.println("linkedList: ");
		System.out.println(linkedList);
		System.out.println();
		System.out.println("clonedList: ");
		System.out.println(clonedList);
		System.out.println();
		
//		Part 13
		System.out.println("Part 13:");
		MethodVault.swapElements(clonedList, "Java", "Scala");
		System.out.println(clonedList);
		System.out.println();
		
//		Overloaded version that uses indices
		System.out.println("Overloaded version that uses  indices:");
		try{
			MethodVault.swapElements(clonedList, 1, 4);
			System.out.println(clonedList);
			System.out.println();
		} catch (IndexOutOfBoundsException e){
			System.out.println("It looks like there was an error.");
			e.printStackTrace();
			System.out.println();
		}
			
//		Part 14
		System.out.println("Part 14:");
		List<String> newArrayList = MethodVault.toArrayList(clonedList);
		System.out.println(newArrayList);
		System.out.println(newArrayList instanceof ArrayList);
		System.out.println();
		
//		Part 15
		System.out.println("Part 15:");
		MethodVault.isEmptyLinkedList(linkedList);
		MethodVault.isEmptyLinkedList(clonedList);;
		System.out.println();
	}
}
