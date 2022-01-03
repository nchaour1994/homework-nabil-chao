package homework2.abstraction;

public class UpdatePlugin2 implements Plugin  {

	@Override
	public void startPlugin(String name) {
		System.out.println("start the  plugin2 ");
		
	}

	@Override
	public void executePlugin() {
		System.out.println("execute the  plugin2 ");
		
	}

	@Override
	public void stopPlugin() {
		System.out.println("stop the  plugin2 ");
		
	}

}
