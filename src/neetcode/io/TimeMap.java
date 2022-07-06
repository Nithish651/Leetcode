package neetcode.io;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;



public class TimeMap {


	Map<String, List<Data>> map;

	public TimeMap() {
		map = new HashMap<>();
	}

	public void set(String key, String value, int timestamp) {
		if (!map.containsKey(key))
			map.put(key, new ArrayList<>());

		map.get(key).add(new Data(timestamp, value));
	}

	// binary search the list
	// return if found
	// else send the latest data;

	public String get(String key, int timestamp) {
		List<Data> list = map.get(key);
        int low = 0, high = list.size() - 1;
        while (low < high) {
            int mid = (low + high) >> 1;
            if (list.get(mid).timestamp == timestamp) return list.get(mid).data;
            if (list.get(mid).timestamp < timestamp) {
                if (list.get(mid+1).timestamp > timestamp) return list.get(mid).data;
                low = mid + 1;
            }
            else high = mid -1;
        }
        return list.get(low).timestamp <= timestamp ? list.get(low).data : "";
    }

}
