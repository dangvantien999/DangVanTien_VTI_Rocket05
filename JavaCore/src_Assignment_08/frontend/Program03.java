package frontend;

import backend.Exe03_Question2_Question4;
import entity.MyMap;

public class Program03 {

	public static void main(String[] args) {
		Exe03_Question2_Question4 exe03_Q2 = new Exe03_Question2_Question4();
		exe03_Q2.question2();
		exe03_Q2.question4();
		
		
		MyMap<Integer, String> mymap = new MyMap<Integer, String>();
		mymap.put(1, "Đặng Văn Tiến");
		
		System.out.println(mymap.getValue(1));
	}

}
