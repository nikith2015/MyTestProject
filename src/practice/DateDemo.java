package practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		sd.format(d);
		sdf.format(d);
				System.out.println(d.toString());
				System.out.println(sdf.format(d));
				System.out.println(sd.format(d));
		
		
		
	}

}
