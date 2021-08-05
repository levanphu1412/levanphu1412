public class Math {
    public boolean isOdd(int x) {
      return x % 2 != 0;
    }

    public boolean isEven(int x) {
        return x % 2 ==0;
    }
  
    public float calculateBMI(float height, float weight) {
      return weight / (height * height);
    }
  
    public float circle_perimeter(float diameter) {
      return diameter * 3.14f; 
    }
  
    public boolean isTriangle(float x, float y, float z) {
        return ((x + y > z) && (y +z > x) && (z + x >y));
    }
    
    public float smallestIn2Numbers(float x, float y){
        return (x < y) ? x : y;
    }
    public float smallestIn3Numbers(float x, float y, float z) {
      return smallestIn2Numbers(smallestIn2Numbers(x, y), z);
    }
    public float sum(int[] numbers) {
      float sum = 0f;
      for(int i = 0; i < numbers.length; i++) {
          sum += numbers[i];
      }
      return sum;
    }
  
    public float average(int[] numbers) {
      float sum = 0f;
      for(int i : numbers) {
          sum = sum + i;
      }
      return sum/numbers.length;
    }
  
    public int[] reverseArray(int[] numbers) {
      for(int i = 0; i < numbers.length; i++) {
          if(i == numbers.length/2) {
              break;
          }
          int a = numbers[i]; 
          numbers[i] = numbers[numbers.length - i -1];
          numbers[numbers.length - i -1] = a;
      }
      return numbers;
    }

    public int countOddNumber(int[] numbers) {
      int count = 0;
      for(int i = 0; i < numbers.length; i++) {
          if(numbers[i] % 2 !=0) {
              count += 1;
          }
      }
      return count;
    }

    public int[] oddNumberArray(int[] numbers) {
        int count = 0;
        for(int i= 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 1) {
                count ++;
            }
        }
        int[] mangsole = new int[count];
        int a = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 !=0) {
                mangsole[a] = numbers[i];
                a ++; 
            }
        }
        return mangsole;
    }

    public String bmiRating(float height, float weight) {
        String result = "";
        float BMI = weight / (height *height); 
        if(BMI < 18.5) {
            result = "nhẹ cân";
        }
        if((18.5 < BMI)&&(BMI < 24.9)) {
            result = "bình thường";
        }
        if((BMI > 25.0)&&(BMI < 29.9)) {
            result = "quá cân";
        }
        if(BMI > 30.0) {
            result = "rất nguy hiểm";
        } 
        return result;
    }

  
  }