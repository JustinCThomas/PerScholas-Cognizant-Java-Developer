import java.util.ArrayList;
import java.util.List;

public class Colors {
	public static String iterator(List<String> colors) {
		String str = "";
		for (String color: colors) {
			str += "Today's color is " + color + "!\r\n";
		}
		return str;
	}
	
	public static void updater(List<String> colors) {
		for (int i = 0; i < colors.size(); i++) {
			if (i == 4) {
				colors.set(4, "Magenta");
			}
		}
	}
	
	public static void remover(List<String> colors, int index) {
		colors.remove(index);
	}
	
	public static String searcher(List<String> colors, String colorToSearch) {
		String str =  "";
		for (String color: colors) {
			if (color.toLowerCase().equals(colorToSearch.toLowerCase())) {
				str += "We found the color " + colorToSearch.toLowerCase() + " in the array!";
				return str;
			}
		}
		str += "The color " + colorToSearch.toLowerCase() + " was not found in the array.";
		return str;
		
	}
	
	public static void sorter(List<String> colors) {
		boolean doneSorting = true;
		
		while (true) {
			doneSorting = true;
			
			for (int i = 0; i < colors.size() - 1; i++) {
				if (colors.get(i).compareToIgnoreCase(colors.get(i + 1)) > 0) {
					String placeholder = colors.get(i);
					colors.set(i, colors.get(i + 1));
					colors.set(i + 1, placeholder);
					doneSorting = false;
				}
			}
			if (doneSorting) {
				return;
			}
		}
	}
	
	public static List<String> reverser(List<String> colors) {
		List<String> newArrayList = new ArrayList<String>();
		for (int i = 0; i < colors.size(); i++) {
			newArrayList.add(colors.get(colors.size() - 1 - i));
		}
		return newArrayList;
	}
	
	public static List<String> copyer(List<String> colors, List<String> newList){
		newList.clear();
		for (String item: colors) {
			newList.add(item);
		}
		return newList;
	}
	
	public static String comparer(List<String> list1, List<String> list2) {
		String str = "";
		for (String item: list1) {
			if (list2.contains(item)) {
				str += item + "\r\n";
			}
		}
		return str;
	}
	
	public static void appender(List<String> list1, List<String> list2) {
		for (String item: list1) {
			list2.add(item);
		}
	}
	
	public static void looper(List<String> list) {
		String str = "";
		for (String item: list) {
			str += item + "\r\n";
		}
	}
	
	public static String[] converter(List<String> list) {
		return list.toArray(new String[3]);
	}
}
