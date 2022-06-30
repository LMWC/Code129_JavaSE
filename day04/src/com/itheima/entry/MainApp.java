package com.itheima.entry;

import com.itheima.bean.Student;
import com.itheima.bean.Teacher;
import com.itheima.utils.Util;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    //假的用户名和密码
    //String userName = "abc";
    //String password = "123456";

    //将集合放到成员位置，整个类中都可以直接使用， 定义的方法，就不用提供形式参数了。
    private static ArrayList<Student> array = new ArrayList<>();
    private static ArrayList<Teacher> arrayT = new ArrayList<>();

    //将Scanner对象定义到成员位置，所有的地方都可以直接使用，就不用再每个方法中定义Scanner对象.
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //输入用户名和密码（用户名和密码都相同，则登录成功，自己尝试）


        //将集合定义到main方法里，将来需要使用这个集合的方法，都要将ArrayList<Student>作为参数使用。
        //ArrayList<Student> array = new ArrayList<>();
        while (true) {
            System.out.println("1.学生管理系统  2.教师管理系统  3.退出");
            System.out.println("请输入您的选择...");
            //Scanner sc = new Scanner(System.in);
            //sc.nextInt();//录入的是数值
            //sc.next();//录入的是字符串  识别的标记是空格或回车   你   好换行  只能拿到“你”
            //sc.nextLine();//录入的是字符串  识别的标记是回车   你   好换行  能拿到“你   好”
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    //有一个方法，负责学生管理系统
                    studentManager();
                    break;
                case "2":
                    //有一个方法，负责教师管理系统
                    teacherManager();
                    break;
                case "3":
                    System.out.println("退出,下次再见");
                    //结束程序
                    //System.exit(0);//慎重使用
                    return;
                default:
                    System.out.println("您输入的选项有误");
            }
        }

    }

    //学生管理系统
    public static void studentManager() {
        while (true) {
            System.out.println("--------------------------------------------------------");
            System.out.println("1.添加学员 2.修改学员 3.删除学员 4.查询学员 5.返回 ");
            System.out.println("请输入功能序号");
            //Scanner sc = new Scanner(System.in);
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    updateStudent();
                    break;
                case "3":
                    deleteStudent();
                    break;
                case "4":
                    findAllStudent();
                    break;
                case "5":
                    System.out.println("返回");
                    return;
                default:
                    System.out.println("您输入的选项有误");
            }
        }
    }

    //教师管理系统
    public static void teacherManager() {
        while (true) {
            System.out.println("--------------------------------------------------------");
            System.out.println("1.添加教师 2.修改教师 3.删除教师 4.查询教师 5.返回 ");
            System.out.println("请输入功能序号");
            //Scanner sc = new Scanner(System.in);
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    addTeacher();
                    break;
                case "2":
                    updateTeacher();
                    break;
                case "3":
                    deleteTeacher();
                    break;
                case "4":
                    findAllTeacher();
                    break;
                case "5":
                    System.out.println("返回");
                    return;
                default:
                    System.out.println("您输入的选项有误");
            }
        }
    }

    /**
     * 该方法用于更新集合中指定学号的学员信息
     */
    public static void updateStudent() {
        System.out.println("请输入要修改的学员ID");
        //Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();
        //判断学号是否存在
        //1.获取学号对应的学员在集合中的位置
        int index = Util.findIndex(array, sid);
        //2.根据得到的位置，判断该学号是否存在(如果不存在，返回-1)
        if (index == -1) {
            //没找到
            System.out.println("【错误】学员ID:" + sid + "没找到");
        } else {
            //找到了
            System.out.println("【查询结果】要修改的学员信息");
            //要修改的学员对象
            Student s = array.get(index);
            Util.showPerson(s);
            //录入新的学员信息
            System.out.println("请输入新姓名");
            String name = sc.nextLine();
            System.out.println("请输入新性别");
            String sex = sc.nextLine();
            System.out.println("请输入新生日");
            String birthday = sc.nextLine();
            //获取新的年龄
            int age = Util.birthdayToAge(birthday);
            //用新信息替换旧信息
            //方式1:
            /*//根据新的信息，获取新的学生对象
            Student newStu = new Student(sid, name, birthday, age, sex);
            //使用新学生对象替换旧学生对象
            array.set(index, newStu);*/

            //方式2:推荐
            //获取要修改的学员对象
            s.setName(name);
            s.setAge(age);
            s.setBirthday(birthday);
            s.setSex(sex);
            System.out.println("【成功】学员信息修改成功");

        }
    }

    /**
     * 该方法用于更新集合中指定工号的教师信息
     */
    public static void updateTeacher() {
        System.out.println("请输入要修改的教师ID");
        //Scanner sc = new Scanner(System.in);
        String tid = sc.nextLine();
        //判断学号是否存在
        //1.获取学号对应的学员在集合中的位置
        int index = Util.findIndexT(arrayT, tid);
        //2.根据得到的位置，判断该学号是否存在(如果不存在，返回-1)
        if (index == -1) {
            //没找到
            System.out.println("【错误】教师ID:" + tid + "没找到");
        } else {
            //找到了
            System.out.println("【查询结果】要修改的教师信息");
            //要修改的教师对象
            Teacher t = arrayT.get(index);
            Util.showPerson(t);
            //录入新的学员信息
            System.out.println("请输入新姓名");
            String name = sc.nextLine();
            System.out.println("请输入新性别");
            String sex = sc.nextLine();
            System.out.println("请输入新生日");
            String birthday = sc.nextLine();
            //获取新的年龄
            int age = Util.birthdayToAge(birthday);
            //用新信息替换旧信息
            //方式1:
            /*//根据新的信息，获取新的学生对象
            Student newStu = new Student(sid, name, birthday, age, sex);
            //使用新学生对象替换旧学生对象
            array.set(index, newStu);*/

            //方式2:推荐
            //获取要修改的教师对象
            t.setName(name);
            t.setAge(age);
            t.setBirthday(birthday);
            t.setSex(sex);
            System.out.println("【成功】教师信息修改成功");

        }
    }

    /**
     * 该方法用于删除指定的学号的学员
     */
    public static void deleteStudent() {
        System.out.println("请输入要删除的学员ID");
        //Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();
        //判断学号是否存在
        //1.获取学号对应的学员在集合中的位置
        int index = Util.findIndex(array, sid);
        //2.根据得到的位置，判断该学号是否存在(如果不存在，返回-1)
        if (index == -1) {
            //没找到
            System.out.println("【错误】学员ID:" + sid + "没找到");
        } else {
            //找到了
            System.out.println("【查询结果】要删除的学员信息");
            Student s = array.get(index);
            Util.showPerson(s);
            while (true) {
                System.out.println("【确认】您要删除这条信息么(y/n)?");
                String choose = sc.nextLine();
                if (choose.equals("n")) {
                    System.out.println("【取消】操作被取消");
                    break;
                } else if (choose.equals("y")) {
                    array.remove(index);
                    System.out.println("【成功】数据已被删除");
                    break;
                } else {
                    System.out.println("您的输入有误");
                }
            }
        }
    }

    /**
     * 该方法用于删除指定的工号的教师
     */
    public static void deleteTeacher() {
        System.out.println("请输入要删除的教师ID");
        //Scanner sc = new Scanner(System.in);
        String tid = sc.nextLine();
        //判断工号是否存在
        //1.获取工号对应的教师在集合中的位置
        int index = Util.findIndexT(arrayT, tid);
        //2.根据得到的位置，判断该学号是否存在(如果不存在，返回-1)
        if (index == -1) {
            //没找到
            System.out.println("【错误】教师ID:" + tid + "没找到");
        } else {
            //找到了
            System.out.println("【查询结果】要删除的教师信息");
            Teacher t = arrayT.get(index);
            Util.showPerson(t);
            while (true) {
                System.out.println("【确认】您要删除这条信息么(y/n)?");
                String choose = sc.nextLine();
                if (choose.equals("n")) {
                    System.out.println("【取消】操作被取消");
                    break;
                } else if (choose.equals("y")) {
                    arrayT.remove(index);
                    System.out.println("【成功】数据已被删除");
                    break;
                } else {
                    System.out.println("您的输入有误");
                }
            }
        }
    }

    /**
     * 该方法用于给集合中添加学生对象
     */
    public static void addStudent() {
        //Scanner sc = new Scanner(System.in);
        System.out.println("请输入要添加的学员信息");
        System.out.println("请输入姓名");
        String name = sc.nextLine();
        System.out.println("请输入性别");
        String sex = sc.nextLine();
        System.out.println("请输入生日(格式:2022-12-12)");
        String birthday = sc.nextLine();
        String sid = Util.sid + "";
        int age = Util.birthdayToAge(birthday);
        //创建学生对象
        Student s = new Student(sid, name, birthday, age, sex);
        //将学生对象添加到集合中
        array.add(s);
        System.out.println("【成功】学员信息添加成功");
        Util.sid++;
    }

    /**
     * 该方法用于给集合中添加教师对象
     */
    public static void addTeacher() {
        //Scanner sc = new Scanner(System.in);
        System.out.println("请输入要添加的教师信息");
        System.out.println("请输入姓名");
        String name = sc.nextLine();
        System.out.println("请输入性别");
        String sex = sc.nextLine();
        System.out.println("请输入生日(格式:2022-12-12)");
        String birthday = sc.nextLine();
        String tid = Util.tid + "";
        int age = Util.birthdayToAge(birthday);
        //创建教师对象
        Teacher t = new Teacher(tid, name, birthday, age, sex);
        //将教师对象添加到集合中
        arrayT.add(t);
        System.out.println("【成功】教师信息添加成功");
        Util.tid++;
    }

    /**
     * 该方法用于查询集合中所有的学生数据
     */
    public static void findAllStudent() {
        //判断是否有数据
        if (array.size() == 0) {
            //无数据
            System.out.println("无数据");
            return;
        }

        System.out.println("【查询结果】");
        Util.showAllStudent(array);
    }

    /**
     * 该方法用于查询集合中所有的教师数据
     */
    public static void findAllTeacher() {
        //判断是否有数据
        if (arrayT.size() == 0) {
            //无数据
            System.out.println("无数据");
            return;
        }

        System.out.println("【查询结果】");
        Util.showAllTeacher(arrayT);
    }
}
