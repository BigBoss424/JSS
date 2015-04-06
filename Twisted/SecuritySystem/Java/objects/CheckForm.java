/**
 * Created by: Aaron Jones
 * Date: 4/3/2015
 * Last Modified: 4/5/2015
 * Description: This class will serve the purpose of creating an object called CheckForm. This object
 * will simply hold all the questions that will be asked into their own individual strings. Each method
 * created will be required to have data strictly from the customer object. 
 * 
 * 
 * Bugs:
 *
 *
 * 
 * Fixes: 
 * 
 * 
 * 
 * Thoughts:
 * 
 */

/**
 * @author bigboss424
 *
 */
public class CheckForm {
	
	//Declaring global objects
	private Customer newCustomer = new Customer();
	
	//Declaring global variables
	
	//Declaring each question in a String
	private String qDate = "Date: ";
	private String qTimeIn = "Time In: ";
	private String qTimeOut = "Time Out: ";
	private String qWhatRoom = "What room did you use?"
	private String qTanningDown = "Was the tanning bed lid down?: ";
	private String qReturnDown = "Did you return it to the down position?: ";
	private String qSetsOfGoggles = "How many sets of goggles were in the room?: ";
	private String qRestroomLock = "If you used the restroom was the door locked?: ";
	private String qRelockRestroom = "Did you relock the door afer using the restroom?: ";
	private String qCleanUpYourself = "Did you remember to clean up after yourself?: ";
	private String qDidGuest = "Did you bring a guest?: ";
	private String qGuestName = "What was his/her name?: ";
	private String qGuestTan = "Did your guest tan?: ";
	
	public CheckForm(Customer newCustomer, String qDate, String qTimeIn,
			String qTimeOut, String qWhatRoom, String qTanningDown, String qReturnDown,
			String qSetsOfGoggles, String qRestroomLock,
			String qRelockRestroom, String qCleanUpYourself, String qDidGuest,
			String qGuestName, String qGuestTan) {
		super();
		this.newCustomer = newCustomer;
		this.qDate = qDate;
		this.qTimeIn = qTimeIn;
		this.qTimeOut = qTimeOut;
		this.qWhatRoom = qWhatRoom;
		this.qTanningDown = qTanningDown;
		this.qReturnDown = qReturnDown;
		this.qSetsOfGoggles = qSetsOfGoggles;
		this.qRestroomLock = qRestroomLock;
		this.qRelockRestroom = qRelockRestroom;
		this.qCleanUpYourself = qCleanUpYourself;
		this.qDidGuest = qDidGuest;
		this.qGuestName = qGuestName;
		this.qGuestTan = qGuestTan;
	}

	public Customer getNewCustomer() {
		return newCustomer;
	}

	public void setNewCustomer(Customer newCustomer) {
		this.newCustomer = newCustomer;
	}

	public String getqDate() {
		return qDate;
	}

	public void setqDate(String qDate) {
		this.qDate = qDate;
	}

	public String getqTimeIn() {
		return qTimeIn;
	}

	public void setqTimeIn(String qTimeIn) {
		this.qTimeIn = qTimeIn;
	}

	public String getqTimeOut() {
		return qTimeOut;
	}

	public void setqTimeOut(String qTimeOut) {
		this.qTimeOut = qTimeOut;
	}

	public String getqWhatRoom()
	{
		return qWhatRoom;
	}
	
	public void setqWhatRoom(String qWhatRoom)
	{
		this.qWhatRoom = qWhatRoom
	}
	
	public String getqTanningDown() {
		return qTanningDown;
	}

	public void setqTanningDown(String qTanningDown) {
		this.qTanningDown = qTanningDown;
	}

	public String getqReturnDown() {
		return qReturnDown;
	}

	public void setqReturnDown(String qReturnDown) {
		this.qReturnDown = qReturnDown;
	}

	public String getqSetsOfGoggles() {
		return qSetsOfGoggles;
	}

	public void setqSetsOfGoggles(String qSetsOfGoggles) {
		this.qSetsOfGoggles = qSetsOfGoggles;
	}

	public String getqRestroomLock() {
		return qRestroomLock;
	}

	public void setqRestroomLock(String qRestroomLock) {
		this.qRestroomLock = qRestroomLock;
	}

	public String getqRelockRestroom() {
		return qRelockRestroom;
	}

	public void setqRelockRestroom(String qRelockRestroom) {
		this.qRelockRestroom = qRelockRestroom;
	}

	public String getqCleanUpYourself() {
		return qCleanUpYourself;
	}

	public void setqCleanUpYourself(String qCleanUpYourself) {
		this.qCleanUpYourself = qCleanUpYourself;
	}

	public String getqDidGuest() {
		return qDidGuest;
	}

	public void setqDidGuest(String qDidGuest) {
		this.qDidGuest = qDidGuest;
	}

	public String getqGuestName() {
		return qGuestName;
	}

	public void setqGuestName(String qGuestName) {
		this.qGuestName = qGuestName;
	}

	public String getqGuestTan() {
		return qGuestTan;
	}

	public void setqGuestTan(String qGuestTan) {
		this.qGuestTan = qGuestTan;
	}

	@Override
	public String toString() {
		return "CheckForm [newCustomer=" + newCustomer + ", qDate=" + qDate
				+ ", qTimeIn=" + qTimeIn + ", qTimeOut=" + qTimeOut
				+  " qWhatRoom=" + ", qTanningDown=" + qTanningDown + ", qReturnDown="
				+ qReturnDown + ", qSetsOfGoggles=" + qSetsOfGoggles
				+ ", qRestroomLock=" + qRestroomLock + ", qRelockRestroom="
				+ qRelockRestroom + ", qCleanUpYourself=" + qCleanUpYourself
				+ ", qDidGuest=" + qDidGuest + ", qGuestName=" + qGuestName
				+ ", qGuestTan=" + qGuestTan + "]";
	}
	
	
	
	
	
	
}
