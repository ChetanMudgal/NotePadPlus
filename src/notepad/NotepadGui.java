 
package notepad;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

 
public class NotepadGui extends javax.swing.JFrame {
   String filename;
    Clipboard clipboard = getToolkit().getSystemClipboard();
    public NotepadGui() {
        initComponents();
    }
   
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SearchButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        searchField = new javax.swing.JTextField();
        Document = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        NewFile = new javax.swing.JMenuItem();
        OpenFile = new javax.swing.JMenuItem();
        SaveFile = new javax.swing.JMenuItem();
        ExitFile = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        CopyFile = new javax.swing.JMenuItem();
        CutFile = new javax.swing.JMenuItem();
        PasteFile = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane2.setViewportView(textArea);

        searchField.setText(" ");
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SearchButton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(searchField)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        NewFile.setText("new");
        NewFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewFileActionPerformed(evt);
            }
        });
        jMenu1.add(NewFile);

        OpenFile.setText("open");
        OpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFileActionPerformed(evt);
            }
        });
        jMenu1.add(OpenFile);

        SaveFile.setText("save");
        SaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveFileActionPerformed(evt);
            }
        });
        jMenu1.add(SaveFile);

        ExitFile.setText("exit");
        ExitFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitFileActionPerformed(evt);
            }
        });
        jMenu1.add(ExitFile);

        Document.add(jMenu1);

        jMenu2.setText("Edit");

        CopyFile.setText("copy");
        CopyFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyFileActionPerformed(evt);
            }
        });
        jMenu2.add(CopyFile);

        CutFile.setText("cut");
        CutFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutFileActionPerformed(evt);
            }
        });
        jMenu2.add(CutFile);

        PasteFile.setText("paste");
        PasteFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteFileActionPerformed(evt);
            }
        });
        jMenu2.add(PasteFile);

        Document.add(jMenu2);

        setJMenuBar(Document);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_searchFieldActionPerformed

    private void SaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveFileActionPerformed
       FileDialog filedialog=new FileDialog(NotepadGui.this,"save file",FileDialog.SAVE);
       filedialog.setVisible(true);
       
       if(filedialog.getFile() != null)
       {
           filename=filedialog.getDirectory() + filedialog.getFile();
           setTitle(filename);
       }
        try {
            FileWriter writer =new FileWriter(filename);
            writer.write(textArea.getText());
            setTitle(filename);
            writer.close();
        } catch (IOException e) {
            System.out.println("File Not Found!");
        }
    }//GEN-LAST:event_SaveFileActionPerformed

    private void NewFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewFileActionPerformed
     textArea.setText("");
     setTitle(filename);
    }//GEN-LAST:event_NewFileActionPerformed

    private void OpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFileActionPerformed
            FileDialog filedialog = new FileDialog(NotepadGui.this,"load File",FileDialog.LOAD);
            filedialog.setVisible(true);
            
            if(filedialog.getFile() != null)
            {
                filename=filedialog.getDirectory() + filedialog.getFile();
                setTitle(filename);
            }
            try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            StringBuilder sb=new StringBuilder();
            
            String line=null;
            
            while((line = reader.readLine())!=null)
            {
                sb.append(line+"\n");
                textArea.setText(sb.toString());
            }
        } catch (IOException e) {
                System.out.println("File Not Found!");
        }
    }//GEN-LAST:event_OpenFileActionPerformed

    private void ExitFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitFileActionPerformed
      System.exit(0);
    }//GEN-LAST:event_ExitFileActionPerformed

    private void CutFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutFileActionPerformed
      String cutstring = textArea.getSelectedText();
      StringSelection cutselection =new StringSelection(cutstring);
      
      clipboard.setContents(cutselection, cutselection);
      textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd());
      
    }//GEN-LAST:event_CutFileActionPerformed

    private void CopyFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyFileActionPerformed
         String copystring = textArea.getSelectedText();
      StringSelection copyselection =new StringSelection(copystring);
      
      clipboard.setContents(copyselection, copyselection);
       
    }//GEN-LAST:event_CopyFileActionPerformed

    private void PasteFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasteFileActionPerformed
        try {
        Transferable pastetext = clipboard.getContents(NotepadGui.this);
        String sel=(String) pastetext.getTransferData(DataFlavor.stringFlavor);
        textArea.replaceRange(sel, textArea.getSelectionStart(), textArea.getSelectionEnd());
        
        } catch (Exception e) {
            System.out.println("dont need!");
        }
       
    }//GEN-LAST:event_PasteFileActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
       searchTextArea(textArea,searchField.getText());
    }//GEN-LAST:event_SearchButtonActionPerformed
class myHighlighter extends DefaultHighlighter.DefaultHighlightPainter{
     public myHighlighter(Color color){
         super(color);
     }
}
DefaultHighlighter.HighlightPainter highlighter = new myHighlighter(Color.yellow);
public void removeHighlighter(JTextComponent textComp){
    
  Highlighter removehilighter = textComp.getHighlighter();
  Highlighter.Highlight[] remove =removehilighter.getHighlights();
  
  for(int i=0;i<remove.length;i++){
  if(remove[i].getPainter() instanceof myHighlighter){
  removehilighter.removeHighlight(remove[i]);
  }
  }
}
public void searchTextArea(JTextComponent textcomp ,String textString){
    removeHighlighter(textcomp);
    try {
        Highlighter hilight = textcomp.getHighlighter();
        Document doc = textcomp.getDocument();
        String text = doc.getText(0, doc.getLength());
        
        int pos =0;
        while((pos=text.toUpperCase().indexOf(textString.toUpperCase(),pos))>=0){
        hilight.addHighlight(pos,pos + textString.length(), highlighter);
       pos+=textString.length();
       }
    } catch (Exception e) {
    }
}


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NotepadGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotepadGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotepadGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotepadGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotepadGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CopyFile;
    private javax.swing.JMenuItem CutFile;
    private javax.swing.JMenuBar Document;
    private javax.swing.JMenuItem ExitFile;
    private javax.swing.JMenuItem NewFile;
    private javax.swing.JMenuItem OpenFile;
    private javax.swing.JMenuItem PasteFile;
    private javax.swing.JMenuItem SaveFile;
    private javax.swing.JButton SearchButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
