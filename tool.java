public class tool {
    
    public static void print(int a){System.out.println(a);}
    public static void print(int a, String b){System.out.println(a + b);}
    public static void print(String a){System.out.println(a);}
    public static void print(String a, int b){System.out.println(a + b);}
    public static void print(String a, String b){System.out.println(a + b);}
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
