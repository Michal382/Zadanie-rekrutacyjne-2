package zadanie.pkg2;

import java.util.ArrayList;

public class Zadanie2 {

    /*
     * Liczba doskonała to liczba, której suma dzielników bez niej samej równy jest tej liczbie
     * 6 jest liczbą doskonałą, bo jej dzielniki to: 1,2,3,6 a 1+2+3 = 6
     * 28 jest liczbą doskonałą, bo jej dzielniki to: 1,2,4,7,28 a 1+2+4+7 = 28
     *
     * Zadanie: napisz ciało metody findNPerfectNumbers, która znajdzie n pierwszych liczb doskonałych i zwróci je w postaci listy
     */
    
        public static ArrayList<Integer> findNPerfectNumbers(int n) {
            
             ArrayList<Integer> lista = new ArrayList<>();                      //utworzenie nowego obiektu ArrayList
            
       int foundNumbers =  0;                                                   //wyzerowanie licznika znalezionych liczb
       int sumOfDivisors = 0;                                                   //wyzerowanie licznika sumy dzielników
       int number = 1;                                                          //ustawienie wartośći aktualnie sprawdzanej liczby na 1
       
       if(n<1)  
       {                                                                        //algorytm po przyjęciu wartości n mniejszej od 1 zwróci "null" w konsoli
           return null;
       }
       while (foundNumbers < n)                                                 //warunek zakończenia pętli to ilość liczb znalezionych mniejsza o 1 od n, ponieważ indeksy
       {                                                                        //w ArrayList zaczynają się od 0
           for(int i=1; i <=(number/2); i++)
           {                                                                    //największy możliwy dzielnik danej liczby to połowa z tej liczby
               if((number%i)== 0)
                   sumOfDivisors += i;                                          //jeżeli reszta z dzielenia danej liczby i wynosi 0 (jest dzielnikiem)
           }                                                                    //dodaj do sumy dzielników wartość i
           
           if(sumOfDivisors == number)                                          //jeżeli suma dzielników == dana liczba, dodaj tę liczbę do listy
           {
               lista.add(number);
               foundNumbers++;                                                  //zwiększ licznik liczb znalezionych o 1
               
           }
           number++;                                                            //sprawdzanie kolejnej liczby
           sumOfDivisors = 0;                                                   //wyzerowanie sumy dzielników dla sprawdzania kolejnej liczby
       }
           
        return lista;
        }
        
    public static void main(String[] args) {
        System.out.println(findNPerfectNumbers(0));
    }
}