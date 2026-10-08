
//Import set up 
import javax.swing.JFrame; 
import javax.swing.ImageIcon;

//Main class
public class Main {
   //On run function
   public static void main(String[] args) {
      //Create new frame to act as game window
      JFrame window = new JFrame(); 
      //Set specific size in game
      window.setResizable(false);
      //Create a new game instance 
      Game game = new Game(); 
      //Add game (panel) to the frame
      window.add(game);
      //Pack the frame
      window.pack();
      //Set frame name
      window.setTitle("Unnamed RPG"); 
      //Set icon (currently disabled as there are no icons in folder) 
      //window.setIconImage(new ImageIcon("icon.png").getImage());
      //Set the frame's relative location to nothing cause its not related to any other window/frame
      window.setLocationRelativeTo(null); 
      //Make it disible, duh
      window.setVisible(true);
      //Make it close when you hit 'x' 
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      //Start up game   
      game.run(); 
   }
}

//Notes: the theme file is just leftover music from a tokugawashogunate game i was making. the program expects a theme mp3, but if you guys don't want 
// backgroun theme music then we can delete the section of code and file. otherwise, we can just find appropriate [good] theme music and put it in instead. 