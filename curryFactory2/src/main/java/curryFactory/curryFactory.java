/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curryFactory;

/**
 *
 * @author oontoon
 */
public class curryFactory {

  public void getMenu(int menuI, int extra1, int extra2) {
    
    mainMenu selectedMenu;
    mainMenu selection1;
    mainMenu selection2;
    mainMenu chickenCurry = new chickenCurry();
    mainMenu porkCurry = new porkCurry();

               
    if(menuI==1){
        selectedMenu = chickenCurry;
        if(extra1==1){
            selection1 = new extraRice(selectedMenu);
            System.out.println("กด 1 เพื่อเพิ่มไข่ดาว, กด 2 เพื่อข้าม");
            if(extra2==1){
                
                selection2 = new omelette(selection1);
            }
            else {
                selection2 = selection1;
            }
        } else {
            selection1 = new omelette(selectedMenu);
            System.out.println("กด 1 เพื่อเพิ่มข้าว, กด 2 เพื่อข้าม");
            if(extra2==1){
                selection2 = new extraRice(selection1);
            }
            else {
                selection2 = selection1;
            }
        }
    } else{
        selectedMenu = porkCurry;
        if(extra1==1){
            selection1 = new extraRice(selectedMenu);
            System.out.println("กด 1 เพื่อเพิ่มไข่ดาว, กด 2 เพื่อข้าม");
            if(extra2==1){
                selection2 = new omelette(selection1);
            }
            else {
                selection2 = selection1;
            }
        } else {
            selection1 = new omelette(selectedMenu);
            System.out.println("กด 1 เพื่อเพิ่มข้าว, กด 2 เพื่อข้าม");
            if(extra2==1){
                selection2 = new extraRice(selection1);
            }
            else {
                selection2 = selection1;
            }
        }
    }
    
    selection2.assemble(0);
    System.out.println();
  }
}
