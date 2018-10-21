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
public class Gato extends Animal {

    String raca, cor;

    public Gato(String gnome, String gapelido, double gpeso, String gid, String graca, String gcor) {
        super(gnome, gapelido, gpeso, gid);
        raca = graca;
        cor = gcor;
    }

    public void setRaca(String Traca) {
        raca = Traca;
    }

    public void setCor(String Tcor) {
       cor = Tcor;
    }
    
    public String getRaca(){
        return raca;
    }
    
    public String getCor(){
        return cor;
    }

    public void miar() {
        System.out.println("Miaau");
    }

    public void escalar() {
        System.out.println("Spiderman");
    }

}
