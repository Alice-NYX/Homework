import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Collections;

public class Function {
    static List<Animal> list = new ArrayList<Animal>();

    Scanner sc = new Scanner(System.in);

    // 增加动物信息
    public void add(List<Animal> list) {

        while (true) {
            System.out.println("请输入你要添加的动物的种类");
            String kind=sc.next();
            System.out.println("请输入你要添加的动物的性别");
            String gender = sc.next();
            System.out.println("请输入你要添加的动物的年龄");
            Scanner sc1 = new Scanner(System.in);
            while (true) {
                if (sc1.hasNextInt()) {
                    int age = sc1.nextInt();
                    list.add(new Animal(kind, gender, age));
                    break;
                } else {
                    System.out.println("输入错误");
                }
            }
            System.out.println("动物信息添加成功");
            System.out.println("是否继续执行添加操作(y/n)");
            String result = sc.next();
            if (result.equalsIgnoreCase("n") || result.equalsIgnoreCase("y")) {
                if (result.equalsIgnoreCase("n")) {
                    break;
                }
            }

        }
    }

    // 删除动物信息
    public void delete(List<Animal> list) {
        if (list.size() != 0) {
            a: while (true) {
                query(list);
                System.out.println("请输出你要删除的动物的种类");
                String str = sc.next();
                ListIterator<Animal> l = list.listIterator();
                while (l.hasNext()) {
                    Animal ani = l.next();
                    if (ani.getKind().equals(str)) {
                        l.remove();
                        System.out.println("删除成功!");
                        break a;
                    }

                }
                System.out.println("请重新输入");
            }
        } else {
            System.out.println("无动物信息");
        }
    }

    // 修改动物信息
    public void update(List<Animal> list) {
        if (list.size() != 0) {
            a: while (true) {
                query(list);
                System.out.println("请输入要修改动物的种类：");
                String kind = sc.next();
                ListIterator<Animal> l = list.listIterator();
                while (l.hasNext()) {
                    Animal ani = l.next();
                    if (ani.getKind().equals(kind)) {
                        System.out.println("请输入本种类修改后动物的性别");
                        String gender = sc.next();
                        System.out.println("请输入本种类修改后动物的年龄");
                        if (sc.hasNextInt()) {  //判断是否为数字
                            int age = sc.nextInt();
                            ani.setGender(gender);
                            ani.setAge(age);
                            break a;
                        } else {
                            System.out.println("请正确输入动物种类");
                        }
                    }
                }
                System.out.println("无效，重新输入");
            }
        } else {
            System.out.println("无动物信息");
        }

    }

    // 查询动物信息
    public void query(List<Animal> list) {
        if (list.size() != 0) {
            System.out.println("=============动物信息==============");
            for (Animal ani : list) {
                System.out.println(ani);
            }
            System.out.println("=================================");
        } else {
            System.out.println("无动物信息");
        }
    }

    //排序动物年龄
    public void sort(List<Animal> list){
        System.out.println("以下是按年龄排序后的动物信息");
        Collections.sort(list);
        System.out.println(list);

    }
}


