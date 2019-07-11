package demo;

public class animal {
    public String age;
    public String weight;
    public String run;
    public String eat;

    // 构造方法
    //无参
    public animal() {

    }
    //有参
    public animal(String weight, String age, String run, String eat) {
        this.weight = weight;
        this.age = age;
        this.run=run;
        this.eat=eat;
    }
    //成员方法
    public void setAge(String age) {
        this.age = age;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getAge() {
        return age;
    }

    public String getRun() {
        return run;
    }

    public String getWeight() {
        return weight;
    }

    public String getEat() {
        return eat;
    }
}


