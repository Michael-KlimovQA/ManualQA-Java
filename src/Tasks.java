public class Tasks {
    void years(int age){
        if (age < 0) {
            System.out.println("Неверный возраст");
        } else if (age < 18) {
            System.out.println("Вы ещё несовершеннолетний");
        } else {
            System.out.println("Вы стали взрослым");
        }
    }
    void divide(int a, int b) {
        if (a % b == 0) {
            System.out.println("Делится");
        } else {
            System.out.println("Делится с остатком " + a % b);
        }
    }
    void wage(int years, double salary){
        if (years < 3 && 0 < years ) {
            salary = salary * 1.1;
            System.out.println(salary);
        } else {
            salary = salary * 1.3;
            System.out.println(salary);
        }
        if (salary < 4000) {
            salary += 1000;
            System.out.println("Зарплата меньше 4000, с учётом премии = " + salary);
        } else {
            salary += 500;
            System.out.println("Зарплата больше 4000, с учётом премии = " + salary);
        }
    }
}