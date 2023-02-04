package padanianbot;

import javax.security.auth.login.LoginException;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;


public class PadanianBot {
    public static JDA jda ;
    public static String prefix = "pdn";


public static void main(String[] args) throws LoginException {
        
       JDABuilder jdabuilder = JDABuilder.createDefault("ODY1NTM1MDQxNzM1NzUzNzM4.YPFaUg.FZoIcXFaFUBg7qLF_lpJlIgK2Zc");
       jda = jdabuilder.build();
       jda.getPresence().setStatus(OnlineStatus.ONLINE);
       jda.addEventListener(new Embeds());
    }
}
