package Classes;

import java.sql.DriverManager;

public class DB{
        public static String servidor = "127.0.0.1:3306";
        public static String usuario = "root";
        public static String senha = "";
        public static String nome_banco = "aula_java";


        public static Connection conexao(){
            Connection conexao = null;
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");

                conexao = DriverManager.getConnection(
                    "jdbc:mysql://"+servidor+"/"+nome_banco+"?useTimezone=true&serverTimezone=UTC", usuario, senha
                );
            }catch(SQLException e){
                System.out.print("Erro de Conexao:"+e.toString());
            }catch(ClassNotFoundException e){
                System.out.print("Classe nao Encontrada:" + e.toString());
            }

            return conexao;
        }
    }
