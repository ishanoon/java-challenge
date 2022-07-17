package com.company;

import javax.swing.tree.TreeNode;
import java.util.*;
import java.util.stream.Collectors;

/**
 * This challenge is from https://code-exercises.com/
 */

public class Challenge {

    /**
     * Write a method that sums two numbers.
     */

    public Integer sum(int a, int b){
        return a + b;
    }

    /**
     * Given a number n, write a method that sums all multiples of three and five up to n (inclusive).
     */

    public Integer sumMultiples(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
     return sum;
    }

    /**
     * Write a method that calculates the factorial of a given number.
     */

    public Integer factorial(int n){
        int results = n;
        for(int i = 1; i < n; i++){
            results *= i;
        }
        return results;
    }

    /**
     * Write a method that returns the index of the first occurrence of given integer in a list.
     * Assume that the index of the first element in the list is zero.
     * If the number does not exist return -1.
     */
    public Integer linearSearch(Integer n, Integer[] list) {
        int numbIndex = -1;

        for(int numb = 0; numb < list.length; numb++){
            if(list[numb].equals(n)){
                numbIndex = numb;
                break;
            }
        }
        return numbIndex;
    }

    public String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        return sb.append(s).reverse().toString();
    }

    /**
     * Write a method that returns the largest integer in the list.
     * You can assume that the list has at least one element.
     * @param list
     * @return
     */

    public Integer maximum(Integer[] list) {
        int maxi = list[0];
        for(int numb : list){
            if(numb > maxi) maxi = numb;
        }
        return maxi;
    }

    public Integer maxi(List<Integer> list) {
        return list.stream().mapToInt(i -> i).max().getAsInt();
    }

    /***
     * Write a method that returns the lowest integer in the list.
     * You can assume that the list has at least one element.
     * @param list
     * @return
     */
    public Integer minimum(Integer[] list) {
        int mini = list[0];
        for(int numb : list){
            if(numb < mini) mini = numb;
        }
        return mini;
    }

    public Integer mini(List<Integer> list) {
        return list.stream().mapToInt(i -> i).min().getAsInt();
    }

    /***
     * Write a method that returns the average of a list of integers.
     */

    public Double average(List<Integer> list) {
       return list.stream().mapToInt(i -> i).average().getAsDouble();
    }

    /***
     * Write a method that converts all strings in a list to their upper case.
     */

    public List<String> upperCase(List<String> list) {
        return list.stream().map(String::toUpperCase).toList();
    }

    /***
     * Nth Odd Element
     * Write a method that returns the nth odd element of a list.
     * If the index of the element exceeds the list size, then return -1.
     */

    public Integer getElement(List<Integer> list, Integer n) {
        int result = -1;

        for(int num : list){
            if(num == list.get(n) && num % 2 == 1) {
                result = num;
            }
        }
        return result;
    }

    /***
     * Number Of Tree Nodes
     * Write a method that returns the number of nodes in a binary tree.
     * TreeNode API methods: node.left() and node.right().
     */

    public Integer getNumberOfNodes(TreeNode node) {
        return 1 + node.getChildCount();
    }

    /***
     * Count the number of nodes in a list.
     * ListNode API methods: node.next().
     */

    public Integer count(TreeNode node) {
        return node.getChildCount();
    }

    /***
     * Fizz Buzz
     * Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
     * For numbers which are multiples of both three and five return 'FizzBuzz'.
     * For numbers that are neither, return the input number.
     */

    public String fizzBuzz(Integer i) {
        String results = "";
        if(i % 3 == 0){
            results = "Fizz";
        }else if(i % 5 == 0){
            results =  "Buzz";
        }else {
            results = i.toString();
        }
        return results;
    }

    /***
     * Prime Number
     * A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
     * Write a method that checks if a number is a prime number.
     */

//    public Boolean isPrime(Integer n) {
//        return n > 1 &&  ;
//    }

    /***
     * Fibonacci Number
     * Write a method that returns the nth element of the Fibonacci Sequence
     * The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...
     * The next number is found by adding up the two numbers before it.
     * Assume that indexes start at zero, e.g., fib(0) = 0, fib(1) = 1
     */

    public Integer fibonacci(Integer n) {
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else if(n < 0 ){
            return null;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /***
     * Palindrome Check
     * A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
     * Write a method that detects if a string is a palindrome.
     * Tip: Use word.charAt(i) to get the character at position i.
     */

    public boolean isPalindrome(String word) {
        StringBuilder reverse = new StringBuilder();
        for(int i = 0; i <= word.length() -1; i++){
            reverse.append(word.charAt(i));
        }
        return word.equals(reverse.toString());
    }


    /***
     * Even Fibonacci Sum
     * Write a method that returns the sum of all even Fibonacci numbers.
     * Consider all Fibonacci numbers that are less than or equal to n.
     * Each new element in the Fibonacci sequence is generated by adding the previous two elements.
     */

    public Integer evenFibonacciSum(Integer n) {
        List<Integer> evenSum = new ArrayList<>();
        int sum = 0;

        Integer evenFib =  fibonacci(n - 1) + fibonacci(n - 2) % 2;
        evenSum.add(evenFib);

        for (Integer evenNumb : evenSum) sum += evenNumb;
        return sum;
    }

    /**
     * Greatest Common Divisor
     * The Greatest Common Divisor of two positive integers is the largest integer
     * that divides both without remainder.
     * Write a method that returns the Greatest Common Divisor of p and q.
     */

    public Integer gcd(Integer p, Integer q) {
        Integer divisor = q % p;
        if(q == 0){
            return p;
        }
        return gcd(q,divisor);
    }

    /**
     * This section of the challenge is from https://sites.google.com/site/prologsite/prolog-problems/1
     */

    /**
     * Find the last element of a list
     */

   <T> T lastListElement(List<T> nums){
        return nums.get(nums.size() -1);
    }

    /**
     * 1.02 (*) Find the last but one element of a list.
     */
    <T> T secondToLastListElement(List<T> nums){
        return nums.get(nums.size() -2);
    }

    /**
     * 1.03 (*) Find the K'th element of a list.
     */

    <T> T getListElementFromProvidedIndex(int providedIndex,List<T> nums){
       return (providedIndex <= nums.size() -1) ? nums.get(providedIndex) : null;
    }

    /**
     * 1.04 (*) Find the number of elements of a list.
     */
    <T> int listElementCount(List<T> nums){
        return nums.size();
    }

    /**
     * 1.06 (*) Find out whether a list is a palindrome.
     */

    public boolean isPalindrome(List<String> list){
        int lastIndex = list.size()-1;
        for (String s : list) {
            if (Objects.equals(s, list.get(lastIndex))) {
                return true;
            }
            lastIndex --;
        }
        return false;
    }

    /***
     * 1.07 (**) Flatten a nested list structure.
     */

    <T> List<T> flattenList(List<List<T>> list){
        return list.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    /**
     * 1.08 (**) Eliminate consecutive duplicates of list elements.
     * If a list contains repeated elements they should be replaced with a single copy of the element.
     * The order of the elements should not be changed.
     */

    <T> List<T> removeDuplicatesFromList(List<T> list){
        List<T> results = new ArrayList<>();
        int previous = 0;
        for(int i =1; i < list.size(); i++){
            if(list.get(previous) != list.get(i)){
                results.add(list.get(previous));
            }
            previous++;
        }
        return results;
    }



}
