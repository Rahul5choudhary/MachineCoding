package com.example.practice.Learning;

import java.util.*;

public class Learning  {

    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList();
//        queue.add(1);
//        queue.add(2);
//        queue.add(4);
//        queue.add(55);
//        while(queue.size()>0){
//            System.out.println(queue.poll());
//        }
//        System.out.println(queue.size());
//        List<Integer> values = new ArrayList<>();
//        values.add(1);
//        values.add(2);
//        values.add(3);
//        values.add(4);
//
//        Iterator<Integer> iterator = values.iterator();
//
//        while(iterator.hasNext()){
//            int val = iterator.next();
////            System.out.println(val);
//        }
//
//        for(int val:values){
////            System.out.println(val);
//        }
////        values.forEach((Integer val) -> System.out.println(val));
//




//        -------------


//        List<Integer> list = new ArrayList<>();
//        list.add(11);
//        list.add(22);
//        list.add(33);
//        System.out.println("size: " + list.size());
//        System.out.println("isEmpty " + list.isEmpty());
//        System.out.println("Contains " + list.contains(44));
//        list.add(44);
//        System.out.println("Contains " + list.contains(44));
//        list.remove(3); // remove using index
//        System.out.println("Removed using index " + list.contains(44));
//        list.remove(Integer.valueOf(22));
//        System.out.println("Removed using value" + list.contains(22));
//
//
//        Stack<Integer> st = new Stack<>();
//        HashMap<Integer,Integer> mp = new HashMap<>();
//        st.add(66);
//        st.add(77);
//        st.add(88);
//        st.add(99);
//
//        list.addAll(st);
//        System.out.println("addAll test using ContainsAll "+ list.containsAll(st));
//
//        list.remove(Integer.valueOf(7));
//
//        System.out.println("addAll test using ContainsAll "+ values.containsAll(st));
//
//        list.removeAll(st);
//        System.out.println("After remove all removing 1 element " +list.contains(8));
//        list.clear();
//        System.out.println("List size" + list.size());



//        String str = "Rahul";
//        str.reverse();
////
//        StringBuilder strrev = new StringBuilder();
////        strrev.append(str);
////
//        strrev.reverse();
//        System.out.println("Str Revese is " + strrev);


//        Integer [] arr = {1,2,4,5,6,7};
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        int i = Collections.binarySearch(arr1, 2);
        System.out.println("Integer is " + i);
//        for(Integer i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        List<Integer> ar1 = new ArrayList<>();
//        double x = 3;
//        System.out.println(x);
//        List<Integer> arr = new ArrayList<>();
//        arr.add(1111);
//        arr.add(4444);
//        arr.forEach((Integer val)->System.out.println(val));
////        Collections.reverse(arr);
//        arr.forEach((Integer val) -> System.out.println(val));






    }
}
