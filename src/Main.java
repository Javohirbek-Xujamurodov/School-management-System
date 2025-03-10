public class Main {
    public class Main {
        public static void main(String[] args) {
            // 1. Maktab yaratamiz
            School mySchool = new School();

            // 2. O‘qituvchilarni yaratamiz
            Teacher teacher1 = new Teacher(1, "Ali", "Karimov", 5000);
            Teacher teacher2 = new Teacher(2, "Madina", "Yoqubova", 6000);

            // 3. O‘qituvchilarni maktabga qo‘shamiz
            mySchool.addTeacher(teacher1);
            mySchool.addTeacher(teacher2);

            // 4. O‘quvchilarni yaratamiz
            Student student1 = new Student(101, "Javohir", "Bekmurodov", 10);
            Student student2 = new Student(102, "Marjona", "Turg‘unova", 9);

            // 5. O‘quvchilarni maktabga qo‘shamiz
            mySchool.addStudent(student1);
            mySchool.addStudent(student2);

            // 6. O‘quvchilar to‘lov qilishadi
            student1.payFees(15000);
            mySchool.updateMoneyEarned(15000);

            student2.payFees(10000);
            mySchool.updateMoneyEarned(10000);

            // 7. O‘qituvchilarga maosh to‘laymiz
            teacher1.receiveSalary(5000);
            mySchool.updateMoneySpent(5000);

            teacher2.receiveSalary(6000);
            mySchool.updateMoneySpent(6000);

            // 8. Natijalarni ekranga chiqaramiz
            System.out.println("Maktabning jami daromadi: " + mySchool.getTotalMoneyEarned());
            System.out.println("Maktabning jami xarajatlari: " + mySchool.getTotalMoneySpent());
            System.out.println("O‘quvchi " + student1.getFirstName() + " qancha to‘lagan: " + student1.getFeesPaid());
            System.out.println("O‘qituvchi " + teacher1.getFirstName() + " qancha maosh olgan: " + teacher1.getSalary());
        }
    }

}
