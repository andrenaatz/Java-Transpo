package br.com.cursojava.aula009;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RepositorioProduto {


	public void inserir(Produto produto){
		String sql = "insert into produtos(nome,descricao,preco) values(?,?,?)";
		Connection conexao = BancoUtil.getConexao();
		try {
			PreparedStatement comando = conexao.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			comando.setString(1, produto.getNome());
			comando.setString(2, produto.getDescricao());
			comando.setDouble(3, produto.getPreco());
			
			comando.execute();
			ResultSet keys = comando.getGeneratedKeys();
			if(keys.next()){
				Integer id = keys.getInt(1);
				produto.setId(id);
			}
			keys.close();
			comando.close();
			
		} catch (SQLException e) {
			System.out.println("Não foi possível inserir o registro no banco");
		}
	}
	
	public List<Produto> buscarTodos(){
		List<Produto> lista = new ArrayList<>();
		String sql = "select * from produtos";
		Connection conexao = BancoUtil.getConexao();
		
		try{
			PreparedStatement comando = conexao.prepareStatement(sql);
			ResultSet cursor = comando.executeQuery();
			Produto produto = null;
			while(cursor.next()){
				produto = criarProduto(cursor);
				lista.add(produto);
			}
			cursor.close();
			comando.close();
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Não foi possível recuperar a lista de registros");
		}
		
		return lista;
	}

	private Produto criarProduto(ResultSet cursor) throws SQLException {
		Integer id = cursor.getInt("id");
		String nome = cursor.getString("nome");
		String descricao = cursor.getString("descricao");
		double preco = cursor.getDouble("preco");
		return new Produto(id,nome,descricao,preco);
	}
	
	
	public Produto buscarPorId(Integer id){
		Produto produto = null;
		String sql = "select * from produtos where id = ?";
		Connection conexao = BancoUtil.getConexao();
		
		try{
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setInt(1, id);
			ResultSet cursor = comando.executeQuery();
			if(cursor.next()){
				produto = criarProduto(cursor);
			}
			cursor.close();
			comando.close();
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Não foi possível recuperar o registro especificado");
		}
		
		return produto;
	}
	
	
	public void atualizar(Produto produto){
		String sql = "update produtos set nome = ?, descricao = ?, preco = ? where id = ?";
		Connection conexao = BancoUtil.getConexao();
		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setString(1, produto.getNome());
			comando.setString(2, produto.getDescricao());
			comando.setDouble(3, produto.getPreco());
			comando.setInt(4, produto.getId());
			
			comando.executeUpdate();
			comando.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possível atualizar o registro no banco");
		}
	}
	
	
	public void remover(Integer id){
		String sql = "delete  from produtos where id = ?";
		Connection conexao = BancoUtil.getConexao();
		
		try{
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setInt(1, id);
			comando.execute();
			comando.close();
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Não foi possível remover o registro especificado");
		}
		
	}
	
	public long contar(){
		String sql = "select count (*)  as total from produtos";
		Connection conexao = BancoUtil.getConexao();
		long total = 0;
		try{
			PreparedStatement comando = conexao.prepareStatement(sql);
			ResultSet cursor = comando.executeQuery();
			if(cursor.next()){
				total = cursor.getLong("total");
			}
			cursor.close();
			comando.close();
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Não foi possível contar a quantidade de registros");
		}
		
		return total;
	}
	
	public List<Produto> buscarPorFaixaPreco(double min, double max){
		List<Produto> lista = new ArrayList<>();
		String sql = "select * from produtos where preco between ? and ?";
		Connection conexao = BancoUtil.getConexao();
		
		try{
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setDouble(1, min);
			comando.setDouble(2, max);
			ResultSet cursor = comando.executeQuery();
			Produto produto = null;
			while(cursor.next()){
				produto = criarProduto(cursor);
				lista.add(produto);
			}
			cursor.close();
			comando.close();
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Não foi possível recuperar a lista de registros");
		}
		
		return lista;
	}
}
