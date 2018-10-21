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
public class Util {
   public static Animal criar(String tnome,String tapelido, double tpeso, String tid){
       return  new Animal(tnome, tapelido, tpeso,tid);
   }
   
   public static Cachorro criar(String tnome,String tapelido, double tpeso, String tid, String traca, boolean trabo){
       return new Cachorro(tnome,tapelido,tpeso,tid,traca,trabo);
   }
  
   public static Gato criar(String gnome, String gapelido, double gpeso, String gid, String graca, String gcor){
       return new Gato(gnome,gapelido,gpeso,gid,graca,gcor);
   }
   
   public static Peixe criar(String pnome, String papelido, double ppeso, String pid, String pcor ){
       return new Peixe(pnome, papelido,ppeso,pid,pcor);
   }
}
