//×Ô¶¨ÒåArrayList
package experiment8;

public class ArrayList {
	private String[] array;

	public ArrayList() {
		array = new String[0];
	}

	public void add(String text) {
		String[] temp = new String[array.length + 1];
		int i = 0;
		for (String x : array) {
			temp[i] = x;
			i++;
		}
		temp[array.length] = text;
		array = temp;
	}

	public void insert(int index, String text) {
		String[] temp = new String[array.length + 1];
		for (int i = 0; i < index; i++) {
			temp[i] = array[i];
		}
		temp[index] = text;
		for (int i = index + 1; i < temp.length; i++) {
			temp[i] = array[i - 1];
		}
		array = temp;
	}

	public void delete(int index) {
		String[] temp = new String[array.length - 1];
		for (int i = 0; i < index; i++) {
			temp[i] = array[i];
		}
		for (int i = index; i < temp.length; i++) {
			temp[i] = array[i + 1];
		}
		array = temp;
	}

	public int find(String text) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == text) {
				return i;
			}
		}
		return -1;
	}

	public String toString() {
		String str = "";
		for (String x : array) {
			str += x + "  ";
		}
		return str;
	}
}
