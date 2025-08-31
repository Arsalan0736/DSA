import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;
class LRUCache{
    private static int capacity;
    private static Map<Integer,Integer> cacheMap;
    private static LinkedList<Integer> lruList;
    LRUCache(int cap){
        this.capacity=cap;
        this.cacheMap=new HashMap<>();
        this.lruList=new LinkedList<>();
    }
    public static int get(int key){
        if(!cacheMap.containsKey(key)) return -1;
        lruList.remove(Integer.valueOf(key));
        lruList.addFirst(key);
        return cacheMap.get(key);
    }
    public static void put(int key,int value){
        if(cacheMap.containsKey(key)){
            cacheMap.put(key,value);
            lruList.remove(Integer.valueOf(key));
        }
        else{
            if(cacheMap.size()>=capacity){
                int leastUsedKey=lruList.removeLast();
                cacheMap.remove(leastUsedKey);
            }
            cacheMap.put(key,value);
        }
        lruList.addFirst(key);
    }
    public static void main(String[] args){
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1)); // returns 1
        cache.put(3, 3); // evicts key 2
        System.out.println(cache.get(2)); // returns -1 (not found)
        cache.put(4, 4); // evicts key 1
        System.out.println(cache.get(1)); // returns -1 (not found)
        System.out.println(cache.get(3)); // returns 3
        System.out.println(cache.get(4)); // returns 4
    }
}