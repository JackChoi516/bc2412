import java.util.Arrays;

public class DemoArray {
    public static void main(String[]args){

    int x1 = 3;
    int x2 = 10;
    int x3 = 11;

    // declare  array
    int[] arr = new int[3];
    // assign value to array 
    arr[0] = 3;
    arr[1] = 10;
    arr[2] = 11;
    // for loop > read array value
    // Print all values, which >= 10
    for (int i = 0; i < arr.length; i++){ // i = 0,1,2
        if (arr[i]>= 10){
        System.out.println(arr[i]);
        }
    }

    // declaare double array, length = 5
    // assign values > 10.4, 4.3, 3.3, 1.9, 9.9
    // sum up all values in the double array
    double sum = 0;
    double[] arr2 = new double[5];
    arr2[0] = 10.4;
    arr2[1] = 4.3;
    arr2[2] = 3.3;
    arr2[3] = 1.9;
    arr2[4] = 9.9;
    for (int i = 0; i <arr2.length; i++){
        sum = sum + arr2[i];
    }System.out.println(sum);

    // "abc", "def", "ijk"
    // "abc"
        String[] arr3 = new String[3];
    arr3[0] = "abc";
    arr3[1] = "def";
    arr3[2] = "ijk";
    String target = "abc";
    boolean isTargetExist = false;
    for (int i = 0; i < arr3.length; i++){
        if (target. equals(arr3[i])){
            isTargetExist = true;
        }
    }System.out.println(isTargetExist);


    char[] arr4 = new char[] {'b', 'c', 'a'};
    // arr4[0] = 'b';
    // arr4[1] = 'c';
    // arr4[2] = 'a';
    // convert the char value to int value, and then assign them to a new int array
    // 98, 99, 97 (char)
    int[] arr5 = new int[arr4.length];
    for (int i = 0; i < arr4.length; i++){ // 0,1,2
    arr5[i] = arr4[i]; // char value arr4[i] > int variable att5[i]
    }
    for (int i = 0; i < arr5.length; i++){
        System.out.println(arr5[i]);
    }// 98, 99, 97

    // find the max ascii value (arr5) in the int array
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr5.length; i++){
        if( arr5[i] > max){
            max = arr5[i];
        }
    }System.out.println(max); // 99
    // Step 1: i = 0, 98 > max > false > max = 98
    // Step 2: i = 1, 99 > max > true > max = 99
    // Step 3: i = 2, 97 > max > false > exist

    // Find the min value in the int array
    // 9, -8, -99, 98

    int[] arr6 = new int[]{9, 8, 99, 98};
    int min = Integer.MAX_VALUE; // int max value
    for (int i = 0; i < arr6.length; i++){
        if (arr6[i]< min){
            min = arr6[i];
        }
    }System.out.println(min);

    // array sum
    int arraySum = 0;
    for (int i = 0; i < arr6.length; i++){
        arraySum += arr6[i];
    }System.out.println("arraySum is " + arraySum);

    // Swap
    int left = 7;
    int right = 9;
    int temp = left; //backup left
    left = right;
    right = temp;

    System.out.println(left);//9
    System.out.println(right);//7

    // array
    int[] arr8 = new int[]{9, -8, 109, 99, 98};
    int sumArr8 = 0;
    // print 1 (9 + -8)
    // print 101 (-8 + 109)
    // print ....
    // print 197 ( 99 + 98)
    for (int i = 0; i < arr8.length-1; i++){
        sumArr8 = arr8[i] + arr8[i+1]; System.out.println("sumArr8 is " + sumArr8);
    }

    // array swap
    int[] arr7 = new int[] {9, -8, 109, 99, 98};
    int temp2 = 0;
    // move max value to the tail
    // for loop + swap
    // 9, -8, 109, 99, 98
    // -8, 9, 109, 99, 98
    // -8, 9, 9, 109, 98
    // -8, -9, 99, 109, 98
    // -8, -9, 99, 98, 109
    for (int i = 0; i < arr7.length - 1; i++){
        if (arr7[i] > arr7[i+1]){
          temp2 = arr7[i]; 
          arr7[i] = arr7[i+1]; 
          arr7[i+1] = temp2;
        }
    }
    System.out.println(Arrays.toString(arr7));// [x, x, x, x, 109]

    Integer[] arr11 = new Integer[]{9, 6, 4};
    // Product for all numbers
    int product = 1;
    for (int i = 0; i < arr11.length; i++){
        product *= arr11[i];
    }System.out.println(product); // 216

    double[] price = new double[]{8.2, 6.5, 10.5};
    int[] quantities = new int[]{9, 8, 3};
    // 8.2 * 9 + 6.5 * 8 + 10.5 * 3
    double totalPrice = 0.0;
    for (int i = 0; i < price.length; i++){
        totalPrice = totalPrice + price[i] * quantities[i];
    }
    System.out.println(totalPrice); // 157.3

    String s = String.valueOf(123); // "123"
    s = String.valueOf(true);
    System.out.println(s); // true

    System.out.println(String.valueOf('A')); // "A"

    Integer i1 = Integer.valueOf("123");
    System.out.println(i1); //123
    // Integer i2 = Integer.valueOf("h");
    // System.out.println(i2);// java.lang.NumberFormatException

    // "hello" > "h", "e", "l", "l", "o"
    char[] chArr = "hello".toCharArray();
    System.out.println(chArr);
    System.out.println(chArr[0]); // h

    // hello > olleh
    char temp3 = ' ';
    for (int i = 0; i < chArr.length / 2; i++){ 
        // chArr[i] vs chArr[chArr.length - 1]
        temp3 = chArr[i];
        chArr[i] =chArr[chArr.length - 1 - i ];
        chArr[chArr.length - 1 - i ] = temp3;
    }
    String result = "";
    for (int i = 0; i < chArr.length; i++){
        result += chArr[i];

    }System.out.println(result); // "olleh" char + String = String

    // h > i, e > f, l > m, o > p
    // ifmmp
    chArr = "hello".toCharArray();
    for (int i = 0; i < chArr.length; i++){
      chArr[i] = (char) (chArr[i] + 1);
    }
    System.out.println(String.valueOf(chArr)); // "ifmmp", char Array > String

    // asume we have small letter ONLY
    char[] arr12 = new char[]{'p', 'a', 'p', 'b', 'a', 'p'};
    // more than one loop
    //System.out.println(maxNumChar); //p
    for (int i = 0; i < arr12.length; i++){
        for (int j = 0; j < arr12.length; j++){
            if (arr12[0] == arr12[j+1]){}
        }
    }


    
    }
}
