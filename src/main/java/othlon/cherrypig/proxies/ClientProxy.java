package othlon.cherrypig.proxies;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import othlon.cherrypig.CPEvents;
import othlon.cherrypig.entity.CPEntityPiggy;
import othlon.cherrypig.render.*;


public class ClientProxy extends CommonProxy{

       public void registerRenderers(){
           RenderingRegistry.registerEntityRenderingHandler(CPEntityPiggy.class, new CPPiggyRender());

           MinecraftForge.EVENT_BUS.register(new CPEvents());
       }
}