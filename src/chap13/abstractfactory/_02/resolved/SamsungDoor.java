package chap13.abstractfactory._02.resolved;

public class SamsungDoor extends Door {

	@Override
	protected void doClose() {
		// TODO Auto-generated method stub
		System.out.println("close Samsung Door");
	}

	@Override
	protected void doOpen() {
		// TODO Auto-generated method stub
		System.out.println("open Samsung Door");
	}

}
