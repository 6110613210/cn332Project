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
class extraRice extends curryDecorator {
  public extraRice(mainMenu c) {
    super(c);
  }
  
  @Override
  public void assemble(int extraPrice) {
    super.assemble(10);
    System.out.println("Extra rice added (+10)");
  }
}
