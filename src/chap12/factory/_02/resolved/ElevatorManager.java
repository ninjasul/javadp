package chap12.factory._02.resolved;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
	// 엘리베이터는 여러 대 있으므로 리스트로 관리
	private List<ElevatorController> controllers;
	private SchedulingStrategyID strategyID;
	
	// 주어진 개수만큼 엘리베이터를 생성
	public ElevatorManager( int controllerCount, SchedulingStrategyID strategyID ) {
		controllers = new ArrayList<ElevatorController>(controllerCount);
		
		for( int i = 0; i <controllerCount; ++i ) {
			ElevatorController controller = new ElevatorController(i);
			controllers.add(controller);
		}
		
		// 객체 생성시 스케줄링 전략을 설정.
		this.strategyID = strategyID;				
	}
	
	void requestElevator(int destination, Direction direction) {
		
		// 스케줄러를 통해 동작시킬 엘리베이터를 선택
		ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategyID);
		System.out.println(scheduler);
		
		int selectedElevator = scheduler.selectElevator(this,  destination,  direction );
		controllers.get(selectedElevator).gotoFloor(destination);
	}
}
