//Set up imports 
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.KeyListener; 
import java.awt.event.KeyEvent; 
import java.io.*; 
import javax.imageio.ImageIO; 
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JFrame; 
import java.io.File;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javafx.embed.swing.JFXPanel; 
//The game class: extends a panel for window, implements runnable for thread, keylistener + mouselistener for player inputs
public class Game extends JPanel implements Runnable, KeyListener, MouseListener{
   //Set frame and thus window size 
   private final int WIDTH = 1200; 
   private final int HEIGHT = 675; 
   //Create a boolean for thread operations 
   private boolean running;
   //Create input flags for player
   private boolean w_flag; 
   private boolean a_flag; 
   private boolean s_flag;
   private boolean d_flag;
   
   //Player Stats & Assets
   private int player_x = 0; 
   private int player_y = 0; 
   private Image player_upward; 
   private Image player_downward;
   private Image player_right;
   private Image player_left;   
   private int direction = 3; 
   private Image current_heading; 

   
   //Set framerate
   private int FPS = 60;
   //Create game thread object
   public Thread gameThread;  
   //Create media object for music
   private Media media; 
   //Create media player for music execution
   private MediaPlayer mp; 
   //Game constructor 
   public Game() {
      //Creates new panel 
      new JFXPanel();
      //Gets music file 
      File mp3f = new File("theme.mp3"); 
      try {
         //loads music 
         media = new Media(mp3f.toURI().toString()); 
         //loads music into player
         mp = new MediaPlayer(media); 
         //make it loop basically forever; yes, i know how to make it infinite, but im making this in literally 10 mins 
         mp.setCycleCount(99999); 
         //play music
         mp.play();     
      } catch (Exception e) {
         e.printStackTrace(); 
      }
      try {
         player_upward = ImageIO.read(new File("up.png")); 
         player_downward = ImageIO.read(new File("down.png")); 
         player_right = ImageIO.read(new File("right.png")); 
         player_left = ImageIO.read(new File("left.png"));
      } catch (IOException e) {e.printStackTrace();}
      //use width and height to set window size
      this.setPreferredSize(new Dimension(WIDTH, HEIGHT)); 
      //default background color
      this.setBackground(Color.black); 
      //idk
      this.setDoubleBuffered(true); 
      //add keylistener 
      addKeyListener(this); 
      //allow user to click into/onto window 
      this.setFocusable(true); 
      //add mouselistener
      addMouseListener(this);
   }
   //start thread function
   public void startThread() {
      //instaniate thread
      gameThread = new Thread(this); 
      //run thread
      gameThread.start(); 
      //set boolean for continued running 
      running = true; 
   }
   //stop thread function 
   public void stopThread() {
      //set boolean to stop running 
      running = false;
      try{ 
         //stop game 
         gameThread.join(); 
      } catch (InterruptedException e) {
         e.printStackTrace(); 
      }   
   }
   //method that activates on the thread start(); command 
   @Override
   public void run() {
      //setting up time stuff with fps 
      double di = 1000000000/FPS; 
      double ndt = System.nanoTime() + di; 
      while (running) {
         long ct = System.nanoTime(); 
         update(); 
         try {
            double rt = ndt - System.nanoTime();
            rt = rt/1000000;  
            if (rt < 0) {
               rt = 0; 
            }
            //make thread pause per the frame 
            Thread.sleep((long) rt);
         } catch (InterruptedException e) {
            e.printStackTrace(); 
         }
      }
   }
   //main game loop of game; so far nothing but graphic update 
   public void update() {repaint();
      if (direction == 1) {current_heading = player_upward;}
      if (direction == 2) {current_heading = player_left;}
      if (direction == 3) {current_heading = player_downward;}
      if (direction == 4) {current_heading = player_right;}
      if (d_flag == true) {player_x += 1; direction = 4;}
      if (a_flag == true) {player_x -= 1; direction = 2;} 
      if (w_flag == true) {player_y -= 1; direction = 1;}
      if (s_flag == true) {player_y += 1; direction = 3;} 
   }
   //graphic update command 
   @Override 
   public void paintComponent(Graphics g) {
      super.paintComponent(g); 
      g.setColor(Color.black);
      //System.out.println("Repaint: X: " + player_x); 
      if (current_heading != null) {
         g.drawImage(current_heading, player_x, player_y, this);}
    update();}
      
      
   
   //useless key listener func 
   @Override
   public void keyTyped(KeyEvent e) {}
   //yipee key listener func 
   @Override 
   public void keyPressed(KeyEvent e) {
      //System.out.println(e); 
      //get code of key; checks its; raises flag assiocatd with input; eventually we should create dictionary, array, etc to hold all of these ngl
      int keyCode = e.getKeyCode(); 
      if (keyCode == KeyEvent.VK_W || keyCode == 38) {w_flag = true;}
      if (keyCode == KeyEvent.VK_D || keyCode == 39) {d_flag = true;}
      if (keyCode == KeyEvent.VK_A || keyCode == 37) {a_flag = true;}
      if (keyCode == KeyEvent.VK_S || keyCode == 40) {s_flag = true;} 
      
   } 
   //yipee key listener thing 
   @Override 
   public void keyReleased(KeyEvent e) {
      //same thing but lowers the flag 
      int keyCode = e.getKeyCode(); 
      if (keyCode == KeyEvent.VK_W || keyCode == 38) {w_flag = false;}
      if (keyCode == KeyEvent.VK_D || keyCode == 39) {d_flag = false;}
      if (keyCode == KeyEvent.VK_A || keyCode == 37) {a_flag = false;}
      if (keyCode == KeyEvent.VK_S || keyCode == 40) {s_flag = false;} 
   }
   //get mouse click; good stuff 
   @Override
    public void mouseClicked(MouseEvent e) {
        //get mouse coords 
        double mx = e.getX(); 
        double my = e.getY(); 
    }
   //useless   
   @Override
   public void mousePressed(MouseEvent e) {}
   //useless
   @Override
   public void mouseReleased(MouseEvent e) {}
   //useless
   @Override
   public void mouseEntered(MouseEvent e) {}
   //useless
   @Override
   public void mouseExited(MouseEvent e) {}
}

