 import java.awt.*;

public class guiproject extends Frame {
	guiproject (){
		setTitle ("Gui Project");
		setSize (400,400);
		show();
	}
	public static void main(String args []){
		Frame objFrame;
		Frame objButton1;
		TextField objTextField1;
		Label objLabel1;
		Label objLabel2;
		Button objButton2;
		TextField objTextField2;
		TextField objTextField3;
		TextField objTextField4;
		TextField objTextField5;
		TextField objTextField6;
			objFrame = new UserSample();
			objButton1 = new Button("Okay"); //buttons
			objButton2 = new Button("Cancel"); //buttons
			objTextField1 = new Textfield("",0);
			objTextField2 = new Textfield("",0);
			objTextField3 = new Textfield("",0);
			objTextField4 = new Textfield("",0);
			objTextField5 = new Textfield("",0);
			objTextField6 = new Textfield("",0);
			objLabel1 = new Label();
			objLabel2 = new Label();
			objLabel1.setText ("Enter Text here.");
			objLabel2.setText ("..and here.");
			objLabel1.setBounds(40,50,80,50);
			objLabel2.setBounds(40,50,80,50);
			objTextField1.setBounds(90,75,150,20);
			objTextField2.setBounds(90,115,150,20);
			objButton1.setBounds(40,150,80,90);
			objButton2.setBounds(130,155,80,83);

		objFrame.add(objLabel1);
		objFrame.add(objLabel2);
		objFrame.add(objTextField1);
		objFrame.add(objTextField2);
		objFrame.add(objButton1);
		objFrame.add(objButton2);
	}
}
