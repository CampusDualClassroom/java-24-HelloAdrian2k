package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.add("Smith");
        queue.add("Montessori");
        queue.add("Peralta");
        queue.add("House");
        return queue;
    }

    public static void printAndEmptyQueue(Queue<String> queue) {
        queue.forEach(System.out::println); //se imprime por consola cada queue item
        queue.clear();
    }

    public static void main(String[] args) {
        System.out.println("COLA CREADA:\n");
        printAndEmptyQueue(createQueue());
    }

}
