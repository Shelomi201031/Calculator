//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Basic Calculator !");
    }

    public int sum(int num1, int num2){
        int sum = num1+num2;

        return sum;
    }

    public int sub(int num1, int num2){
        int sub = num1 - num2;
        return sub;
    }
}