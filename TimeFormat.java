// Represents the hh:mm time format using an AM/PM format. 

import javax.print.DocFlavor.STRING;

public class TimeFormat {
	public static void main(String[] args) {
		String name1 = args[0];
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        String amOrPm = " AM";
		if (hours >= 12){
			amOrPm = " PM";
			}
		if (hours > 12) {
           hours = hours - 12;
		}
        if (hours<10) {
            hours = hours % 10;
        }
		if (minutes<10) {
		System.out.println(hours + ":0" + minutes + amOrPm);
        } else {
		System.out.println(hours + ":" + minutes + amOrPm);}
	}
}