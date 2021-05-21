import java.util.Arrays;

public class App {
  public static void main(String[] args) {
    System.out.println(" chào các bạn lớp java 4");
    Math math = new Math();
    System.out.println(math.isOdd(5));

    float weight = 74f;
    float height = 1.76f;
    System.out.println("chỉ số BMI của thầy cường là "+ math.calculateBMI(height, weight));

    float diameter = 3.0f;
    System.out.println("chu vi hình tròn có đường kính " + diameter + " = " + math.circle_perimeter(diameter));

    float x = 4f;
    float y = 4.0f;
    float z = 8.0f;
    if (math.isTriangle( x, y, z)) {
      System.out.println("x: " + x + ",y: " + y + ",z: " + z + " tạo thành 1 tam giác");
    } else {
      System.out.println("x : " + x + ",y: " + y + ",z: " + z + " không tạo thành 1 tam giác");
    }

    System.out.println("số nhỏ nhất trong 3 số x:" + x + ", y:" + y + ", z:" + z + " la " + math.smallestIn3Numbers(x, y, z));

    int[] intArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
    System.out.println("tổng của mảng là: " + math.sum(intArray));

    System.out.println("TBC của mảng là: " + math.average(intArray));

    System.out.println("Mảng đã đảo ngược: " + Arrays.toString(math.reverseArray(intArray)));

    System.out.println("có " + math.countOddNumber(intArray)+ " số lẻ trong mảng");

    int[] intArray1 = new int[] {11, 12, 13, 14, 15, 16, 17};
    System.out.println("mảng số lẻ: " + Arrays.toString(math.oddNumberArray(intArray1)));

    System.out.println("đánh giá chỉ số BMI của thầy Cường: " + math.bmiRating(height, weight));
  }
}