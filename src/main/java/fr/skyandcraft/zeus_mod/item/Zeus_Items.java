package fr.skyandcraft.zeus_mod.item;

import fr.skyandcraft.zeus_mod.zeus_mod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Zeus_Items {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, zeus_mod.MOD_ID);

    public static final RegistryObject<Item> ZEUS_INGOT = ITEMS.register("zeus_ingot",
            () -> new Item(new Item.Properties().fireResistant().tab(ItemGroup.TAB_MISC)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
