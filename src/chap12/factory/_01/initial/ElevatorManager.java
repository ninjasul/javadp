package chap12.factory._01.initial;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
	// ���������ʹ� ���� �� �����Ƿ� ����Ʈ�� ����
	private List<ElevatorController> controllers;
	private ThroughputScheduler scheduler;
	
	// �־��� ������ŭ ���������͸� ����
	public ElevatorManager( int controllerCount ) {
		controllers = new ArrayList<ElevatorController>(controllerCount);
		
		for( int i = 0; i <controllerCount; ++i ) {
			ElevatorController controller = new ElevatorController(i);
			controllers.add(controller);
		}
		
		scheduler = new ThroughputScheduler();		
	}
	
	void requestElevator(int destination, Direction direction) {
		
		// �����ٷ��� ���� ���۽�ų ���������͸� ����
		int selectedElevator = scheduler.selectElevator(this, destination, direction);
		
		// ���õ� ���������͸� �̵���Ŵ
		controllers.get(selectedElevator).gotoFloor(destination);
	}
}
