import java.util.Scanner;

public class Course {

	int num;
	String name;
	String teacher;
	String classType;
	double price;
	double score;

	public Course() {
	}

	public Course(int _num, String _name, String _teacher, String _classType, double _price, double _score) {

		num = _num;
		name = _name;
		teacher = _teacher;
		classType = _classType;
		price = _price;
		score = _score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course[] courses = new Course[3];
		courses[0] = new Course(1001, "nui-App商城实战", "张三", "移动开发", 20.3, 5.0);
		courses[1] = new Course(1002, "JS", "罗善", "编程语言", 12.3, 4.0);
		courses[2] = new Course(1003, "JAVA", "王五", "编程语言", 50.9, 5.0);
		showMenu();
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		while (menu != 4) {

			switch (menu) {

			case 1:
				showCourses(courses);
				break;
			case 2:
				courses = addCourse(courses, sc);
				break;
			case 3:
				break;
			}

			showMenu();
			menu = sc.nextInt();
		}

	}

	public static Course[] addCourse(Course[] courses, Scanner sc) {
		System.out.println(">>>>>>>>>>>添加课程");
		Course c = new Course();
		System.out.println("请输入课程编号：");
		c.num = sc.nextInt();

		System.out.println("请输入课程名称：");
		c.name = sc.next();

		System.out.println("请输入讲师名字：");
		c.teacher = sc.next();

		System.out.println("请输入课程分类：");
		c.classType = sc.next();

		System.out.println("请输入课程售价：");
		c.price = sc.nextDouble();

		System.out.println("请输入课程评分：");
		c.score = sc.nextDouble();

		System.out.println("确认保存新增信息吗？Y 保存 N取消");

		char choose = sc.next().charAt(0);

		if (choose == 'Y' || choose == 'y') {
			Course[] newCArr = new Course[courses.length + 1];
			for (int i = 0; i < courses.length; i++) {
				newCArr[i] = courses[i];
			}
			newCArr[newCArr.length - 1] = c;
			return newCArr;
		}
		return courses;

	}

	public static void showCourses(Course[] courses) {

		System.out.println(">>>>>>>>>>>查看课程信息");
		System.out.println("课程编号\t\t 课程名称\t\t 讲师\t\t 分类\t\t 售价\t\t 评分");
		for (Course c : courses) {
			System.out.printf("%-16d %-22s %-14s %-12s %-12.2f %.2f \n", c.num, c.name, c.teacher, c.classType, c.price,
					c.score);
		}
	}

	public static void showMenu() {

		System.out.println("++++++++++++++++++++++");
		System.out.println("欢迎来到网易云课堂");
		System.out.println("1、查看推荐课程");
		System.out.println("2、添加课程");
		System.out.println("3、调整售价");
		System.out.println("4、退出系统");
		System.out.println("请输入功能编号，执行相应操作");
		System.out.println("++++++++++++++++++++++");
	}

}
