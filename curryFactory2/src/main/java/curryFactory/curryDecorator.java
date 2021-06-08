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
class curryDecorator implements mainMenu {
  protected mainMenu menu;
  
  public curryDecorator(mainMenu c) {
    this.menu = c;
  }

  @Override
  public void assemble(int extraPrice) {
    this.menu.assemble(extraPrice);
  }
}









