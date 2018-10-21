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
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aplicacao {

    public static Animal cadastrarAnimal() {
        String tnome = JOptionPane.showInputDialog("Insira o nome do animal");
        String tapelido = JOptionPane.showInputDialog("Insira o apelido do animal");
        double tpeso = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso do animal"));
        String tid = JOptionPane.showInputDialog("Insira o ID do animal");
        Animal an = Util.criar(tnome, tapelido, tpeso, tid);
        return an;
    }

    public static Cachorro cadastrarCachorro() {
        String tnome = JOptionPane.showInputDialog("Insira o nome do cachorro");
        String tapelido = JOptionPane.showInputDialog("Insira o apelido do cachorro");
        double tpeso = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso do cachorro"));
        String tid = JOptionPane.showInputDialog("Insira o ID do cachorro");
        String traca = JOptionPane.showInputDialog("Insira a raça do cachorro");
        boolean tbool = Boolean.parseBoolean(JOptionPane.showInputDialog("Insira se tem rabo"));
        Cachorro ch = Util.criar(tnome, tapelido, tpeso, tid, traca, tbool);
        return ch;
    }

    public static Gato cadastrarGato() {
        String tnome = JOptionPane.showInputDialog("Insira o nome do Gato");
        String tapelido = JOptionPane.showInputDialog("Insira o apelido do Gato");
        double tpeso = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso do Gato"));
        String tid = JOptionPane.showInputDialog("Insira o ID do Gato");
        String traca = JOptionPane.showInputDialog("Insira a raça do Gato");
        Gato gt = Util.criar(tnome, tapelido, tpeso, tid, traca, tnome);
        return gt;
    }

    public static Peixe cadastrarPeixe() {
        String tnome = JOptionPane.showInputDialog("Insira o nome do Peixe");
        String tapelido = JOptionPane.showInputDialog("Insira o apelido do Peixe");
        double tpeso = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso do Peixe"));
        String tid = JOptionPane.showInputDialog("Insira o ID do peixe");
        String tcor = JOptionPane.showInputDialog("Insira o apelido do Peixe");
        Peixe px = Util.criar(tnome, tapelido, tpeso, tid, tcor);
        return px;
    }
// [ METODOS PARA IMPRIMIR]

    public static void imprimeAnimal(Animal obj) {
        System.out.println("Nome: " + obj.getNome() + " Apelido: " + obj.getApelido() + " Id: " + obj.getId() + " Peso: " + obj.getPeso());
    }

    public static void imprimeCachorro(Cachorro obj) {
        System.out.println("Nome: " + obj.getNome() + " Apelido: " + obj.getApelido() + " Id: " + obj.getId() + " Peso: " + obj.getPeso() + " Raça: " + obj.getRaca() + " Rabo: " + obj.getRabo());
    }

    public static void imprimeGato(Gato obj) {
        System.out.println("Nome: " + obj.getNome() + " Apelido: " + obj.getApelido() + " Id: " + obj.getId() + " Peso: " + obj.getPeso() + " Raça: " + obj.getRaca() + " Cor: " + obj.getCor());
    }

    public static void imprimePeixe(Peixe obj) {
        System.out.println("Nome: " + obj.getNome() + " Apelido: " + obj.getApelido() + " Id: " + obj.getId() + " Peso: " + obj.getPeso() + " Cor: " + obj.getCor());
    }

    public static void checagemImprimir(Animal x) { // Faz a conversão do OBJ Animal e chama a classe imprimir
        if (x instanceof Cachorro) {
            imprimeCachorro(((Cachorro) x));
        } else if (x instanceof Gato) {
            imprimeGato(((Gato) x));
        } else if (x instanceof Peixe) {
            imprimePeixe(((Peixe) x));
        } else if (x instanceof Animal) {
            imprimeAnimal(x);
        }

    }

//=======================[ MAIN STARTS ]============================================
    public static void main(String[] args) {
        int opcao = 0;
        boolean anprim = true; // Variável para checar se é o primeiro animal cadastrado.
        ArrayList banco = new ArrayList();

        while (opcao == 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1)Cad. Ani. / 2) Cad. Cach. / 3) Cad. Gato / 4) Cad. Peixe / 5) Cons. ID / 6) Sair"));

            switch (opcao) {
                case 1:
                    Animal a = cadastrarAnimal();
                    if (anprim == true) {
                        System.out.println("Animal cadastrado com sucesso");
                        banco.add(a);
                        anprim = false;
                    } else {
                        for (int x = 0; x < banco.size(); x++) {
                            Animal check = (Animal) banco.get(x);
                            if (check.getId().equals(a.getId())) {
                                System.out.println("Animal ID Repetido");
                                 break;
                            } else {
                                System.out.println("Animal cadastrado com sucesso");
                                banco.add(a);
                                 break;
                            }
                        }
                    }

                    opcao = 0;
                    break;

                case 2:

                    Cachorro c = cadastrarCachorro();
                    if (anprim == true) {
                        System.out.println("Cachorro Cadastrado com sucesso");
                        banco.add(c);
                        anprim = false;
                    } else {
                        for (int x = 0; x < banco.size(); x++) {
                            Animal check = (Animal) banco.get(x);
                            if (check.getId().equals(c.getId())) {
                                System.out.println("Cachorro ID já cadastrado");
                                 break;
                            } else {
                                System.out.println("Cachorro Cadastrado com sucesso");
                                banco.add(c);
                                break;
                            }
                        }
                    }
                    opcao = 0;
                    break;

                case 3:
                    Gato g = cadastrarGato();
                    if (anprim == true) {
                        System.out.println("Gato Animal cadastrado com sucesso");
                        banco.add(g);
                        anprim = false;
                    } else {
                        for (int x = 0; x < banco.size(); x++) {
                            Animal check = (Animal) banco.get(x);
                            if (check.getId().equals(g.getId())) {
                                System.out.println("Gato ID já cadastrado");
                                break;
                            } else {
                                System.out.println("Gato Cadastrado com sucesso");
                                banco.add(g);
                                break;
                            }
                        }
                    }
                    opcao = 0;
                    break;

                case 4:
                    Peixe p = cadastrarPeixe();
                    if (anprim == true) {
                        System.out.println("Peixe Animal cadastrado com sucesso");
                        banco.add(p);
                        anprim = false;
                    } else {
                        for (int x = 0; x < banco.size(); x++) {
                             Animal check = (Animal) banco.get(x);
                            if (check.getId().equals(p.getId())) {
                                System.out.println("Peixe ID já cadastrado");
                                break;
                            } else {
                                System.out.println("Peixe Cadastrado com sucesso");
                                banco.add(p);
                                break;
                            }
                        }
                    }
                    opcao = 0;
                    break;

                case 5:
                    String busca = JOptionPane.showInputDialog("Insira o ID de Pesquisa");
                    for (int i = 0; i < banco.size(); i++) {
                        Animal ancheck;
                        ancheck = (Animal) banco.get(i);
                        if (ancheck.getId().equals(busca)) {
                            checagemImprimir(ancheck);
                        } else {
                            System.out.println("ID Não Encontrado");

                        }
                    }
                    opcao = 0;
                    break;

                case 6:
                    System.exit(0);
            }

        }
    }

}
