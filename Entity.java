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


public class Entity{

   public int x = 0; 
   
   public int y = 0; 
   
   public double y_speed = 0.0; 
   
   public double x_speed = 0.0; 
   
   public boolean visible = false; 
   
   public Image default_sprite; 
   
   public double health = 1.0; 
   
   public double armor = 1.0; 
   
   public boolean damage_immune = false; 
   
   public double max_speed = 1.0; 
   
   public double acceleration = 1.0; 
   
   public double resistance = 1.0; 
   
   public boolean fire_immune = false; 
   
   public boolean water_immune = false; 
   
   public boolean earth_immune = false; 
   
   public boolean wind_immune = false;
   
   public boolean needs_air = false; 
   
   public boolean undead = false; 
   
   public boolean physical_immune = false; 
   
   public boolean mental_immune = false; 
   
   public boolean magic_immune = false; 
   
   public double physical_attack_power_base = 1.0;  
   
   public double mental_attack_power_base = 1.0;
   
   public double magical_attack_power_base = 1.0; 
   
   public double physical_attack_power_mod = 1.0; 
   
   public double mental_attack_power_mod = 1.0;
   
   public double magical_attack_power_mod = 1.0;
   
   public double fire_damage_mod = 1.0; 
   
   public double water_damage_mod = 1.0; 
   
   public double earth_damage_mod = 1.0; 
   
   public double wind_damage_mod = 1.0; 
   
   public double drowing_resistance = 0.0; 
   
   public double mass = 1.0; 
   
   public double fire_attack_power_mod = 1.0;
   
   public double water_attack_power_mod = 1.0;
   
   public double wind_attack_power_mod = 1.0;
   
   public double earth_attack_power_mod = 1.0;
   
   public double accuracy = 1.0; 
   
   public double arcana = 1.0; 
   
   public double dodge_rate = 1.0; 
   
   public double poison_resistance = 1.0; 
   
   public boolean poison_immune = false; 
   
   public double poison_attack_power_base = 1.0;
   
   public double poison_attack_power_mod = 1.0; 
   
   public double poison_damage_mod = 1.0; 
   
   public double physical_skill_cooldown_mod = 1.0; 
   
   public double mental_skill_cooldown_mod = 1.0; 
   
   public double magical_skill_cooldown_mod = 1.0; 
   
   public double luck = 1.0;
   
   public double agility = 1.0; 
   
   public boolean invisible = false; 
   
   public double reflection_chance = 1.0;
   
   public double reflection_rate = 1.0; 
   
   public double health_absorb_chance = 1.0; 
   
   public double health_absorb_rate = 1.0; 
   
   public double stun_chance = 1.0; 
   
   public double stun_time = 1.0; 
   
   public boolean stun_immune = false; 
   
   public double stun_resistance = 1.0; 
   
   public double stun_time_decrease = 1.0; 
   
   public boolean health_absorb_immune = false; 
   
   public double health_abosorb_resistance = 1.0; 
   
   public boolean reflection_immune = false; 
   
   public double reflection_resistance = 1.0; 
   
   public double reflection_avoidance = 1.0; 
   
   public double critical_rate = 1.0; 
   
   public double critical_bonus = 1.0; 
   
   public boolean always_crit = false; 
   
   public boolean crit_immune = false; 
   
   public double armor_penetration_rate = 1.0;
   
   public double spell_penetration_rate = 1.0;
   
   public double mental_penetration_rate = 1.0; 
   
   public double block_rate = 1.0;
   
   public double block_amount = 1.0; 
   
   public double regeneration = 1.0; 
   
   public String[] status_immunities; 
   
   public boolean unable = false; 
   
   public boolean able_to_be_passed_through = false; 
   
   public boolean barriered = false;
   
   public double barrier_amount = 1.0; 
   
   public double strength = 1.0; 
   
   public double dexterity = 1.0; 
   
   public double intelligence = 1.0; 
   
   public double wisdom = 1.0; 
   
   public double charisma = 1.0; 
   
   public double constitution = 1.0; 
   
   public double insight = 1.0; 
   
   public double karma = 1.0; 
   
   public double sanity = 1.0; 
   
   public double wetness = 1.0; 
   
   public double determination = 1.0; 
   
   public double oil_on_entity = 1.0; 
   
   public double torpidity = 1.0; 
   
   public double moral = 1.0; 
   
   public boolean can_swim = false; 
   
   public boolean animal = false; 
   
   public boolean monster = false; 
   
   public boolean player = false;
   
   public boolean other = false; 
   
   public boolean banishable = false; 
   
   public double rage = 1.0; 
   
   public double blunt_resistance = 1.0;
   
   public double blade_resistance = 1.0; 
   
   public double explosion_resistance = 1.0; 
   
   public String name; 
   
   public String[] status_effects;
   
   public double cold_resistance = 1.0; 
   
   public double heat_resistance = 1.0; 
   
   public boolean magic_caster = false; 
   
   public double curse_amount = 1.0; 
   
   public boolean cursed = false; 
   
   public String type; 
   
   public boolean pack_hunter = false; 
   
   public double pack_bonus = 1.0; 
   
   public double energy = 1.0; 
   
   public double level = 1.0; 
   
   public boolean unhealable = false; 
   
   public double gender = 1.0; 
   
   public boolean floating = false; 
   
   public boolean can_fly = false;
   
   public double flight_max_height = 1.0; 
   
   public double size = 1.0; 
   
   public double gold = 1.0; 
   
   public double gold_collect_mod = 1.0; 
   
   public double steal_amount = 1.0; 
   
   public double steal_rate = 1.0; 
   
   public boolean immortal = false; 
   
   public int age = 1; 
   
   public int max_lifespan = 100; 
   
   public boolean hp_overflow = false; 
   
   public boolean immobile = false; 
   
   public boolean blinded = false; 
   
   public boolean leader = false;
   
   public double leadership_power = 1.0; 
   
   public boolean mindless = false; 
   
   public double moral_boost = 1.0; 
   
   public boolean unshakeable = false; 
   
   public boolean loyal = false; 
   
   public boolean intangible = false;
   
   public double lives = 1.0;
   
   public double carry_amount = 1.0; 
   
   public double sujit_resistance = 1.0; 
   
   public double shock_resistance = 1.0;
   
   public boolean shock_immune = false; 
   
   public boolean sleep_immune = false; 
   
   public boolean can_teleport = false;
   
   public double teleport_range = 1.0;
   
   public double trample_damage = 1.0; 
   
   public boolean unaging = false; 
   
   public boolean unique = false;
   
   public boolean elemental_immune = false; 
   
   public double elemental_resistance = 1.0;  
   
   public void fix() {
      if (default_sprite == null){try {default_sprite = ImageIO.read(new File("up.png"));} catch (IOException io) {}}
      if (name == null){name = "none";}
      if (type == null){type = "none";}
      if (status_immunities == null) {status_immunities = new String[0];}
      if (status_effects == null) {status_effects = new String[0];}
   }
   
   public void take_damage(){}


}