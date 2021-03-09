import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

public class PurpleBot extends JavaPlugin{

    public static String botToken;

    private static boolean configCreated = false;

    private static JavaPlugin thisPlugin;
    private static Server thisServer;


    @Override
    public void onEnable(){
        thisPlugin = this;
        thisServer = thisPlugin.getServer();



    }

    @Override
    public void onDisable() {
        
    }
}
