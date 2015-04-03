/* Created by: Aaron Jones
*  Date: 4/1/2015
*  Description: This class is simply to be created for the purpose of creatin*g a new object called Customer. I will be working on creating the details fo*r the following class as I go along. There will be comments.
*/

public class Customer
{
	private int date; //Figure out if there is a way to get the date from			       //A function with the Java API
	private int timeIn,
		    timeOut;
	private char roomUsed,
		     tanningDown,
		     returnDown,
		     restroomLock,
		     relockRestroom,
		     cleanUpYourself,
		     didGuest,
		     didGuestTan;
	private String guestName;
	private int setsOfGoogles;

	public Customer() //Declare DVC
	{
		this.date = 01012015;
		this.timeIn = 320;
		this.timeOut = 420;
		this.roomUsed = 'V';
		this.tanningDown = 'V';
		this.returnDown = 'V';
		this.restroomLock = 'V';
		this.relockRestroom = 'V';
		this.cleanUpYourself = 'V';
		this.didGuest = 'V';
		this.didGuestTan = 'V';
		this.guestName = "John Doe";
		this.setsOfGoogles = 2;
	}
	
	public Customer(int date, int timeIn, int timeOut, char roomUsed,
			char tanningDown, char returnDown, char restroomLock,			     char relockRestroom, char cleanUpYourself,
			char didGuest, char didGuestTan, String guestName, 
			int setsOfGoogles) //Declaring EVC
	{	
		this.date = date;
		this.timeIn = timeIn;
		this.timeOut = timeOut;
		this.roomUsed = roomUsed;
		this.tanningDown = tanningDown;
		this.returnDown = returnDown;
		this.relockRestroom = relockRestroom;
		this.cleanUpYourself = cleanUpYourself;
		this.didGuest = didGuest;
		this.didGuestTan = didGuestTan;
		this.guestName = guestName;
		this.setsOfGoogles = setsOfGoogles;
	} 

	//Declaring getters and setters

	public int getDate(int Date)
	{ return Date; }
	public void setDate(int Date)
	{ this.date = Date; }
	public int timeIn(int timeIn)
	{ return timeIn; }
	public void timeIn(int timeIn)
	{ this.timeIn = tineIn; }
	public int timeOut(int timeOut)
	{ return timeOut; }
	public void timeOut(int timeOut)
	{ this.timeOut = timeOut; }
	public char getRoomUsed(char RoomUsed)
	{ return RoomUsed; }
	public void setRoomUsed(char RoomUsed)
	{ this.roomUsed = RoomUsed; }
	public char getTanningDown(char TanningDown)
	{ return TanningDown; }
	public void setTanningDown(char TanningDown)
	{ this.tanningDown = TanningDown; }
	public char getReturnDown(char ReturnDown)
	{ return ReturnDown; }
	public void setReturnDown(char ReturnDown)
	{ this.returnDown = ReturnDown; }
	public char getRestroomLock(char RestroomLock)
	{ return RestroomLock; }
	public void setRestroomLock(char RestroomLock)
	{ this.restroomLock = RestroomLock; }
	public char getRelockRestroom(char RelockRestroom)
	{ return RelockRestroom; }
	public void setRelockRestroom(char RelockRestroom)
	{ this.relockRestroom = RelockRestroom; }
	public char getCleanUpYourself(char CleanUpYourself)
	{ return CleanUpYourself; }
	public void setCleanUpYourself(char CleanUpYourself)
	{ this.CleanUpYourself; }
	public char getDidGuest(char DidGuest)
	{ return DidGuest; }
	public void setDidGuest(char DidGuest)
	{ this.didGuest = Guest; }
	public char getDidGuestTan(char DidGuestTan)
	{ return DidGuestTan; }
	public void setDidGuestTan(char DidGuestTan)
	{ this.didGuestTan = DidGuestTan;}
	public String getGuestName(String GuestName)
	{ return GuestName; }
	public void setGuestName(String GuestName)
	{ this.guestName = GuestName; }
	public int getSetsOfGoogles(int SetsOfGoogles)
	{ return SetsOfGoogles; }
	public void setSetOfGoogles(int SetsOfGoogles)
	{ this.setsOfGoogles = SetsOfGoogles; }

	//Declare toString Method
}//end class 
