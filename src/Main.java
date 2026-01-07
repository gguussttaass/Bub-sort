public class Main {

    public static void studentsSort(String[] students) {
        int n = students.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {

                    String temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] students = {
                "benas",
                "jonas",
                "bobas",
                "martynas"
        };

        studentsSort(students);

        for (String student : students) {
            System.out.println(student);
        }
    }
}