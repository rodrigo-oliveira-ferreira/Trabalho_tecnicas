package Dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Model.Produtos;


public class ProdutoDAO {
    
private static final String ARQUIVO = "produtos.txt";
	
	private static ArrayList<Produtos> produtos = new ArrayList<>();
	
	public void inserir(Produtos p) {
		produtos.add(p);
		gravarArquivo();
	}
	
	public void excluir(int id) {
		Produtos p = buscar(id);
		
		produtos.remove(p);
		
		gravarArquivo();
	}
	
	public void alterar(Produtos aux) {
		Produtos produto = buscar(aux.getCodigo());
		produto.setDescricao(aux.getDescricao());
		produto.setQuantidade(aux.getQuantidade());
		produto.setPreco(aux.getPreco());
		produto.setFornecedor(aux.getFornecedor());
		produto.setEstoque(aux.getEstoque());
		
		gravarArquivo();
	}
	
	public Produtos buscar(int id) {
		for (Produtos produto : produtos) {
			if (produto.getCodigo() == id)
				return produto;
		}
		return null;
	}
        
        public Produtos buscar(String descricao) {
		for (Produtos produto : produtos) {
			if (produto.getDescricao().equals(descricao) )
				return produto;
		}
		return null;
	}
	
	public ArrayList<Produtos> buscarPorEstoque(int estoque) {
		ArrayList<Produtos> aux = new ArrayList<>();
		
		for (Produtos Produto : produtos) {
			if (Produto.getEstoque() == estoque)
				aux.add(Produto);
		}
		return aux;
	}
	
	public ArrayList<Produtos> listar() {
		return produtos;
	}
	
	private void gravarArquivo() {
		File f = new File(ARQUIVO);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			
			for (Produtos p : produtos) {
				bw.write(p.getCodigo()+";"+p.getDescricao()+";"+p.getQuantidade()+";"+p.getPreco()+";"+p.getFornecedor()+";"+p.getEstoque());
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
		
		if (!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			String linha;
			while ( (linha = br.readLine()) != null ) {
				String[] dados = linha.split(";");
				
				Produtos p = new Produtos( Integer.parseInt(dados[0]), dados[1], Integer.parseInt(dados[2]),Double.parseDouble(dados[3]),dados[4], Integer.parseInt(dados[5]));
				produtos.add(p);
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
