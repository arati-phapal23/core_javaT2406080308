package session_01;

import java.sql.Date;

public class MyDate {
	private int dd,mm,yy;
	
	public void initDate ()
	{
		dd=mm=yy=1;
		
	}
	public void setDate (int d, int m, int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public void displayDate()
	{
System.out.println
("Date = ["+dd+"/"+mm+"/"+yy+"]");
			
	}
	public static void main (String []args){
		
		MyDate d = new MyDate();
		System.out.println (d.dd);
		d.initDate();
		d.displayDate ();
		d.setDate(6, 2, 2024);
		d.displayDate();
	}

}
