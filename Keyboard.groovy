public class Keyboard implements USBInterface{

	@Override
	public void plugin() {
			println("Keyboard has is plugged in.");
	}

	@Override
	public void plugout() {
		println("Keyboard has is plugged out.");
		
	}

}
