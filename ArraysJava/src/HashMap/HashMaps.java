package HashMap;

public class HashMaps {
	public static final int SIZE = 16;
	private static Entry table[] = new Entry[16];
	public static void main(String[] args) {
		HashMaps myHashMap = new HashMaps();

        myHashMap.put("Awadh", 3);
        myHashMap.put("Rahul", 2);
        myHashMap.put("Sattu", 1);
        myHashMap.put("Gaurav", 10);

        Entry e = myHashMap.get("Awadh");
        System.out.println(""+e.getValue());
	}
	
	public static int hashKey(String key) {
		int hashValue = 0;
		for(int i = 0; i<key.length(); i++) {
			hashValue = (hashValue + (int)key.charAt(i) * i) % SIZE;
		}
		return hashValue;
	}
	
	public static Entry get(String key) {
		int address = hashKey(key);
		Entry e = table[address];
		System.out.println("Getting value " + key);
		
		while(e != null) {
			if(e.key.equals(key)) {
				return e;
			}
			e = e.next;
		}
		return null;
	}
	
	public static void put(String key, int value) {
		int address = hashKey(key);
		Entry e = table[address];
		System.out.println("Adding value " + key);
		
		if(e!=null) {
			if(e.key.equals(key)) {
				e.value = value;
			} else {
				while(e!=null) {
					e = e.next;
				}
				Entry inOldBucket = new Entry(key, value);
				e.next = inOldBucket;
			}
		} else {
			Entry inNewBucket = new Entry(key, value);
			table[address] = inNewBucket;
		}
	}
}
