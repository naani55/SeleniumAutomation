package infoCommands;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DaysGap {

	public static void main(String[] args) throws Exception {

		String firstDate = "19/08/2020 09:30";
		String secondDate = "28/08/2020 09:30";

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		Date d1 = sdf.parse(firstDate);
		Date d2 = sdf.parse(secondDate);

		long duration = d2.getTime() - d1.getTime();

		long diffInDays = TimeUnit.MILLISECONDS.toDays(duration);

		System.out.println(diffInDays);

	}

}
