public class Task2 {

    public static void main(String[] args) {
        removeComma();
    }

    public static void getChar(String str, int i){
        System.out.println(str.charAt(i));
    }

    public static void change(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void findSquare(){
        String str = "    1,e 6,e 0,e 9,e      ";
        str = str.trim();
        str = str.replace("9,e", "9,e ");
        String[] arr = str.split(",e ");
        for (int i = 0; i < arr.length; i++) {
            int a = Integer.parseInt(arr[i]);
            System.out.println(a * a);
        }
    }

    public static void removeComma(){
        String str = "1,2,3,4,5,6,7,8,9";
        str = str.replace(",", " ");
        System.out.println(str);
        System.out.println();
    }
}
