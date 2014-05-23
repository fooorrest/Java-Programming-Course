public void frame extends JFrame{ 
private JTextField f1,f2,f3,f4,f5; 
private JButton ok,cancel; 
//you might add more data members in here 
public frame()
{ 
	setVisible(true); 
	setDefaultCloseOperation(EXIT_ON_CLOSE... ; 
///there are some other commands you should put for the frame,i don't know GUI by heart 
//Then you should create a panel to put the Text fields and buttons in,i assume you know how 
	f1=new JTextField(10)//10 is the size you might change it to suit your inputs 
//do the same for the rest 
	ok=new JButton("ok");//also instantiate the others 
	f1.addActionListener(new TextListener());//same for other textfields 
	ok.addActionListener (new ButtonListener()); //same for cancel button 
//than you should add them to the panel you created before and of course you will need JLabels to //tell the user what to enter in which field 
} 


//Now you have to implement the classes TextListener and ButtonListener,those classes will tell the //buttons what to do once clicked,and the textFields 
private class TextListener implements ActionListener{ 
public void actionPerformed(ActionEvent e){ 
//write the code of what you want to happen once the user inputs the info 
} 
} 


private class ButtonListener implements ActionListener{ 
public void actionPerformed(ActionEvent e){ 
//write the code of what you want to do when the button is clicked 
} 
} 
}