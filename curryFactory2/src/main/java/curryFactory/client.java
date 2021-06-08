package curryFactory;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author oontoon
 */
public class client {

    public static void main(String[] args) {
        curryFactory clientFactory;
        clientFactory = new curryFactory();
        Scanner myInput = new Scanner(System.in);
        //=======================reg======================================================
        register r = new register();
        boolean loginstatus = false;
        System.out.println("ยินดีต้อนรับสู่ Curry Factory กรุณาเข้าสู่ระบบก่อนสั่งอาหาร");
        while (loginstatus == false) {
            System.out.println("กด 1 เพื่อ login,กด 2 เพื่อ register");
            int regI = myInput.nextInt();
            if (regI == 1) {
                System.out.println("กรุณากรอก username");
                String username = myInput.next();
                System.out.println("กรุณากรอก password");
                String password = myInput.next();
                if (r.checkuser(username, password)) {
                    System.out.println("login sucess");
                    loginstatus = true;
                } else {
                    System.out.println("ไม่มีผู้ใช้งานนี้");
                }
            } else if(regI == 2) {
                register reg;
                System.out.println("กรุณากรอก username ที่ต้องการสมัคร");
                String username = myInput.next();
                System.out.println("กรุณากรอก password ที่ต้องการสมัคร");
                String password = myInput.next();
                r.regis(username, password);
                System.out.println("Register sucess. Plese login");
            }
            else{System.out.println("Unknow command");}
        }
//=======================================================================================

        System.out.println("กด 1 เพื่อเลือกเมนู แกงกะหรี่ไก่");
        System.out.println("กด 2 เพื่อเลือกเมนู แกงกะหรี่หมู");
        int menuInput = myInput.nextInt();
        System.out.println("กรุณาเลือก Topping : กด 1 เพื่อเพิ่มข้าว, กด 2 เพื่อเพิ่มไข่เจียว");
        int extra1 = myInput.nextInt();
        int extra2 = myInput.nextInt();

        clientFactory.getMenu(menuInput, extra1, extra2);

    }
}
