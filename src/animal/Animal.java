/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

public class Animal {
    String apelido,nome;
    String id;
    double peso;
    
    Animal(){
    nome = "";
    apelido = "";
    peso = 0.0;
    id = "";
    }
    
    public Animal(String tnome, String tapelido, double tpeso, String tid){
        nome = tnome;
        apelido = tapelido;
        peso = tpeso;
        id = tid;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
    
    
    
}
