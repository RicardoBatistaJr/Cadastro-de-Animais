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
public class Cachorro extends Animal{
    String raca;
    boolean rabo;
    
    public  Cachorro(String cnome, String capelido, double cpeso, String cid,String craca, boolean crabo ){
    super(cnome, capelido,cpeso,cid);
    raca = craca;
    rabo = crabo;
    }
    public void setRabo(boolean trabo){
        rabo = trabo;
    }
    public void setRaca(String traca){
        raca = traca;
    }
    
    public boolean getRabo(){
        return rabo;
    }
    
    public String getRaca(){
        return raca;
    }
    public void latir(){
        System.out.println("Au Auuu");
    }
    
    public void brincar(){
        System.out.println("Pega a bola");
    }
            
}
