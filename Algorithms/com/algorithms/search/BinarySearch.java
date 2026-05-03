package com.algorithms.search;

public class BinarySearch {
    public String binarySearch(int[] arr, int key) {
        // key = element you are searching for
        int first = 0;                  // first index
        int last = arr.length - 1;      // last index
        //int mid = (first + last) / 2;   // mid index

        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                return "Element Found At Index " + mid;
            } else {
                last = mid - 1;
            }

        }
        return "Element Not Found";
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();

        // make sure your array is sorted. Binary-Search works on sorted array.
        /*int[] array = {10,25,32,45,55,68};
        String result = bs.binarySearch(array,55);
        System.out.println(result);
        String result2 = bs.binarySearch(array,100);
        System.out.println(result2);*/

        int[] arr = {1, 2, 3, 4, 6, 7};
        System.out.println();
        System.out.println(bs.binarySearch(arr, 4));
        System.out.println(bs.binarySearch(arr, 10));
        System.out.println(bs.binarySearch(arr, 7));
        System.out.println(bs.binarySearch(arr, 20));
        System.out.println(bs.binarySearch(arr, 1));
    }
}
