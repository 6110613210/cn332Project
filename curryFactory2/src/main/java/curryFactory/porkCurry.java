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
class porkCurry implements mainMenu {
  int price;
  @Override
  public void assemble(int extraPrice) {
    price = 100+ extraPrice;
    System.out.println("Curry type : pork Curry (+100)");
    System.out.println("Total Price : " + price);
  }
}
