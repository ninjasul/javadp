package chap12.factory._02.resolved;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
	// ���������ʹ� ���� �� �����Ƿ� ����Ʈ�� ����
	private List<ElevatorController> controllers;
	private SchedulingStrategyID strategyID;
	
	// �־��� ������ŭ ���������͸� ����
	public ElevatorManager( int controllerCount, SchedulingStrategyID strategyID ) {
		controllers = new ArrayList<ElevatorController>(controllerCount);
		
		for( int i = 0; i <controllerCount; ++i ) {
			ElevatorController controller = new ElevatorController(i);
			controllers.add(controller);
		}
		
		// ��ü ������ �����ٸ� ������ ����.
		this.strategyID = strategyID;				
	}
	
	void requestElevator(int destination, Direction direction) {
		
		// �����ٷ��� ���� ���۽�ų ���������͸� ����
		ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategyID);
		System.out.println(scheduler);
		
		int selectedElevator = scheduler.selectElevator(this,  destination,  direction );
		controllers.get(selectedElevator).gotoFloor(destination);
	}
}
