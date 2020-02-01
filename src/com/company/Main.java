package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        /*Collection - коллекции*/
        /*
        1) Set - множества
        2) List - списки
        3) Map - словарь (карта)
        1) В Set можно добавить элемент, поискать или удалить
        Порядка там нет.
        2) Пары обуви выставленные вдоль стены в определенном
        порядке. У кадой пары есть свой индекс - номер.
        3) Пары обуви. У каждой пары есть имя. Имя оно уникаольно.
        Маp - это набор данных пары ключ-значение
        В Java:
        Setы: Hashset, TreeSet, SortedSet
        Listы: ArrayList, LinkedList, Vector,Stack
        Mapы: HashMap, TreeMap, SortedMap, Hashtable
         */
      /*  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> a = new ArrayList<>(); //20
        while(true) {
            String s = reader.readLine();
            if(s.isEmpty()) break;
            a.add(Integer.parseInt(s));
        }

        for(Integer k: a) {
            System.out.print(k+ " ");
        }

       */
      /*  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> b = new ArrayList<>(); //20

        while(true) {
            String s = reader.readLine();
            if(s.isEmpty()) break;
            int x = Integer.parseInt(s);
            if(x%2 ==0) {
                b.add(x);
            } else {
                b.add(0,x);
            }


        }
        for(Integer k: b) {
            System.out.print(k+ " ");
        }
*/
      /*  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> b = new ArrayList<>(); //20

        b.add(1);
        b.add(12);
        b.add(7);
        b.add(8);
        b.add(5);
        for(int i=0; i<b.size();) {

            if(b.get(i)>5) {
                b.remove(i);
            } else {
                i++;
            }
        }
        for(Integer k: b) {
            System.out.print(k+ " ");
        }
*/
      int[] data = {1,5,6,7,8,89};
      ArrayList<Integer> c = new ArrayList<>();
      for(int i=0;i<data.length;i++) c.add(data[i]);

        ArrayList<Integer> chet = new ArrayList<>();
        ArrayList<Integer> nechet = new ArrayList<>();
        for(int i=0;i<c.size();i++) {
            Integer x = c.get(i);
            if(x%2 == 0) {
                chet.add(x);
            } else {
                nechet.add(x);
            }
        }





    }
}
