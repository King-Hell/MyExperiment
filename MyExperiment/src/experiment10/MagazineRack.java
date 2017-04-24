package experiment10;

public class MagazineRack {
	public static void main(String args[]) {
		MagazineList rack = new MagazineList();
		rack.add(new Magazine("Time"));
		rack.add(new Magazine("Woodworking Today"));
		rack.add(new Magazine("Communications of the ACM"));
		rack.add(new Magazine("House and Garden"));
		rack.add(new Magazine("GQ"));

		System.out.println(rack);
		rack.sort();
		System.out.println(rack);

		MagazineList rack2 = new MagazineList();
		rack2.add(new Magazine("The little prince"));
		rack2.add(new Magazine("Flipped"));
		rack2.add(new Magazine("Harry Potter"));
		rack2.add(new Magazine("Game of Thrones"));
		rack2.add(new Magazine("Pride and Prejudice"));
		rack2.add(new Magazine("Endless Night"));

		System.out.println(rack2);
		rack2.sort();
		System.out.println(rack2);

		rack.mergeSort(rack2);
		System.out.println(rack);
	}
}
