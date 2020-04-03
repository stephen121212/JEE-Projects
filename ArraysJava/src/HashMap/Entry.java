package HashMap;
public class Entry {
	String key;
	int value;
	Entry next;
	
	public Entry(String key, int value) {
		this.key = key;
		this.value = value;
	}
	
	public String getKey() {
		return this.key;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}
