import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class ButtonAdd extends JFrame {
	public JLabel name = new JLabel(" Name");
	public JTextField text = new JTextField(40);
	public JButton button1 = new JButton("submit");
   	 TryMebutton sub = new TryMebutton();
	 ButtonAdd()
	 {	        
		        button1.addActionListener(new ActionListener() {
		        	 @Override
			    public void actionPerformed(ActionEvent arg0) {
 		        		
		        		 name.setText(" you have typed : "+text.getText()); }});
		        
		       
		        setTitle("title");
 				setSize(300,200);
 				add(name);add(text);
 		
 				add(button1);
 				setResizable(true);
  				setLayout(new GridLayout(2,2));
				setVisible(true);
			    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		 
	 }

	
	
	
	
	
 

}
