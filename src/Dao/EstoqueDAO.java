/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Estoque;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Heitor Lopes
 */
public class EstoqueDAO {

    private static final String ARQUIVO = "estoques.txt";

    private static ArrayList<Estoque> estoques = new ArrayList<>();

    public void inserir(Estoque f) {
        estoques.add(f);
        gravarArquivo();
    }

    public void excluir(int id) {
        Estoque e = buscar(id);
        estoques.remove(e);
        gravarArquivo();
    }

    public void alterar(Estoque aux) {
        Estoque estoques = buscar(aux.getCodigo());
        estoques.setCodigo(aux.getCodigo());
        estoques.setLoja(aux.getLoja());
        gravarArquivo();
    }

    public Estoque buscar(int codigo) {
        for (Estoque estoques : estoques) {
            if (estoques.getCodigo() == codigo) {
                return estoques;
            }
        }
        return null;
    }
    
    public Estoque buscar(String nome) {
        for (Estoque estoques : estoques) {
            if (estoques.getLoja().equalsIgnoreCase(nome)) {
                return estoques;
            }
        }
        return null;
    }

    public boolean existsEstoque(int codigo) {
        for (Estoque estoques : estoques) {
            if (estoques.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Estoque> listar() {
        return estoques;
    }

    private void gravarArquivo() {
        File f = new File(ARQUIVO);

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);

            for (Estoque estoq : estoques) {
                bw.write(estoq.getCodigo() + ";" + estoq.getLoja());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static {
        File f = new File(ARQUIVO);

        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");

                Estoque c = new Estoque(Integer.parseInt(dados[0]), dados[1]);
                estoques.add(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
