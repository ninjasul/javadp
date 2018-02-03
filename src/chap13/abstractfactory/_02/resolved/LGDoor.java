package chap13.abstractfactory._02.resolved;

public class LGDoor extends Door {

	@Override
	protected void doClose() {
		// TODO Auto-generated method stub
		System.out.println("close LG Door");
	}

	@Override
	protected void doOpen() {
		// TODO Auto-generated method stub
		System.out.println("open LG Door");
	}

}
