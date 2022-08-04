import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExampineDemo {
    public static void main(String[] args) {
        System.out.println("OnlineTest ishlash uchun");
        System.out.println("----------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nTizimga kirmoqchimisiz? \n1.HA    2.YO'Q");
        int num = scanner.nextInt();

        if (num != 2) {
            System.out.println("Ismingizni kiriting:");
            String NAME = scanner.next();
            System.out.print("Email: ");
            String login = scanner.next();
            System.out.print("Password: ");
            int password = scanner.nextInt();

            if (login != "") {
                if (login.equals("xudoyor@gmail.com") && password == 112233) {
                    if (login.equals("khamza@gmail.com") && password == 111222) {
                        System.out.println("Tizimga xush kelibsiz!");
                    } else System.out.println("Login yoki parol xato");
                }

        System.out.println("\n----------------------------------------------\n");
        List<Role> roles = new ArrayList<>();
        roles.add(new Role("\n"));
        roles.add(new Role("1.STUDENT\n"));
        roles.add(new Role("2.TEACHER\n"));
        roles.add(new Role("3.DIRECTOR"));
        //               System.out.println("1.STUDENT\n2.TEACHER\n3.DIRECTOR");
        System.out.println(roles);
        int num1 = scanner.nextInt();

        switch (num1) {
            case 1:

                System.out.println("\n----------------------------------------------\n");
                System.out.println("1.Test yechish\n2.Natijani ko'rish\n0.Chiqish");
                int number = scanner.nextInt();
                System.out.println("\n----------------------------------------------\n");


                switch (number) {
                    case 1:
                        System.out.print("Fanni tanlang");
                        List<Subject> subjects = new ArrayList<>();
                        subjects.add(new Subject("Fanni tanlang\n"));
                        subjects.add(new Subject("1.Matematika\n"));
                        subjects.add(new Subject("2.Fizika\n"));
                        subjects.add(new Subject("3.Ona tili\n"));
                        subjects.add(new Subject("4.Ingiliz tili\n"));
                        subjects.add(new Subject("5.Tarix"));
                        //           System.out.println("\n1.Matematika\n2.Fizika\n3.Ona tili\n4.Ingiliz tili\n");
                        System.out.println(subjects);
                        int number1 = scanner.nextInt();
                        List<Answer> answerList = new ArrayList<>();
                        List<Question> questions = new ArrayList<>();
                        switch (number1) {
                            case 1:
//                                        List<Question> questions = new ArrayList<>();
//                                        List<Answer> answerList = new ArrayList<>();
                                questions.add(new Question("1)Boshidagi 5 ta tub sonlar yig'indisini toping?", subjects.get(1)));
                                answerList.add(new Answer("A.26", false, questions.get(0)));
                                answerList.add(new Answer("B.28", true, questions.get(0)));
                                answerList.add(new Answer("C.30", false, questions.get(0)));
                                System.out.println(questions);
                                System.out.println(answerList);
                                String question1 = scanner.next();
                                switch (question1) {
                                    case "A":
                                        System.out.println("Xato");
                                        System.out.println("To'g'ri javob - B");
                                        break;
                                    case "B":
                                        System.out.println("Barakalla!");
                                        break;
                                    case "C":
                                        System.out.println("Xato");
                                        System.out.println("To'g'ri javob - B");


                                    questions.add(new Question("2)6 sonining 3-darajasi nechchiga teng?", subjects.get(1)));
                                    answerList.add(new Answer("A.216", true, questions.get(1)));
                                    answerList.add(new Answer("B.336", false, questions.get(1)));
                                    answerList.add(new Answer("C.196", false, questions.get(1)));
                                        System.out.println(questions);
                                        System.out.println(answerList);
                                        String question2 = scanner.next();



                                }
//
//                                        questions.add(new Question("2)6 sonining 3-darajasi nechchiga teng?", subjects.get(1)));
//                                        answerList.add(new Answer("A.216", true, questions.get(1)));
//                                        answerList.add(new Answer("B.336", false, questions.get(1)));
//                                        answerList.add(new Answer("C.196", false, questions.get(1)));
//
//                                        questions.add(new Question("3)Eni 5 sm va bo'yi 7 sm bo'lgan to'g'ri to'rtburchakning yuzasini toping?", subjects.get(1)));
//                                        answerList.add(new Answer("A.40", false, questions.get(2)));
//                                        answerList.add(new Answer("B.35", true, questions.get(2)));
//                                        answerList.add(new Answer("C.29", false, questions.get(2)));
//
//                                    case 2:
//                                        questions.add(new Question("Bosimni o'lchaydigan asbob nima?", subjects.get(2)));
//                                        answerList.add(new Answer("A.termometr", false, questions.get(0)));
//                                        answerList.add(new Answer("B.barometr", true, questions.get(0)));
//                                        answerList.add(new Answer("C.tarozi", false, questions.get(0)));
//
//                                        questions.add(new Question("Mendeleyev davriy jadvalida nechta element bor?", subjects.get(2)));
//                                        answerList.add(new Answer("A.114", false, questions.get(1)));
//                                        answerList.add(new Answer("B.116", false, questions.get(1)));
//                                        answerList.add(new Answer("C.118", true, questions.get(1)));
//
//                                        questions.add(new Question("Atom so'zining ma'nosi nima?", subjects.get(2)));
//                                        answerList.add(new Answer("A.bo'linmas", true, questions.get(2)));
//                                        answerList.add(new Answer("B.yadro", false, questions.get(2)));
//                                        answerList.add(new Answer("C.ko'payuvchi", false, questions.get(2)));
//
//                                    case 3:
//                                        questions.add(new Question("Quyidagilar orasidan sifatni aniqlang?", subjects.get(3)));
//                                        answerList.add(new Answer("A.kelyapti", false, questions.get(0)));
//                                        answerList.add(new Answer("B.kitob", false, questions.get(0)));
//                                        answerList.add(new Answer("C.qizil", true, questions.get(0)));
//
//                                        questions.add(new Question("Bir-biriga zid ma'noli so'zlarni toping?", subjects.get(3)));
//                                        answerList.add(new Answer("A.olma-shaftoli", false, questions.get(1)));
//                                        answerList.add(new Answer("C.jirafa-kuchuk", false, questions.get(1)));
//                                        answerList.add(new Answer("D.katta-kichik", true, questions.get(1)));
//
//                                        questions.add(new Question("O'zbek tili qaysi tillar turkumiga kiradi?", subjects.get(3)));
//                                        answerList.add(new Answer("A.forsiy", false, questions.get(2)));
//                                        answerList.add(new Answer("B.turkiy", false, questions.get(2)));
//                                        answerList.add(new Answer("C.arabcha", false, questions.get(2)));
//
//                                    case 4:
//                                        System.out.println("Ushbu so'zlarning o'zbekchasini toping");
//                                        questions.add(new Question("diary - ?", subjects.get(3)));
//                                        answerList.add(new Answer("A.daftar", false, questions.get(2)));
//                                        answerList.add(new Answer("B.kundalik", true, questions.get(2)));
//                                        answerList.add(new Answer("C.oyna", false, questions.get(2)));
//
//                                        questions.add(new Question("apple - ?", subjects.get(3)));
//                                        answerList.add(new Answer("A.olma", true, questions.get(2)));
//                                        answerList.add(new Answer("B.anor", false, questions.get(2)));
//                                        answerList.add(new Answer("C.shaftoli", false, questions.get(2)));
//
//                                        questions.add(new Question("camel - ?", subjects.get(3)));
//                                        answerList.add(new Answer("A.ot", false, questions.get(2)));
//                                        answerList.add(new Answer("B.sigir", false, questions.get(2)));
//                                        answerList.add(new Answer("C.tuya", true, questions.get(2)));
//
//                                    case 5:
//                                        questions.add(new Question("Birinchi jahon urushi qachon tugagan?", subjects.get(3)));
//                                        answerList.add(new Answer("A.1916", false, questions.get(2)));
//                                        answerList.add(new Answer("B.1918", true, questions.get(2)));
//                                        answerList.add(new Answer("C.1921", false, questions.get(2)));
//
//                                        questions.add(new Question("Amir Temurning loy jangi qachon bo'lqan?", subjects.get(3)));
//                                        answerList.add(new Answer("A.1365", true, questions.get(2)));
//                                        answerList.add(new Answer("B.1349", false, questions.get(2)));
//                                        answerList.add(new Answer("C.1352", false, questions.get(2)));
//
//                                        questions.add(new Question("jaloliddin Manguberdi qachon tavallud topgan?", subjects.get(3)));
//                                        answerList.add(new Answer("A.1202", false, questions.get(2)));
//                                        answerList.add(new Answer("B.1201", false, questions.get(2)));
//                                        answerList.add(new Answer("C.1199", true, questions.get(2)));

                        }
                }
        }
        List<User> userList = new ArrayList<>();
        userList.add(new User("Xudoyor Quchqarov", roles.get(0)));
        userList.add(new User("Xudoyor ", roles.get(0)));
        userList.add(new User("Quchqarov", roles.get(0)));


    }
        } else
            System.out.println("Tizimdan muvaffaqiyatli chiqdingiz!");
        return;
    }
}
