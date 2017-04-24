package experiment10;

public class MagazineList {
	private MagazineNode list;

	public MagazineList() {
		list = null;
	}

	public void sort() {
		if (list == null || list.next == null) {
			return;
		}

		/*
		 * MagazineNode p = list; MagazineNode p_pre = null; while (p.next !=
		 * null) { MagazineNode temp = p.next; MagazineNode temp_pre = p;
		 * MagazineNode min_pre = p_pre; MagazineNode min = p;
		 * 
		 * while (temp != null) { if (temp.magazine.compareTo(min.magazine) < 0)
		 * { min_pre = temp_pre; min = temp;
		 * 
		 * }
		 * 
		 * temp_pre = temp; temp = temp.next; } if (p_pre == null) { list = min;
		 * p_pre = min; } else { p_pre.next = min; }
		 * 
		 * min_pre.next = min.next;
		 * 
		 * p = min.next; }
		 */

		MagazineNode p = list.next;
		MagazineNode pnext = null;
		list.next = null;
		MagazineNode temp = list;
		MagazineNode temp_pre = null;
		while (p != null) {
			pnext = p.next;
			temp = list;
			temp_pre = null;
			while (temp != null) {
				if (temp.magazine.compareTo(p.magazine) > 0)
					break;
				temp_pre = temp;
				temp = temp.next;
			}
			if (temp_pre == null) {
				list = p;
				
				p.next = temp;
			} else {
				temp_pre.next = p;
				p.next = temp;
			}

			p = pnext;
		}

	}

	public void mergeSort(MagazineList another) {
		if (this.isSort() && another.isSort()) {
			if (list == null) {
				list = another.list;
				return;
			} else if (another.list == null) {
				return;
			} else {
				MagazineNode p = list;
				while (p.next != null) {
					p = p.next;
				}
				p.next = another.list;
				this.sort();

			}
		}
	}

	public boolean isSort() {
		MagazineNode p = list;
		while (p.next != null) {
			if (p.magazine.compareTo(p.next.magazine) > 0)
				return false;
			p = p.next;
		}
		return true;
	}

	public void add(Magazine mag) {
		MagazineNode node = new MagazineNode(mag);
		MagazineNode current;
		if (list == null)
			list = node;
		else {
			current = list;
			while (current.next != null)
				current = current.next;
			current.next = node;
		}

	}

	public String toString() {
		String result = "";
		MagazineNode current = list;
		while (current != null) {
			result += current.magazine + "\n";
			current = current.next;
		}
		return result;
	}

	private class MagazineNode {
		public Magazine magazine;
		public MagazineNode next;

		public MagazineNode(Magazine mag) {
			magazine = mag;
			next = null;
		}
	}

}
