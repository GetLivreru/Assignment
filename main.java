// Task 1
public static int findMin(int[] arr) {
    int min = arr[0]; 
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }

    return min; 
}
// Task 2
public static double findAverage(int[] arr) {
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }

    double average = (double) sum / arr.length; 

    return average; 
}
// Task 3
public static boolean isPrime(int n) {
    if (n <= 1) {
        return false; 
    }

    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false; 
        }
    }

    return true;
}
// Task 4
public static int factorial(int n) {
    if (n == 0) {
        return 1; 
    } else {
        return n * factorial(n - 1); 
    }
}
// Task 5
public static int fibonacci(int n) {
    if (n == 0) {
        return 0; 
    } else if (n == 1) {
        return 1; 
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }
}
// Task 6
public static double power(double a, int n) {
    if (n == 0) {
        return 1; 
    } else if (n == 1) {
        return a; 
    } else if (n < 0) {
        return 1 / power(a, -n); 
    } else if (n % 2 == 0) {
        double halfPower = power(a, n / 2);
        return halfPower * halfPower; 
    } else {
        return a * power(a, n - 1); 
    }
}
// Task 7
public static void printPermutations(String str) {
    printPermutationsHelper("", str); 
}

private static void printPermutationsHelper(String prefix, String str) {
    int n = str.length();
    if (n == 0) {
        System.out.println(prefix); 
    } else {
        for (int i = 0; i < n; i++) {
            String newPrefix = prefix + str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1, n); 
            printPermutationsHelper(newPrefix, newStr); 
        }
    }
}



// Task 8
public static boolean isAllDigits(String s) {
    return s.matches("\\d+"); 
}
// Task 9
public static int binomialCoefficient(int n, int k) {
    if (k == 0 || k == n) {
        return 1; 
    } else {
        return binomialCoefficient(n-1, k-1) + binomialCoefficient(n-1, k); 
    }
}
// Task 10
public static int gcd(int a, int b) {
    if (b == 0) {
        return a; 
    } else {
        return gcd(b, a % b); 
    }
}
