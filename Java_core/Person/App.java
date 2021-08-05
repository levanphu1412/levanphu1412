import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class App {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("lê văn phú", "20/2/1999", "thanh hóa", "0388327229", "levanphu5555@gmail.com", 7.0));
        students.add(new Student("vũ hải hà", "14/2/1998", "hà nội", "03897445454", "havu1999@gmail.com", 9.0));
        students.add(new Student("hoàng hải dương", "7/7/1996", "nghệ an", "03897445454", "duong51235@gmail.com", 8.0));
        students.add(new Student("nguyễn thành phương", "27/7/1996", "thanh hóa", "03897445454", "levanan4545@gmail.com", 10.0));
        students.add(new Student("lê thị hiền", "16/8/1996", "HCM", "03897445454", "lethihien599955@gmail.com", 6.0));
        students.add(new Student("lê thị hương", "14/12/1994", "thái bình", "03897445454", "levthihuong@gmail.com", 5.0));

        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("----------------------------------");
        System.out.println("sắp xếp học sinh theo tên");
        Collections.sort(students, new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                // TODO Auto-generated method stub
                return o1.getName().compareTo(o2.getName());
            }
            
        });
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("-----------------------------------");
        System.out.println("sắp xếp học sinh theo điểm trung bình");
        Collections.sort(students, new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                // TODO Auto-generated method stub
                return o1.getScore() > o2.getScore() ? 1 : -1;
            }

        });
        for(Student s : students) {
            System.out.println(s);
        }


        System.out.println("-------------------------------------------------------------");
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Nguyễn Thị Hòa", "15/9/1968", "Thanh Hóa", "04548484455", "nguyenhoa45454@gamil.com", 1000));
        teachers.add(new Teacher("Phạm Thị Thu", "27/9/1975", "Thanh Hóa", "05254545455", "phamthu123@gmail.com", 1200));
        teachers.add(new Teacher("Nguyễn Thị Hạnh", "15/5/1978", "Hà Nội", "04984546354", "nguyenthihanh456@gmail.com", 900));
        teachers.add(new Teacher("Mai Thị Dung", "20/6/1965", "Nghệ An", "07894545122", "maidung156324@gmail.com", 1500));
        teachers.add(new Teacher("Nguyễn Văn Dũng", "4/3/1963", "Thái Bình", "04865456664", "dung@gmail.com", 1700));
        teachers.add(new Teacher("Trần Quang Hiệu", "24/1/1970", "Nam Định", "04865456664", "hieutran@gmail.com", 1400));

        for (Teacher t : teachers) {
            System.out.println(t);
        }

        System.out.println("--------------------------");
        System.out.println("Sắp xếp danh sách giáo viên theo tên");
        Collections.sort(teachers, new Comparator<Teacher>(){

            @Override
            public int compare(Teacher o1, Teacher o2) {
                // TODO Auto-generated method stub
                return o1.getName().compareTo(o2.getName());
            }

        });
        for (Teacher t : teachers) {
            System.out.println(t);
        }

        System.out.println("------------------------");
        System.out.println("Sắp xếp giáo viên theo lương");
        Collections.sort(teachers, new Comparator<Teacher>(){

            @Override
            public int compare(Teacher o1, Teacher o2) {
                // TODO Auto-generated method stub
                return o1.getSalary() > o2.getSalary() ? 1 : -1;
            }

        });
        for(Teacher t : teachers) {
            System.out.println(t);
        }

    }
}
