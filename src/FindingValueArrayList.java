import java.util.ArrayList;
import java.util.Scanner;

public class FindingValueArrayList {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(31);
        numberList.add(21);
        numberList.add(13);
        numberList.add(8);
        numberList.add(54);
        numberList.add(13);
        numberList.add(54);

        System.out.println(numberList);
        System.out.println("enter a value to find: ");
        int userNum = kb.nextInt();
        if (numberList.indexOf(userNum) != -1){
            System.out.println(userNum + " is in the ArrayList.");
        }
        else{
            System.out.println(userNum + " is not in the ArrayList.");
        }



    }

}
