public class array {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < arr[0].length; i++)
            System.out.print(arr[0][i]);
        System.out.println();
        for (int i = 0; i < arr[0].length; i++)
            System.out.print(arr[arr.length - 1][i]);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                if (i == 0 || i == arr.length - 1)
                    System.out.print(arr[i][j]);
                else if (j == 0 || j == arr[i].length - 1)
                    System.out.print(arr[i][j]);
                else
                    System.out.print(" ");
            System.out.println();
        }
    }
}
