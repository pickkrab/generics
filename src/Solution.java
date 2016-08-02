
/**
 * Created by alexander on 01.08.16.
 */
public class Solution {

    public static void main(String[] args) {
        CountMapImpl<Integer> map = new CountMapImpl<>();
        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);

        System.out.println(map.getCount(5));
        System.out.println(map.getCount(6));
        System.out.println(map.getCount(10));
        System.out.println(map.size());
        System.out.println(map.toMap());

    }
}
