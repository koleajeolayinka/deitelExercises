package Chapter4;

public class fourDifferentStatement {
    public static void main(String[] args) {
        for (int i = 1; i < 12; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%d x %d = %d ", i, j, i * j );


            }
            System.out.println();
        }
        while (2 <=10){
            System.out.printf("%d x %d = %d ",1,2, 2 * 1);
            break;
        }
    }
}
