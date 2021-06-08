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
class omelette extends curryDecorator {
  public omelette(mainMenu c) {
    super(c);
  }
  @Override
  public void assemble(int extraPrice) {
    super.assemble(20);
    System.out.println("Omelette added (+20)");
     
  }
}