package com.company;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ChallengeTest {
    Challenge ch = new Challenge();

    @Test
    void sumTest() {
        assertEquals(ch.sum(2,3) , 5);
    }

    @Test
    void sumMultipleTest() {
        assertEquals(ch.sumMultiples(15) , 60);
    }

    @Test
    void factorialTest() {
        assertEquals(ch.factorial(5) , 120);
    }

    @Test
    void linearSearchTest() {
        Integer[] my_array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };
        assertEquals(ch.linearSearch(5,my_array) , 0);
    }

    @Test
    void linearSearchTest1() {
        Integer[] my_array = { 3, 1, 3, 2, 6, 9, 7, 6 };
        assertEquals(ch.linearSearch(6,my_array) , 4);
    }

    @Test
    void linearSearchTest2() {
        Integer[] my_array = { 22, 22, 22, 22 };
        assertEquals(ch.linearSearch(22,my_array) , 0);
    }

    @Test
    void linearSearchTest3() {
        Integer[] my_array = { 103, -110 };
        assertEquals(ch.linearSearch(10,my_array) , -1);
    }

    @Test
    void reverseStringTest() {
        assertEquals(ch.reverse("java interview"),("weivretni avaj"));
    }

    @Test
    void maximumTest() {
        Integer[] my_array = { 3, 1, 3, 2, 6, 9, 7, 6 };
        assertEquals(ch.maximum(my_array) , 9);
    }

    @Test
    void minimumTest() {
        Integer[] my_array = { 3, 1, 3, 2, 6, 9, 7, 6 };
        assertEquals(ch.minimum(my_array) , 1);
    }

    @Test
    void averageTest() {
        List<Integer> mylist = new ArrayList<>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        assertEquals(ch.average(mylist),(2.5));
    }

    @Test
    void miniTest() {
        List<Integer> mylist = new ArrayList<>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        assertEquals(ch.mini(mylist),(1));
    }

    @Test
    void maxiTest() {
        List<Integer> mylist = new ArrayList<>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        assertEquals(ch.maxi(mylist),(4));
    }

    @Test
    void toUppercaseTest() {
        List<String> mylist = new ArrayList<>();
        mylist.add("big");
        mylist.add("sed");
        mylist.add("ass");
        mylist.add("few");
        assertEquals(ch.upperCase(mylist),(List.of("BIG","SED","ASS","FEW")));
    }

    @Test
    void oddNthElement(){
        List<Integer> mylist = new ArrayList<Integer>();
        mylist.add(2);
        mylist.add(3);
        mylist.add(5);
        mylist.add(7);
        mylist.add(8);

        assertEquals(ch.getElement(mylist,1) , 3);
    }

//    @Test
//    void fuzzBuzzTest(){
//        assertEquals(ch.fizzBuzz(3),("Fizz"));
//        assertEquals(ch.fizzBuzz(5),("Buzz"));
//        assertEquals(ch.fizzBuzz(2),("2"));
//    }

    @ParameterizedTest
    @CsvSource({"2,2","3,Fizz","5,Buzz"})
    void fuzzBuzzTest(String input,String output){
        int inputInteger = Integer.parseInt(input);
        assertEquals(ch.fizzBuzz(inputInteger),(output));
    }
    
    @Test
    void fibTest(){
        assertEquals(ch.fibonacci(2) , 1);
        assertEquals(ch.fibonacci(-1) , null);
    }

    @Test
    void isPalindromeTest(){
        assertEquals(ch.isPalindrome("abcba"),true);
    }

    @Test
    void fibEvenSumTest(){
        assertEquals(ch.evenFibonacciSum(3), 2);
    }


    @ParameterizedTest
    @CsvSource({
            "55,5,5",
            "16,4,4",
            "54,55,1",
            "15,65,5"
    })
    void gpdTest(String firstNumber, String secondNumber, String actualNumber) {
        Integer fNumb = Integer.parseInt(firstNumber);
        Integer sNumb = Integer.parseInt(secondNumber);
        Integer aNumb = Integer.parseInt(actualNumber);
        assertEquals(ch.gcd(fNumb,sNumb),aNumb);
    }

    @Test
    void lastListElement(){
        List<Integer> mylist = new ArrayList<Integer>();
        mylist.add(2);
        mylist.add(3);
        mylist.add(5);
        mylist.add(7);
        mylist.add(8);

        assertEquals(ch.lastListElement(mylist),8);
    }

    @Test
    void secondToLastListElement(){
        List<Integer> mylist = new ArrayList<Integer>();
        mylist.add(2);
        mylist.add(3);
        mylist.add(5);
        mylist.add(7);
        mylist.add(8);

        assertEquals(ch.secondToLastListElement(mylist),7);
    }

    @Test
    void IndexElementTest(){
        List<Integer> mylist = new ArrayList<Integer>();
        mylist.add(2);
        mylist.add(3);
        mylist.add(5);
        mylist.add(7);
        mylist.add(8);

        assertEquals(ch.getListElementFromProvidedIndex(0,mylist),2);
    }

    @Test
    void listSizeTest(){
        List<Integer> mylist = new ArrayList<Integer>();
        mylist.add(2);
        mylist.add(3);
        mylist.add(5);
        mylist.add(7);
        mylist.add(8);

        assertEquals(ch.listElementCount(mylist),5);
    }

    @Test
    void palindromeTest(){
        List<String> mylist = new ArrayList<>();
        mylist.add("m");
        mylist.add("i");
        mylist.add("x");
        mylist.add("a");
        mylist.add("g");

        assertTrue(ch.isPalindrome(mylist));
    }

}