package me.zhuk.spigotGuns;

import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import javax.naming.Name;
import java.util.logging.Handler;

public class ArmsHandler {
    public static void Handler(Gun gun, Player player) {
        ItemStack gunItem = new ItemStack(gun.getGunMaterial());

        ItemMeta meta = gunItem.getItemMeta();

        meta.getPersistentDataContainer().set(NamespacedKey.fromString("gun_name"), PersistentDataType.STRING, gun.name());
        meta.getPersistentDataContainer().set(NamespacedKey.fromString("bullets_num"), PersistentDataType.INTEGER, gun.getBulletsNum());

        meta.setDisplayName(gun.getName());

        gunItem.setItemMeta(meta);

        player.getInventory().addItem(gunItem);
    }
}
