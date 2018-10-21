/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Junior
 */
public class Peixe extends Animal {

    String cor;

    public Peixe(String pnome, String papelido, double ppeso, String pid, String pcor) {
        super(pnome, papelido, ppeso, pid);
        cor = pcor;
    }

    public void nadar() {
        System.out.println("Glub glub");
    }

    public void setCor(String tcor) {
        cor = tcor;
    }

    public String getCor() {
        return cor;
    }
}
