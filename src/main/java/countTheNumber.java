import java.util.*;

public class countTheNumber {
    public static int countVietnameseCharacters(String input) {

        Set<String> telexMapping = new HashSet<>(Arrays.asList("aw", "aa", "dd", "ee", "oo", "ow", "w"));

        int count = 0;
        int i = 0;

        while (i < input.length()) {

            if (i < input.length() - 1) {
                String twoChars = input.substring(i, i + 2);
                if (telexMapping.contains(twoChars)) {
                    count++;
                    i += 2;
                    continue;
                }
            }


            String oneChar = input.substring(i, i + 1);
            if (telexMapping.contains(oneChar)) {
                count++;
            }

            i++;
        }

        return count;
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("Nhập vào chuỗi các ký tự latin (không khoảng trắng hoặc ký tự đặc biệt): ");
        String input = scanner.nextLine().trim();


        int result = countVietnameseCharacters(input);
        System.out.println("Số lượng các chữ cái có dấu tiếng Việt có thể tạo thành: " + result);

        scanner.close();
    }
}
