public class Animal implements Comparable<Animal>{
    private String kind;
    private String gender;
    private int age;
    public Animal() {

    }

    public Animal(String kind, String gender, int age) {
        this.kind = kind;
        this.gender = gender;
        this.age = age;
    }
    //getter
    public void setKind(String kind) {
        this.kind = kind;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //setter
    public String getKind() {
        return kind;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    //比较年龄
    public int compareTo(Animal ani) {
        if(age > ani.getAge()) {
            return 1;
        }else if(age == ani.getAge()) {
            return 0;
        }
        return -1;
    }
    public String toString() {
        return "种类 " + kind + ", 性别" + gender + ", 年龄 " + age ;
    }

}

