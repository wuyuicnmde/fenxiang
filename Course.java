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
		courses[0] = new Course(1001, "nui-App�̳�ʵս", "����", "�ƶ�����", 20.3, 5.0);
		courses[1] = new Course(1002, "JS", "����", "�������", 12.3, 4.0);
		courses[2] = new Course(1003, "JAVA", "����", "�������", 50.9, 5.0);
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
		System.out.println(">>>>>>>>>>>��ӿγ�");
		Course c = new Course();
		System.out.println("������γ̱�ţ�");
		c.num = sc.nextInt();

		System.out.println("������γ����ƣ�");
		c.name = sc.next();

		System.out.println("�����뽲ʦ���֣�");
		c.teacher = sc.next();

		System.out.println("������γ̷��ࣺ");
		c.classType = sc.next();

		System.out.println("������γ��ۼۣ�");
		c.price = sc.nextDouble();

		System.out.println("������γ����֣�");
		c.score = sc.nextDouble();

		System.out.println("ȷ�ϱ���������Ϣ��Y ���� Nȡ��");

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

		System.out.println(">>>>>>>>>>>�鿴�γ���Ϣ");
		System.out.println("�γ̱��\t\t �γ�����\t\t ��ʦ\t\t ����\t\t �ۼ�\t\t ����");
		for (Course c : courses) {
			System.out.printf("%-16d %-22s %-14s %-12s %-12.2f %.2f \n", c.num, c.name, c.teacher, c.classType, c.price,
					c.score);
		}
	}

	public static void showMenu() {

		System.out.println("++++++++++++++++++++++");
		System.out.println("��ӭ���������ƿ���");
		System.out.println("1���鿴�Ƽ��γ�");
		System.out.println("2����ӿγ�");
		System.out.println("3�������ۼ�");
		System.out.println("4���˳�ϵͳ");
		System.out.println("�����빦�ܱ�ţ�ִ����Ӧ����");
		System.out.println("++++++++++++++++++++++");
	}

}
