package homework2.abstraction;

public class Plugin3update extends Plugin3 implements Plugin,Data {

	@Override
	public void restart() {
		System.out.println("restart");
		
	}

	@Override
	public void printData(String name) {
		System.out.println("print "+name);
		
	}

	@Override
	public int getData(int i) {
		// TODO Auto-generated method stub
		return i*2;
	}

	@Override
	public void startPlugin(String name) {
		System.out.println("start plugin 3 ");
		
	}

	@Override
	public void executePlugin() {
		System.out.println("execute plugin 3 ");
		
	}

	@Override
	public void stopPlugin() {
		System.out.println("stop plugin 3 ");
		
	}

}
