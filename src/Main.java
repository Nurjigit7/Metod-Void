public class Main {
    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//        int san= sc.nextInt();
//        switch (san){
//            case 1:
//                hello();
//                break;
//            case 2:
//                bye();
//                break;
//            default:
//                System.out.println("jok");
//        }
//    }
//    static  void  hello (){
//        System.out.println("hello");
//    }
//    static void bye(){
//        System.out.println("bye")

//        tab();
//
//    }
//    static  void tab(){
//        for (int a = 1; a <= 10; a++) {
//            for (int i = 1; i <= 10; i++) {
//                int v= a*i;
//                System.out.print(i+" * " +a+" = "+v+"  ");
//                //    System.out.printf("%3d * %3d = %3d \n ",a, i, a * i);
//            }
//            System.out.println(" ");
//        Scanner sc =new Scanner(System.in);
//     tab(sc.nextLine());
//    }
//    static void tab(String soz){
//
//        System.out.println(soz + " nurjigit");  }
//
//
//        String[] a ={"hello ","world","salam","duyno"};
//        Mettod(a);
//
//    }
//    static void Mettod(String[]a) {
//        for (int i = 0; i < a.length ; i++) {
//            System.out.print(" "+a[i]);
//
//        }
//        Scanner sc =new Scanner(System.in);
//        int a = sc.nextInt();
//        sum(a);
//
//    }
//       static void sum(int s){
//           for (int i = 0; i < s; i++) {
//               System.out.print("*");
//
//           }
        System.out.println(min(new int[] {1,2,22,45,48}));
        System.out.println(max(new int[]{1,2,22,44,56}));


    }

    static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}