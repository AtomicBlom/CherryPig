package othlon.cherrypig.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by JayRay on 29/05/2014.
 */
public class CPItem {

    public static Item cherryPip;
    public static Item cherryFruit;
    public static Item cherryPie;
    public static Item spawnEgg;


    public static void doTheItemThing(){
        cherryPip = new CPCherryPip();
        GameRegistry.registerItem(cherryPip, "cherryPip");

        spawnEgg = new CPSpawnEgg("CherryPig", 0x990000, 0x669900)
        .setUnlocalizedName("spawn egg"+"CherryPig".toLowerCase())
        .setTextureName("cherrypig:spawn_egg");
        GameRegistry.registerItem(spawnEgg, "spawnEgg"+"CherryPig");


        cherryFruit = new CPFood(1,true, 0.2F,  "cherryfruit")
                            .setUnlocalizedName("cherryfruit");
        GameRegistry.registerItem(cherryFruit,  "cherryFruit");
        OreDictionary.registerOre("cropCherry", cherryFruit);
        OreDictionary.registerOre("listAllfruit", cherryFruit);
        OreDictionary.registerOre("foodCherry", cherryFruit);


        cherryPie = new CPFood(4,true, 2F,  "cherrypie")
                        .setUnlocalizedName("cherrypie");
        GameRegistry.registerItem(cherryPie,"cherrypie");
    }
}
