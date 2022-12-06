public class Mouse implements USBInterface{

	@Override
	public void plugin() {
			println("Mouse has is plugged in.");
	}

	@Override
	public void plugout() {
		println("Mouse has is plugged out.");
		
	}

	

}
