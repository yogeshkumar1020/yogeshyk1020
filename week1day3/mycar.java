package week1day3;

public class mycar {

	public void driveCar() {
		System.out.println("Drive Car");
	}
    public  void applyBreak() {
	System.out.println("Apply Break");
}
    public  void switchOnAc() {
    	System.out.println("Switch on Airconditioner");
    }
    public static void main(String[] args) {
    	
    	myCar mycar =new myCar();
		mycar.driveCar();
		mycar.applyBreak();
		mycar.switchOnAc();
    }
}		

