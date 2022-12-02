# class02-12
## kata task1

[Task link](https://www.codewars.com/kata/5a03b3f6a1c9040084001765)

My solution
```java
public class AngleSum {
  public static int sumOfAngles(int n) {
    return 180 * (n-2);
  }
}
```

My fav solution
```java
public class AngleSum {
  public static int sumOfAngles(int n) {
        if(n == 3)
            return 180;
        if(n == 4)
            return 360;
        return 180 + sumOfAngles(n-1);
  }
}
```

## kata task2

[Task link](https://www.codewars.com/kata/5951d30ce99cf2467e000013)

My solution
```java
class Barycenter {

    public static double[] barTriang(double[] x, double[] y, double[] z) {
        double[] arr = new double[2];
        arr[0] = (double) ((int) Math.round((x[0] + y[0] + z[0]) / 3 * 10000)) / 10000;
        arr[1] = (double) ((int) Math.round((x[1] + y[1] + z[1]) / 3 * 10000)) / 10000;
        return arr;
    }
}
```

My fav solution
```java
public class PythagoreanTriple {
		public int pythagoreanTriple(int[] triple){
        return triple[0] * triple[0] + triple[1] * triple[1] == triple[2] * triple[2] ? 1 : 0;
    }
}
```
