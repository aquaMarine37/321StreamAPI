import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> digits = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        Collections.sort(digits);
        for (int i = 0; i < digits.size(); i++){
            if (digits.get(i) <= 0 || digits.get(i)%2 != 0){
                digits.remove(i);
                i--;
            }
        }
        System.out.println(digits);

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        intList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(x -> System.out.print(x + " "));
    }
}
