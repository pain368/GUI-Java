import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        int arr[]={39,80, 13};
        SwingUtilities.invokeLater(()-> {
            new MainWindowDisplay("Module draw", 1024,768,arr);



        });
    }



}
