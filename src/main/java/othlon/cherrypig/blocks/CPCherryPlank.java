package othlon.cherrypig.blocks;

import net.minecraft.block.BlockPlanks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import othlon.cherrypig.CherryPig;

import java.util.List;

public class CPCherryPlank extends BlockPlanks {

    IIcon face;

    public CPCherryPlank(){
        this.setHarvestLevel("axe", 0);
        this.setStepSound(soundTypeWood);
        this.setBlockName("cherrywoodplank");
        this.setCreativeTab(CherryPig.tabCherryPig);
    }

    @Override
    public void registerBlockIcons(IIconRegister thisdude){
        face = thisdude.registerIcon("cherrypig:cherrypig_planks");
    }

    @Override
    public IIcon getIcon(int side, int meta){ return face;}

    @Override
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_) {
        //noinspection unchecked
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
    } //nope


}
