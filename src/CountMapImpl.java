import java.util.HashMap;
import java.util.Map;

/**
 * Created by alexander on 02.08.16.
 */
public class CountMapImpl<T> implements CountMap<T> {

    private final Map<T, Integer> map = new HashMap<>();
    @Override
    public void add(T t) {
        if (!(map.containsKey(t))) {
            map.put(t, 1);
        }
        else {
            map.put(t, map.get(t) + 1);
        }
    }

    @Override
    public int getCount(T t) {
        Integer i = map.get(t);
        return i == null ? -1 : i;
    }

    @Override
    public int remove(T t) {
        Integer i = map.remove(t);
        return i == null ? -1 : i;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void addAll(CountMap<T> source) {
        Map<T, Integer> map = source.toMap();
        for (Map.Entry<? extends T, Integer> entry : map.entrySet()) {
            T key = entry.getKey();
            if (!map.containsKey(key)) {
                map.put(key, entry.getValue());
            } else {
                map.put(key, entry.getValue() + map.get(key));
            }
        }
    }

    @Override
    public Map<T, Integer> toMap() {
        return map;
    }

    @Override
    public void toMap(Map<? super T, Integer> destination) {
        destination.putAll(map);
    }
}
