public class Introduction {
    public static void main(String[] args) {
        System.out.println("Nguyen Hong Thao Nguyen\t24021586\tINT2204 11\tngoenn104\t24021586@vnu.edu.vn");

        int bottles = 9;
        for (int i = bottles; i >= 1; i--) {
            if (i > 1) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down, pass it around,");
            } else {
                System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer.");
                System.out.println("Take one down, pass it around,");
                System.out.println("No more bottles of beer on the wall.");
            }
        }
    }
}
