package homework2.abstraction;

public class Testplugin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Plugin p=new UpdatePlugin();
     Plugin p1=new UpdatePlugin2();
     
     p.executePlugin();
     p1.executePlugin();
     System.out.println("----------------------------");
     
     UpdatePlugin plug= new UpdatePlugin();
     plug.printData("plugin");
     System.out.println(plug.getData(12));
     plug.startPlugin("audio");
     plug.executePlugin();
     plug.stopPlugin();
     System.out.println("----------------------------");
     UpdatePlugin2 plug1= new UpdatePlugin2();
     plug1.startPlugin("jdbc");
     plug1.executePlugin();
     plug1.stopPlugin();
     System.out.println("----------------------------");
     Plugin3update plug3=new Plugin3update();
     plug3.restart();
     plug3.printData("gui");
      System.out.println(plug3.getData(5));
     plug3.startPlugin("gui");
     plug3.executePlugin();
     plug3.stopPlugin();
     
	}

}
