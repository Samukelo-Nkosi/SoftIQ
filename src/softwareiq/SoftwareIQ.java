/**
 * SoftIQ - A Software Development Knowledge Quiz
 * this is the Entry point of the application
 */


package softwareiq;

import javax.swing.*;

public class SoftwareIQ {
    public static void main(String[] args){
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {

        }

        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}
