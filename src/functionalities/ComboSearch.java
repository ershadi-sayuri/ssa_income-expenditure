/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalities;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Ershadi
 */
public class ComboSearch {

    private ArrayList<String> arrayListForComboSearch;
    private JTextField jTextField;

    public void setSearchableCombo(final JComboBox cmb, boolean mustSort, final String noReultsText) {
        arrayListForComboSearch = new ArrayList<>();
        final int s = cmb.getItemCount();
        for (int i = 0; i < s; i++) {
            boolean exists = false;
            for (String arrayListForComboSearch1 : arrayListForComboSearch) {
                if (arrayListForComboSearch1.equalsIgnoreCase(cmb.getItemAt(i) + "")) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                arrayListForComboSearch.add(cmb.getItemAt(i) + "");
            }
        }
        if (mustSort) {
            Collections.sort(arrayListForComboSearch);
        }
        cmb.setEditable(true);
        cmb.setLightWeightPopupEnabled(true);
        jTextField = (JTextField) cmb.getEditor().getEditorComponent();
        jTextField.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (!(key == KeyEvent.VK_ESCAPE || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_DOWN || key == KeyEvent.VK_UP)) {
                    String s = jTextField.getText();
                    int caret = jTextField.getCaretPosition();
                    cmb.hidePopup();
                    cmb.removeAllItems();
                    for (String arrayListForComboSearch1 : arrayListForComboSearch) {
                        if (arrayListForComboSearch1.toUpperCase().startsWith(s.substring(0, caret).toUpperCase())) {
                            cmb.addItem(arrayListForComboSearch1);
                        }
                    }
                    cmb.showPopup();
                    if (cmb.getItemCount() == 0) {
                        cmb.addItem(noReultsText);
                    }
                    jTextField.setText(s);
                    jTextField.setCaretPosition(caret);
                } else if (key == KeyEvent.VK_ESCAPE) {
                    cmb.setSelectedItem(jTextField.getText());
                    cmb.hidePopup();
                } else if (key == KeyEvent.VK_ENTER && cmb.getSelectedIndex() == -1) {
                    if (cmb.getItemCount() == 1 && !cmb.getItemAt(0).equals(noReultsText)) {
                        cmb.setSelectedIndex(0);
                    } else if (cmb.getItemCount() > 1) {
                        cmb.setSelectedIndex(0);
                    }
                }
            }
        });
    }
}
