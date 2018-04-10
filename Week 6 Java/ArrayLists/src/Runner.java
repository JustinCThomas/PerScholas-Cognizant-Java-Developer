import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
	
	public static void main(String[] args) {
		List<String> listOfColors = new ArrayList<String>();
		listOfColors.addAll(Arrays.asList("Red", "Green", "Orange", "White", "Black"));
		System.out.println(listOfColors);
		
		
		
		
		System.out.println(Colors.iterator(listOfColors));
		Colors.updater(listOfColors);
		System.out.println(listOfColors);
		
		
		
		
		Colors.remover(listOfColors, 2);
		System.out.println(listOfColors);
		
		
		
		System.out.println(Colors.searcher(listOfColors, "MageNTa"));
		
		
	
		Colors.sorter(listOfColors);
		System.out.println("Here is the sorted array:");
		System.out.println(listOfColors);
		System.out.println();
		
		
		
		
		
		List<String> secondArray = Colors.reverser(listOfColors);
		System.out.println(secondArray);
		System.out.println();
		
		
		
		secondArray = Colors.copyer(listOfColors, secondArray);
		System.out.println(secondArray);
		
	
		
		System.out.println(Colors.comparer(listOfColors, secondArray));
		
		Colors.appender(listOfColors, secondArray);
		System.out.println(secondArray);
		
		Colors.looper(secondArray);
		System.out.println("////////////////");
		
		String[] convertedArray = Colors.converter(secondArray, secondArray.size());
		
		for (String item: convertedArray) {
			System.out.println(item);
		}
		
	}
}
