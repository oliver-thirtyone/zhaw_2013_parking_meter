package controller;

import view.ParkingMeterView;
import model.ParkingMeter;

public class ParkingMeterController {

	private final UserInputController userInputController;
	private final TexturesourcesController texturesourcesController;
	private final SecretActionController secretActionController;
	private final InformationController informationController;
	private final PaymentController paymentController;
	private final TestController testController;
	
	private final ParkingMeter parkingMeter;
	private final ParkingMeterView parkingMeterView;

	public ParkingMeterController(UserInputController userInputController,
			TexturesourcesController texturesourcesController,
			SecretActionController secretActionController,
			InformationController informationController,
			PaymentController paymentController,
			TestController testController,
			ParkingMeter parkingMeter,
			ParkingMeterView parkingMeterView) {

		this.userInputController = userInputController;
		this.texturesourcesController = texturesourcesController;
		this.secretActionController = secretActionController;
		this.informationController = informationController;
		this.paymentController = paymentController;
		this.testController = testController;
		
		this.parkingMeter = parkingMeter;
		this.parkingMeterView = parkingMeterView;
	}

}
