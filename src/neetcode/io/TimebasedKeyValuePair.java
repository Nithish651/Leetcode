package neetcode.io;

public class TimebasedKeyValuePair {

	public static void main(String[] args) {
		TimeMap map = new TimeMap();
		map.set("foo", "bar", 1);
		map.set("foo", "bar1", 4);
		System.out.println(map.get("foo", 5));
		
	}
}
