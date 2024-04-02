package org.example.Java_.Java_Priority_Queue;

import java.util.*;

class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue<>(events.size());

        for (String event : events) {
            String[] parts = event.split(" ");
            if (parts[0].equals("ENTER")) {
                queue.add(new Student(Integer.parseInt(parts[3]), parts[1], Double.parseDouble(parts[2])));
            } else if (parts[0].equals("SERVED")) {
                if (!queue.isEmpty()) queue.remove();
            }
        }

        List<Student> students = new ArrayList<>();
        while(!queue.isEmpty()) {
            students.add(queue.poll());
        }
        return students;
    }
}
