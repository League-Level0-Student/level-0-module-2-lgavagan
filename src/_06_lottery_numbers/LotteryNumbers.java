    package _06_lottery_numbers;

    import java.util.Random;

    import javax.swing.JOptionPane;

    public class LotteryNumbers {
    public static void main(String[] args) {
	int number;
	number = new Random().nextInt(10);
	int numberTwo;
	numberTwo = new Random().nextInt(10);
	int numberThree;
	numberThree = new Random().nextInt(10);
	int numberFour;
	numberFour = new Random().nextInt(10);
	int numberFive;
	numberFive = new Random().nextInt(10);
	JOptionPane.showMessageDialog(null,"Your number was " + number + numberTwo + numberThree + numberFour + numberFive + " If it was 53277 you won!");
}
}
