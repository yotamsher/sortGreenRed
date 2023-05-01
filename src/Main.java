import com.tests.ys.RedGreenArray;
import com.tests.ys.redGreenElement;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int arrayLength = 12;
        if(args.length < 2)
        {
            System.out.println("no input provided falling to default");
        }else{
            System.out.println("Todo: parse input");
        }
        RedGreenArray redGreenArray = new RedGreenArray(arrayLength);
        System.out.println("before");

        redGreenArray.print();

        redGreenArray.sort();

        System.out.println("\nafter");
        redGreenArray.print();

    }
}