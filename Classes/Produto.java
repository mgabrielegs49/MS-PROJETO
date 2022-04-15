public class Produto {
    protected String cor;
    protected String tamanho;
    protected String modelo;
    protected String marca;
    protected double preco;

    public void setCor(String cor){
        this.cor=cor;
    }
    public String getCor(){
        return this.cor;
    }

    public void setTamanho(String tamanho){
        this.tamanho=tamanho;
    }
    public String getTamanho(){
        return this.tamanho;
    }

    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public String getModelo(){
        return this.modelo;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getMarca(){
        return this.marca;
    }

    public void setPreco(double preco){
        this.preco=preco;
    }
    public double getPreco(){
        return this.preco;
    }

    public void adicionar( ){
        String sql = "INSERT INTO produto (marca, preco, cor) VALUES (?,?,?)";

            try{
        Connection con = DB.conexao();
        PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, this.getMarca());
            stmt.setDouble(2, this.getPreco());
            stmt.setString(3, this, getCor());
            stmt.execute();
            }catch(SQLException e){
                System.out.print("Erro no adicionar Produto:"+e.toString());
            }
    }
    
    public static void listar( ){ }
    
    public void atualizar( ){ }
    
    public void excluir( ){ }
    
    

    
}
