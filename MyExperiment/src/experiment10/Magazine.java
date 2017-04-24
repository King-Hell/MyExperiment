package experiment10;

public class Magazine {
	private String title;

	public Magazine(String title) {
		this.title = title;
	}

	public String toString() {
		return title;
	}

	public int compareTo(Magazine other) {
		return title.compareTo(other.title);
	}
}
