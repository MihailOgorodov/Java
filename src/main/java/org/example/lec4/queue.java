package org.example.lec4;

import java.util.*;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(4); // добавление элемента
        queue.add(5); // но добавление в памяти может располагаться где угодно
        queue.remove(); // удаляет первый добавленный элемент, то есть удалит 4
        queue.offer(2089); // добавляет элементы, но не вызывает ошибку, если не может добавить элемент,в отличие от add
        queue.add(10);
        System.out.println(queue);

        int poll = queue.poll(); // возвращает удаленный элемент.
        System.out.println(poll);
        // queue.element() возвращает, но не удаляет, элемент из начала очереди. Если очередь пуста, генерирует исключение
        // queue.peek(); Возвращает объект, находящийся в начале очереди Queue, но не удаляет его.

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // PriorityQueue добавляет сперва наименьший элемент
        pq.add(123);
        pq.add(3);
        pq.add(12);
        pq.add(1);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1); dq.addLast(2);
        System.out.println(dq);
        dq.removeLast(); //dq.removeLast();

        dq.offerFirst(1); dq.offerLast(2);
        System.out.println(dq);
        dq.pollFirst(); dq.pollLast();
        System.out.println(dq);
        dq.getFirst(); dq.getLast();
        System.out.println(dq);
        dq.peekFirst(); dq.peekLast();
        System.out.println(dq);



    }
}
