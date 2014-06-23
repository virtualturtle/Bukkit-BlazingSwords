package me.virtualturtle.BlazingSwords;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class BlazingSwords extends JavaPlugin {
	private Recipe generateSword(Material ingredient, Material result) {
		ItemStack i = new ItemStack(result, 1) ;
		i.addEnchantment(Enchantment.FIRE_ASPECT, 2);
		ShapedRecipe r = new ShapedRecipe(i) ;
		r.shape("a", "b", "c") ;
		r.setIngredient('a', ingredient) ;
		r.setIngredient('b', ingredient) ;
		r.setIngredient('c', Material.BLAZE_ROD) ;
		
		return r ;		
	}
	public void onEnable() {
		Bukkit.addRecipe(generateSword(Material.GOLD_INGOT, Material.GOLD_SWORD )) ;
	}
}
