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

import java.util.*;


public class Entity{
   
   public Image default_sprite; 
   
   public Dictionary<String, Image[]> animations; 
   
   public Dictionary<String, Boolean> immunities; 
   
   public Dictionary<String, Double> resistances; 
   
   public Dictionary<String, Double> attack_power_mods; 
   
   public Dictionary<String, Double> attack_power_base; 
   
   public Dictionary<String, Double> damage_taken_mods; 
   
   public String[] status_immunities;
   
   public String[] traits; 
   
   public Dictionary<String, Double> trait_amounts; 
   
   public Dictionary<String, Double> condition_amounts; 
   
   public Dictionary<String, Double> conditions; 
   
   public Dictionary<String, Double> stats; 
   
   public String[] inates;
   
   public Dictionary<String, Double> inate_amounts; 
  
   public String name; 
   
   public String type; 
   
   public int age = 1; 
   
   public int gold = 0; 
   
   public int max_lifespan = 100; 
   
   public double sujit_resistance = 0.0; 
   
   public void fix() {
      
   }
   
   public void take_damage(){}


}