package main;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

// An AWT program inherits from the top-level container java.awt.Frame
public class WindowEventDemo extends Frame {

   private TextField tfCount; // Declare a TextField component
   private Button btnCount;   // Declare a Button component
   private int count = 0;     // Counter's value

   // Constructor to setup GUI components and event handlers
   public WindowEventDemo () {
      setLayout(new FlowLayout());
      
      add (new Label("count")); 

      tfCount = new TextField("0",10);  // construct the TextField
      tfCount.setEditable(false); 
      add(tfCount);     // "super" Frame container adds Label component

      


      btnCount = new Button("Count");   // construct the Button component
      add(btnCount);                    // "super" Frame container adds Button component

      btnCount.addActionListener(new BtnCountListener());
         // "btnCount" is the source object that fires an ActionEvent when clicked.

      setTitle("WindowEventDemo");  // "super" Frame sets its title
      setSize(300, 100);        // "super" Frame sets its initial window s     
      setVisible(true);         // "super" Frame shows

   }

   // The entry main() method
   public static void main(String[] args) {
      new WindowEventDemo();
        
   }

   // Define an inner class to handle the "Count" button-click
   private class BtnCountListener implements ActionListener {
      // ActionEvent handler - Called back upon button-click.
      @Override
      public void actionPerformed(ActionEvent evt) {
         ++count; // Increase the counter value
         // Display the counter value on the TextField tfCount
         tfCount.setText(count + ""); // Convert int to String
      }
   }
}
