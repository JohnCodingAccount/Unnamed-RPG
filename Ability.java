import java.awt.*; 
import javax.swing.*; 
import java.io.*; 
import javax.imageio.ImageIO; 
import java.io.File;
import java.util.*;
public interface Ability {

  public String name = ""; 
  
  public double base_damage = 0.0; 
  
  public double base_cooldown = 0.0;
  
  public boolean AOE = false;
  
  public double area_width = 0.0;
  public double area_height = 0.0; 
  
  public boolean ranged = false;
  
  public double range = 0.0;
  public boolean gravity = false; 
  public double mass = 0.0; 
  public double movement_direction = 0.0; 
  public double intial_movement_speed_y = 0.0; 
  public double intial_movement_speed_x = 0.0; 
  
  public double offset_x = 0.0; 
  public double offset_y = 0.0; 
  
  public double duration = 0.0; 
  
  public double hitbox_tl_x = 0.0; //should be 0.0 for rectangular prism 
  public double hitbox_tl_y = 0.0; 
  public double hitbox_br_x = 0.0; 
  public double hitbox_br_y = 0.0; 
  
  public Map<String, Image[]> animations = new HashMap<String, Image[]>(); 
  
  public String[] keywords = new String[]{}; 
  
  public String[] effects = new String[]{}; 
  
  public Map<String, Double> keyword_amounts = new HashMap<String, Double>(); 
  
  
}
