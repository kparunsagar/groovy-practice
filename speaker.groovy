public class speaker implements USBInterface{

	@Override
	public void plugin() {
			println("speaker has is plugged in.");
	}

	@Override
	public void plugout() {
		println("speaker has is plugged out.");
		
	}

	

}