package Railway;

import java.util.ArrayList;
import java.util.List;

public class Railway_reservation {
 
	String name;
	 int ac=60;
	 int non_ac=60;
	 int seaters=60;
	List<Railway_reservation> status = new ArrayList<>();
	List<Railway_reservation> cancle_list = new ArrayList<>();
	
	
	
	public Railway_reservation() {
		super();
	}



	public Railway_reservation(String name, int ac, int non_ac, int seaters) {
		super();
		this.name = name;
		this.ac = ac;
		this.non_ac = non_ac;
		this.seaters = seaters;
	}



	@Override
	public String toString() {
		return "Railway_reservation [name=" + name + ", ac=" + ac + ", non_ac=" + non_ac + ", seaters=" + seaters
				+ "]";
	}


	
	
	
}
