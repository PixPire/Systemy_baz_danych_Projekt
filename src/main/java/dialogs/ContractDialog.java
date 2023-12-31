package dialogs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ContractDialog extends JDialog {
    JTextField startDate = new JTextField();
    JTextField endDate = new JTextField();
    JTextField paymentAmount = new JTextField();
    JTextField type = new JTextField();
    JComboBox employee = new JComboBox<>();
    JComboBox place = new JComboBox<>();
    JButton confirmButton = new JButton("Confirm");
    JButton cancelButton = new JButton("Cancel");

    public ContractDialog(JFrame frame, String title){
        super(frame, title);
        super.setVisible(true);
        super.setModal(true);
        super.setAlwaysOnTop(true);
        super.setModalityType(ModalityType.APPLICATION_MODAL);
        super.setPreferredSize(new Dimension(400,300));
        super.setLocationRelativeTo(null);
        super.setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridLayout(0, 2));
        JPanel buttonsPanel = new JPanel();

        formPanel.add(new JLabel("Start date: "));
        formPanel.add(startDate);

        formPanel.add(new JLabel("End date: "));
        formPanel.add(endDate);

        formPanel.add(new JLabel("Payment amount: "));
        formPanel.add(paymentAmount);

        formPanel.add(new JLabel("Type: "));
        formPanel.add(type);

        formPanel.add(new JLabel("Employee: "));
        formPanel.add(employee);

        formPanel.add(new JLabel("Place: "));
        formPanel.add(place);


        buttonsPanel.add(confirmButton);
        buttonsPanel.add(cancelButton);
        this.add(formPanel);
        this.add(buttonsPanel, BorderLayout.SOUTH);
        this.pack();


    }
}


