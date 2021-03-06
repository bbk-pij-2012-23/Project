public class SmartPhone extends MobilePhone {
/*create a class SmartPhone that extends MobilePhone and adds methods for browseWeb(String) and
findPosition(), the latter returning a (fictitious) GPS-found position.
*/
	public SmartPhone(String mySPNumber){
		super(mySPNumber);
	}

	public void browseWeb(String address) {
		
		System.out.println("Going to..." + address);
	}
	
	public String findPosition(){
		String position = "57 deg 38' 56.83 N, 10 deg 24' 26.79 E";
		return position;
	}
	
	@Override
	public void call(String numberToCall) { //hint says use super but I didn't. how could it be done using that?
		System.out.println(numberToCall.substring(0,2));
		if (numberToCall.substring(0,2).equals("00")){
			System.out.println("Calling " + numberToCall + " through the internet to save money");
		}
		else {
			System.out.println("Calling..." + numberToCall);
		}
	}
	
}