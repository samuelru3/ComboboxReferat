import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

public class combobox {
    private JPanel panel;
    private JComboBox comboBox;
    private JLabel label;
    private JComboBox comboBox2;
    private JTextField hinzufuegen;
    private JButton hinzufuegenButton;
    private JButton entfernenButton;
    private JSpinner entfernen;
    private JComboBox comboBox3;


    public combobox() {

        //editierbare Combobox
        comboBox2.setEditable(true);

        //Hinzufügen
        comboBox.addItem("eins");
        comboBox.addItem(2);
        comboBox.addItem("vier");

        comboBox2.addItem("bearbeiten");
        comboBox2.addItem("auch bearbeitbar");

        comboBox3.addItem("Themen");
        comboBox3.addItem("     Allgemein");
        comboBox3.addItem("     Funktionen");
        comboBox3.addItem("     Code Beispiel");

        //String[] texte = new String[]{"a","b","c"};

        //JComboBox combo = new JComboBox(texte);
        //panel.add(combo);

        //An bestimmter Stelle einfügen
        comboBox.insertItemAt("drei", 0);

        //Schrift Mittig anzeigen
        ((JLabel)comboBox.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);

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
