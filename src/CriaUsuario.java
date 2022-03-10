import javax.swing.JOptionPane;

public class CriaUsuario {

	public static void main(String[] args) {
		int rm = 82536;
		String nome = "Carlos";
		String username = nome +"_"     + rm;
		
		JOptionPane.showMessageDialog(null,
			"RM" + rm + "\n" +
			"Nome: " + nome + "\n" +
			"Usuário: " + username );
			
	}

}
