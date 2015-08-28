package net.shadowfacts.playground;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author shadowfacts
 */
@Mod(modid = Playground.modId, name = Playground.name, version = Playground.version)
public class Playground {

	public static final String modId = "playground-base";
	public static final String name = "Playground: Base";
	public static final String version = "1.0.0";

	public static Logger log = LogManager.getLogger(modId);

	@Mod.Instance(modId)
	public static Playground instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}
