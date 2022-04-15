package Com.Bridgelabz;

public class Prob004 {
    public static void main(String[] args) {
        int [] arr = new int [] {0, 4, 7, 5, 6};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < max)
                max = arr[i];
        }
        System.out.println("smallest element present in given array: " + max);
    }
}

