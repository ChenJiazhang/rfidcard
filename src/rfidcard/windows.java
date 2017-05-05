package rfidcard;

import javax.swing.*;

public class windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame myWindow;
		myWindow = new JFrame();
		myWindow.setSize(300, 600);
		myWindow.setTitle("rfid card");
		myWindow.setVisible(true);
		
		JOptionPane.showMessageDialog(myWindow, "请输入密码");
		JOptionPane.showMessageDialog(null, "关闭程序？");
		
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
