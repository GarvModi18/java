import javax.swing.JOptionPane;
class joption {

	public static void main(String[] args) {
		String age=JOptionPane.showInputDialog(null,"Enter your age","Input Data",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null,age,"Your Age",JOptionPane.INFORMATION_MESSAGE);
		

		Integer num=Integer.parseInt(age);
		num+=10;
		System.out.println("Your age + 10 : "+num);

	}



}