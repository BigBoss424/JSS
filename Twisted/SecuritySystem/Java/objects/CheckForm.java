/**
 * Created by: Aaron Jones
 * Date: 4/3/2015
 * Last Modified: 4/3/2015
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
	private String qTanningDown = "Time Out: ";
	private String qReturnDown = "Time Out: ";
	private String qSetsOfGoggles = "Time Out: ";
	private String qRestroomLock = "Time Out: ";
	private String qRelockRestroom = "Time Out: ";
	private String qCleanUpYourself = "Time Out: ";
	private String qDidGuest = "Time Out: ";
	private String qGuestName = "Time Out: ";
	private String qGuestTan = "Guest Tan: ";
	
	public CheckForm(Customer newCustomer, String qDate, String qTimeIn,
			String qTimeOut, String qTanningDown, String qReturnDown,
			String qSetsOfGoggles, String qRestroomLock,
			String qRelockRestroom, String qCleanUpYourself, String qDidGuest,
			String qGuestName, String qGuestTan) {
		super();
		this.newCustomer = newCustomer;
		this.qDate = qDate;
		this.qTimeIn = qTimeIn;
		this.qTimeOut = qTimeOut;
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
				+ ", qTanningDown=" + qTanningDown + ", qReturnDown="
				+ qReturnDown + ", qSetsOfGoggles=" + qSetsOfGoggles
				+ ", qRestroomLock=" + qRestroomLock + ", qRelockRestroom="
				+ qRelockRestroom + ", qCleanUpYourself=" + qCleanUpYourself
				+ ", qDidGuest=" + qDidGuest + ", qGuestName=" + qGuestName
				+ ", qGuestTan=" + qGuestTan + "]";
	}
	
	
	
	
	
	
}
