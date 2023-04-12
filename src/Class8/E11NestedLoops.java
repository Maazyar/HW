package Class8;

public class E11NestedLoops {
    public static void main(String[] args) {
        int counter = 2;
        while (counter < 11) {
            System.out.print(counter + " ");
            counter += 2;
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j < 11; j+=2) {
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
}
