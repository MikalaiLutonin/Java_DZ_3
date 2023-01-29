//package ru.gb.jseminar;
import java.util.*;

public class HomeWork {
        // Пусть дан произвольный список целых чисел
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 4, 2, 5, 0, 9, 3, 6, 1));
            HomeWork t = new HomeWork();
            System.out.println(t.removeEvenValue(list));
            System.out.println(t.getMin(list));
            System.out.println(t.getMax(list));
            System.out.println(t.getAverage(list));
        }

        // Нужно удалить из него четные числа
        public List<Integer> removeEvenValue(List<Integer> list){
            for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
                Integer number = iterator.next();
                if (number % 2 == 0) {
                    iterator.remove();
                }

            }
            return list;
        }

        // Найти минимальное значение
        public Integer getMin(List<Integer> list){

            return Collections.min(list);
        }

        // Найти максимальное значение
        public Integer getMax(List<Integer> list){

            return Collections.max(list);
        }

        // Найти среднее значение
        public Integer getAverage(List<Integer> list){

            return (getMax(list)+getMin(list))/2;
        }
    }