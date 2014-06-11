import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 * 
 */

/**
 * @author guillaumesoullard1
 *
 */
public class Connect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("DRIVER OK");
			
			String url = "jdbc:postgresql://localhost:5432/XCOP";
			String user = "postgres";
			String password = "admin";
			
			Connection conn = DriverManager.getConnection(url,user,password);
			System.out.println("connexion effective");
			
			//creation objet statement
			Statement state = conn.createStatement();
			//creation objet resultset qui contient les résultats de la requete sql
			ResultSet result = state.executeQuery("SELECT * from xnet_ref.immeuble");
			//on recupere les metadata
			ResultSetMetaData resultMeta = result.getMetaData();
			System.out.print(result);
			
			for (int i=1 ; i<=resultMeta.getColumnCount();i++ ) {
				System.out.println(resultMeta.getColumnName(i)+"\t" );
			}
			while(result.next()) {
				for (int i=1; i<=resultMeta.getColumnCount(); i++) {
					System.out.println("valeur : "+ result.getObject(i).toString()+ "\t");
				}
			}
					
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
