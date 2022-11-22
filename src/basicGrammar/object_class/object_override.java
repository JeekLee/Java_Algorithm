package src.basicGrammar.object_class;

import java.util.*;

public class object_override {
    static public class Student implements Comparable{
        // field
        private String name;
        private HashMap<String, Integer> scores;

        // constructor
        public Student(String name, HashMap<String, Integer> scores) {
            this.name = name;
            this.scores = scores;
        }

        // getter
        public String getName() {
            return name;
        }
        public HashMap<String, Integer> getScores() {
            return scores;
        }

        // setter
        public void setName(String name) {
            this.name = name;
        }
        public void setScores(HashMap<String, Integer> scores) {
            this.scores = scores;
        }

        @Override
        public int compareTo(Object o) {
            Student s = (Student) o;
            if (this.scores.get("Java") > s.scores.get("Java")){
                return 1;
            }
            else {
                return -1;
            }
        }
    }
    public static void main(String[] args) {
        String[] names = {"AA","BB","CC"};
        String[][][] scores = {
                {{"Java", "70" }, {"Python", "80" }, {"Spring", "70" }, {"JPA", "50" }},
                {{"Java", "60" }, {"Python", "30" }, {"Spring", "90" }, {"JPA", "80" }},
                {{"Java", "80" }, {"Python", "30" }, {"Spring", "80" }, {"JPA", "80" }}
        };

        List<Student> arrlist = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            HashMap<String, Integer> tmp = new HashMap<>();
            for (int j = 0; j < scores[i].length; j++) {
                tmp.put(scores[i][j][0], Integer.parseInt(scores[i][j][1]));
            }
            arrlist.add(new Student(names[i], tmp));
        }
        // 1. Class에 정의된 방식으로 Sort (Comparable 인터페이스 사용)
        Collections.sort(arrlist);
        System.out.println("Java 점수 1등은? : " + arrlist.get(2).name);
        int[] arr;
        // 2. Comparator Class를 implement 해서 사용
        class PyComparator implements Comparator<Student> {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.scores.get("Python") > s2.scores.get("Python")) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        }
        Collections.sort(arrlist, new PyComparator());
        System.out.println("Python 점수 1등은? : " + arrlist.get(2).name);

        // 2. Comparator 익명 클래스를 활용
        Comparator<Student> SpComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.scores.get("Spring") > s2.scores.get("Spring")) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        };
        Collections.sort(arrlist, SpComparator);

    }
}
