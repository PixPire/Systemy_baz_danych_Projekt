package dialogs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ClientDialog extends JDialog {

    JTextField firstNameField = new JTextField();
    JTextField lastNameField = new JTextField();
    JTextField phoneNumberField = new JTextField();
    JTextField emailField = new JTextField();
    JTextField addressField = new JTextField();

    JButton confirmButton = new JButton("Confirm");
    JButton cancelButton = new JButton("Cancel");

    public ClientDialog(JFrame frame, JButton button, String title) {
        super(frame, title);
        super.setVisible(true);
        super.setModal(true);
        super.setAlwaysOnTop(true);
        super.setModalityType(ModalityType.APPLICATION_MODAL);
        super.setPreferredSize(new Dimension(400,300));
        super.setLocationRelativeTo(null);
        super.setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridLayout(0 ,2));
        JPanel buttonsPanel = new JPanel();

        formPanel.add(new JLabel("First name: "));
        formPanel.add(firstNameField);

        formPanel.add(new JLabel("Last name: "));
        formPanel.add(lastNameField);

        formPanel.add(new JLabel("Phone number: "));
        formPanel.add(phoneNumberField);

        formPanel.add(new JLabel("Email: "));
        formPanel.add(emailField);

        formPanel.add(new JLabel("Address: "));
        formPanel.add(addressField);

        buttonsPanel.add(confirmButton);
        buttonsPanel.add(cancelButton);

        this.add(formPanel);
        this.add(buttonsPanel, BorderLayout.SOUTH);
        this.pack();

        super.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                button.setEnabled(true);
                ClientDialog.super.dispose();
            }
        });


    }


}
