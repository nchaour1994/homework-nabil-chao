package homework2.abstraction;

public class UpdatePlugin implements Plugin,Data  {

	@Override
	public void startPlugin(String name) {
		System.out.println("start the plugin "+name);
		
	}

	@Override
	public void executePlugin() {
		System.out.println("execute the  plugin ");
		
	}

	@Override
	public void stopPlugin() {
		System.out.println("stop  the  plugin ");
		
		
	}

	@Override
	public void printData(String name2) {
		System.out.println("print "+name2);
		
	}

	@Override
	public int getData(int i) {
		
		return i;
	}

}
