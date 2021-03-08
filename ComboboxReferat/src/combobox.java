import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class combobox {
    private JPanel panel;
    private JComboBox comboBox;
    private JLabel label;
    private JComboBox comboBox2;
    private JTextField hinzufuegen;
    private JButton hinzufuegenButton;
    private JButton entfernenButton;
    private JSpinner entfernen;


    public combobox() {
        //editierbare Combobox
        comboBox2.setEditable(true);

        //Hinzufügen
        comboBox.addItem("eins");
        comboBox.addItem(2);
        comboBox.addItem("vier");
        comboBox2.addItem("bearbeiten");
        comboBox2.addItem("auch bearbeitbar");

        comboBox.

        //An bestimmter Stelle einfügen
        comboBox.insertItemAt("drei", 0);

        //ausgewähltes objekt
        comboBox.setSelectedIndex(2);

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(comboBox.getSelectedItem());

                //In Lable anzeigen
                label.setText(comboBox.getSelectedItem().toString());
            }
        });

        comboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //In Lable anzeigen
                label.setText(comboBox2.getSelectedItem().toString());
            }
        });

        hinzufuegenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox.addItem(hinzufuegen.getText());
            }
        });

        entfernenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox.removeItemAt(Integer.parseInt(entfernen.getValue().toString()));
            }
        });
    }

    public static void main(String[] args) {
        JFrame fenster = new JFrame("ComboBox Referat");
        fenster.setContentPane(new combobox().panel);
        fenster.pack();
        fenster.setVisible(true);
    }

}
