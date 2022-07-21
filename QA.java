public class QA extends Person{
    int garade;
    String school;

    public QA(String name, int age, double salary, String car, int garade, String school) {
        super(name, age, salary, car);
        this.garade = garade;
        this.school = school;
    }

    void startTest (){
        System.out.println("starting new tset.........");
    }

    void reportBug(){
        System.out.println("hahahahahaha i found a bug");
    }

    @Override
    public String toString() {
        return "QA{" +
                "garade=" + garade +
                ", school='" + school + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car='" + car + '\'' +
                '}';
    }
}
