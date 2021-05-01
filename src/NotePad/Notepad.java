package NotePad;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Notepad extends javax.swing.JFrame {

    String filename;
    

    public Notepad() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        Editor = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        newFile = new javax.swing.JMenuItem();
        openFile = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        Exit = new javax.swing.JMenuItem();
        EditMenu = new javax.swing.JMenu();
        cutfile = new javax.swing.JMenuItem();
        copyfile = new javax.swing.JMenuItem();
        pastfile = new javax.swing.JMenuItem();
        SearchMenu = new javax.swing.JMenu();
        findviewitem = new javax.swing.JMenuItem();
        HelpMenu = new javax.swing.JMenu();
        helpviewitem = new javax.swing.JMenuItem();
        featureviewitem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        aboutviewitem = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Editor.setColumns(20);
        Editor.setRows(5);
        jScrollPane1.setViewportView(Editor);

        FileMenu.setText("File");

        newFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newFile.setText("New");
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        FileMenu.add(newFile);

        openFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openFile.setText("Open");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        FileMenu.add(openFile);

        saveFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveFile.setText("Save");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        FileMenu.add(saveFile);
        FileMenu.add(jSeparator2);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        FileMenu.add(Exit);

        jMenuBar1.add(FileMenu);

        EditMenu.setText("Edit");
        EditMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditMenuActionPerformed(evt);
            }
        });

        cutfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cutfile.setText("Cut");
        cutfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutfileActionPerformed(evt);
            }
        });
        EditMenu.add(cutfile);

        copyfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        copyfile.setText("Copy");
        copyfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyfileActionPerformed(evt);
            }
        });
        EditMenu.add(copyfile);

        pastfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        pastfile.setText("Paste");
        pastfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastfileActionPerformed(evt);
            }
        });
        EditMenu.add(pastfile);

        jMenuBar1.add(EditMenu);

        SearchMenu.setText("Search");

        findviewitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        findviewitem.setText("Find");
        findviewitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findviewitemActionPerformed(evt);
            }
        });
        SearchMenu.add(findviewitem);

        jMenuBar1.add(SearchMenu);

        HelpMenu.setText("Help");
        HelpMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpMenuActionPerformed(evt);
            }
        });

        helpviewitem.setText("Help View");
        HelpMenu.add(helpviewitem);

        featureviewitem.setText("Features");
        featureviewitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                featureviewitemActionPerformed(evt);
            }
        });
        HelpMenu.add(featureviewitem);
        HelpMenu.add(jSeparator1);

        aboutviewitem.setText("About");
        aboutviewitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutviewitemActionPerformed(evt);
            }
        });
        HelpMenu.add(aboutviewitem);

        jMenuBar1.add(HelpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        // TODO add your handling code here:
        Editor.setText("");
        setTitle(filename);
    }//GEN-LAST:event_newFileActionPerformed

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        // TODO add your handling code here:
        FileDialog fd = new FileDialog(Notepad.this, "Select File", FileDialog.LOAD);
        fd.setVisible(true);

        if (fd.getFile() != null) {
            filename = fd.getDirectory() + fd.getFile();
            setTitle(filename);
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            StringBuffer stringBuffer = new StringBuffer();
            String line = null;
            while ((line = reader.readLine()) != null) {
                stringBuffer.append(line + "\n");
                Editor.setText(stringBuffer.toString());
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }

        // jTextArea1.requestFocus();
    }//GEN-LAST:event_openFileActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
      
        System.exit(0);


    }//GEN-LAST:event_ExitActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        // TODO add your handling code here:
        FileDialog fileDialog = new FileDialog(Notepad.this, "Save File ", FileDialog.SAVE);
        fileDialog.setVisible(true);

        if (fileDialog.getFile() != null) {
            filename = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(filename);
            try {
                FileWriter output = new FileWriter(filename);
                output.write(Editor.getText());
                output.close();
                setTitle(filename);

            } catch (Exception e) {
                System.out.println("File is not Found");
            }
        }
        Editor.requestFocus();
    }//GEN-LAST:event_saveFileActionPerformed

    private void HelpMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HelpMenuActionPerformed

    private void aboutviewitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutviewitemActionPerformed
        // TODO add your handling code here:

      
    }//GEN-LAST:event_aboutviewitemActionPerformed

    private void featureviewitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_featureviewitemActionPerformed
      

    }//GEN-LAST:event_featureviewitemActionPerformed

    private void findviewitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findviewitemActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_findviewitemActionPerformed

    private void EditMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditMenuActionPerformed

    private void pastfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastfileActionPerformed
        // TODO add your handling code here:
        Editor.paste();
    }//GEN-LAST:event_pastfileActionPerformed

    private void copyfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyfileActionPerformed
        // TODO add your handling code here:
        Editor.copy();
    }//GEN-LAST:event_copyfileActionPerformed

    private void cutfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutfileActionPerformed
        // TODO add your handling code here:
        Editor.cut();
    }//GEN-LAST:event_cutfileActionPerformed

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
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu EditMenu;
    private javax.swing.JTextArea Editor;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenu HelpMenu;
    private javax.swing.JMenu SearchMenu;
    private javax.swing.JMenuItem aboutviewitem;
    public javax.swing.JMenuItem copyfile;
    private javax.swing.JMenuItem cutfile;
    private javax.swing.JMenuItem featureviewitem;
    private javax.swing.JMenuItem findviewitem;
    private javax.swing.JMenuItem helpviewitem;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem newFile;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JMenuItem pastfile;
    private javax.swing.JMenuItem saveFile;
    // End of variables declaration//GEN-END:variables
}