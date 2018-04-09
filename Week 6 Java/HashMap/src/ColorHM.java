import java.util.HashMap;

public class ColorHM {
	public static HashMap<Integer, String> createMap(){
		HashMap<Integer, String> colors = new HashMap<Integer, String>();
		String[] strs = {"Yellow", "Orange", "Cyan", "Gold", "Lime"};
		for (int i = 1; i <= 5; i++) {
			colors.put(i, strs[i - 1]);
		}
		strs = null;
		return colors;
	}
	
	public static String[] showMapContents(HashMap<Integer, String> map){
		String strKeys = "";
		for (Integer key: map.keySet()) {
			strKeys += key + "\r\n";
		}
		String strValues = "";
		for (String value: map.values()) {
			strValues += value + "\r\n";
		}
		String[] arr = {strKeys, strValues};
		return arr;
	}
	
	public static void loopOverHashMap(HashMap<Integer, String> map) {
		for (int i = 1; i <= map.size(); i++) {
			System.out.println(i + " = " + map.get(i));
		}
		
		System.out.println();
		
		for (Integer key: map.keySet()) {
			System.out.println(key + " = " + map.get(key));
		}
		
		System.out.println();
		
		map.forEach((keys, values) ->{
			System.out.println(keys + " = " + values);
		});
		System.out.println();
	}
}
