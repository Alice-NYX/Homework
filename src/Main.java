import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println();
            System.out.println("===================================");
            System.out.println("===========动物信息管理系统 ==========");
            System.out.println("=========请选择您要进行的操作 =========");
            System.out.println("=        1 增加动物信息              =");
            System.out.println("=        2 删除动物信息              =");
            System.out.println("=        3 修改动物信息              =");
            System.out.println("=        4 查询动物信息              =");
            System.out.println("=        5 按动物年龄排序            =");
            System.out.println("=        6 退出系统                 =");
            System.out.println("====================================");
            System.out.println("请输入您的选择");

            int choose;
            if (sc.hasNextInt()) {
                choose = sc.nextInt();
                if (choose > 0 && choose < 7) {
                    Animal ani = new Animal();
                    Function fu = new Function();
                    switch (choose) {
                        case 1:
                            fu.add(fu.list);
                            break;
                        case 2:
                            fu.delete(fu.list);
                            break;
                        case 3:
                            fu.update(fu.list);
                            break;
                        case 4:
                            fu.query(fu.list);
                            break;
                        case 5:
                            fu.sort(fu.list);
                            break;
                        case 6:
                            System.out.println("成功退出……");
                            System.out.println("欢迎下次使用");
                            System.exit(0);
                            break;
                    }
                } else {
                    System.out.println("请正确输入");
                }

            } else {
                System.out.println("请您输入正确的选项");
            }
        }
    }
}

