package com.itheima.utils;

import com.itheima.bean.Person;
import com.itheima.bean.Student;
import com.itheima.bean.Teacher;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Util {
    //学生id
    public static int sid = 0;
    //老师id
    public static int tid = 0;

    /**
     * 该方法用于打印所有的单个对象
     *
     * @param p 接收要打印的对象
     */
    public static void showPerson(Person p) {
        System.out.println("**********************************************************");
        System.out.println("编号\t姓名\t性别\t生日\t\t\t年龄\t描述");
        System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getSex() + "\t" + p.getBirthday() + "\t" + p.getAge() + "\t" + p.descript());
        System.out.println("**********************************************************");
    }

    /**
     * 该方法用打印所有的学生对象信息
     *
     * @param array 接收存储所有学生对象的集合
     */
    public static void showAllStudent(ArrayList<Student> array) {
        System.out.println("**********************************************************");
        System.out.println("编号\t姓名\t性别\t生日\t\t\t年龄\t描述");
        //遍历集合获取每一个学员
        for (int i = 0; i < array.size(); i++) {
            //获取学员对象
            Student s = array.get(i);
            System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getSex() + "\t" + s.getBirthday() + "\t" + s.getAge() + "\t" + s.descript());
        }
        System.out.println("**********************************************************");
    }

    /**
     * 该方法用打印所有的教师对象信息
     *
     * @param arrayT 接收存储所有教师对象的集合
     */
    public static void showAllTeacher(ArrayList<Teacher> arrayT) {
        System.out.println("**********************************************************");
        System.out.println("编号\t姓名\t性别\t生日\t\t\t年龄\t描述");
        //遍历集合获取每一个教师
        for (int i = 0; i < arrayT.size(); i++) {
            //获取教师对象
            Teacher t = arrayT.get(i);
            System.out.println(t.getId() + "\t" + t.getName() + "\t" + t.getSex() + "\t" + t.getBirthday() + "\t" + t.getAge() + "\t" + t.descript());
        }
        System.out.println("**********************************************************");
    }


    /**
     * 该方法用于将生日转成对应的年龄
     *
     * @param birthday 当前是生日
     * @return 返回当前生日对应的年龄
     */
    //1.参数:String的生日(yyyy-MM-dd)
    public static int birthdayToAge(String birthday) {

        //2.准备age记录年龄，初始值-1
        int age = -1;
        //3.String->Date->生日Calendar
        Calendar birCal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birDate = null;
        try {
            birDate = sdf.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        birCal.setTime(birDate);
        //4.当前日期Calendar
        Calendar nowCal = Calendar.getInstance();
        //5.计算年龄
        //if(生日日期<当前日期){
        if (birCal.before(nowCal)) {
            //获取生日好当前日期对应的年/月/日。
            int birYear = birCal.get(Calendar.YEAR);
            int nowYear = nowCal.get(Calendar.YEAR);
            int birMonth = birCal.get(Calendar.MONTH);
            int nowMonth = nowCal.get(Calendar.MONTH);
            int birDay = birCal.get(Calendar.DAY_OF_MONTH);
            int nowDay = nowCal.get(Calendar.DAY_OF_MONTH);
            //    age= 当前年-生日的年;
            age = nowYear - birYear;
            //    (如果当前的月<生日的月)   || (如果当前的月=生日的月 && 当前日<生日日)    age--
            if ((nowMonth < birMonth) || (nowMonth == birMonth && nowDay < birDay)) {
                age--;
            }
        }
        //6.返回结果
        return age;
    }

    /**
     * 该方法用于获取指定序号的学生对象
     * @param array
     * @param sid
     * @return
     */
    public static int findIndex(ArrayList<Student> array, String sid) {
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getId().equals(sid)){
                index=i;
                //找到了就不找了
                break;
            }
        }
        return index;
    }

    /**
     * 该方法用于获取指定序号的教师对象
     * @param arrayT
     * @param tid
     * @return
     */
    public static int findIndexT(ArrayList<Teacher> arrayT, String tid) {
        int index = -1;
        for (int i = 0; i < arrayT.size(); i++) {
            Teacher t = arrayT.get(i);
            if (t.getId().equals(tid)){
                index=i;
                //找到了就不找了
                break;
            }
        }
        return index;
    }
}
