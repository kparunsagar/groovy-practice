public class Printer implements USBInterface{

	@Override
	public void plugin() {
			println("Printer has is plugged in.");
	}

	@Override
	public void plugout() {
		println("Printer has is plugged out.");
		
	}

	

}

