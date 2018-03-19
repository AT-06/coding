package org.fundacionjala.coding.maria;

/**
* Kata 15.
*/
public class Kata15 {
/**
* @param arrayNumber receive an array
* @return return the number of repeticions of the most frecuent number
*/
    public int mostFrequentItemCount(int[] arrayNumber) {

         int mostFqNumber = 0;
         for (int i = 0; i < arrayNumber.length; i++) {
             int count = 0;
             for (int number : arrayNumber) {
                 if (number == arrayNumber[i]) {
                     count++;
                 }
             }
             mostFqNumber = count > mostFqNumber ? count : mostFqNumber;
         }
         return mostFqNumber;
    }
}
