 
package notepad;
 
import javax.swing.JFrame;

public class Notepad {
 
    public static void main(String[] args) {
      NotepadGui  obj=new NotepadGui();
      obj.setBounds(0,0,700,700);
      obj.setTitle("Notepad");
      obj.setResizable(false);
      obj.setVisible(true);
      obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
    
}
