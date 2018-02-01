package chap12.factory._01.initial;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
	// 엘리베이터는 여러 대 있으므로 리스트로 관리
	private List<ElevatorController> controllers;
	private ThroughputScheduler scheduler;
	
	// 주어진 개수만큼 엘리베이터를 생성
	public ElevatorManager( int controllerCount ) {
		controllers = new ArrayList<ElevatorController>(controllerCount);
		
		for( int i = 0; i <controllerCount; ++i ) {
			ElevatorController controller = new ElevatorController(i);
			controllers.add(controller);
		}
		
		scheduler = new ThroughputScheduler();		
	}
	
	void requestElevator(int destination, Direction direction) {
		
		// 스케줄러를 통해 동작시킬 엘리베이터를 선택
		int selectedElevator = scheduler.selectElevator(this, destination, direction);
		
		// 선택된 엘리베이터를 이동시킴
		controllers.get(selectedElevator).gotoFloor(destination);
	}
}
