package padanianbot;

import java.io.File;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;



public class Embeds extends ListenerAdapter {
       public void onGuildMessageReceived(GuildMessageReceivedEvent event){
    
    String args = event.getMessage().getContentRaw();    
    
    if(args.contains("hello")){
    
        File file = new File("images\\\\gm.jpg");
        EmbedBuilder hello = new EmbedBuilder();
        hello.setTitle("Hello indeed");
        hello.setDescription("GOOD MORNING VIETNAM");
        hello.setColor(0x0349fc);
        hello.setImage("attachment://hello.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(hello.build()).addFile(file,"hello.jpg").queue();
        hello.clear();
    }else if (args.contains("efsta")){
        
        File file = new File("images\\\\efsta.jpg");
        EmbedBuilder efsta = new EmbedBuilder();
        efsta.setTitle("Τα 735 φέρνουν κοροναϊό στην Ελλάδα");
        efsta.setDescription("KKE Δυνατό στη βουλή και στο ΠΑΔΑ");
        efsta.setColor(0xff0015);
        efsta.setImage("attachment://efsta.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(efsta.build()).addFile(file,"efsta.jpg").queue();
        efsta.clear();    
    
    }else if (args.contains("vogia") || args.contains("Vogia")){
        File file = new File("images\\\\vogia.png");
        EmbedBuilder vogia = new EmbedBuilder();
        vogia.setTitle("Η ζωή στο ΠΑΔΑ");
        vogia.setDescription("Περνάτε φανταστικά;");
        vogia.setColor(0xeb5910);
        vogia.setImage("attachment://vogia.png");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(vogia.build()).addFile(file,"vogia.png").queue();
        vogia.clear();    
        
    }else if (args.contains("padanian")){
        File file = new File("images\\\\padanian2.jpg");
        EmbedBuilder emb = new EmbedBuilder();
        emb.setTitle("Με φώναξε κανείς;");
        emb.setDescription("Ναι;");
        emb.setColor(0x001a45);
        emb.setImage("attachment://padanian2.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(emb.build()).addFile(file,"padanian2.jpg").queue();
        emb.clear();
        
        
    }else if (args.contains("Skour")||args.contains("skour")){
        File file = new File("images\\\\skourlas.jpg");
        EmbedBuilder emb = new EmbedBuilder();
        emb.setTitle("ASMR TIME");
        emb.setDescription("Καλωσορίσατε στις βάσεις δεδομένων");
        emb.setColor(0x30096b);
        emb.setImage("attachment://skourlas.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(emb.build()).addFile(file,"skourlas.jpg").queue();
        emb.clear();
        
    }else if (args.contains("karoli")||args.contains("Karoli")){
        File file = new File("images\\\\karolidis.jpg");
        EmbedBuilder emb = new EmbedBuilder();
        emb.setTitle("The best prof at uniwa city");
        emb.setDescription("Αν το φορτώσεις σε ένα τέιμπολ θα είσαι ποπα μαν μου");
        emb.setColor(0xff21de);
        emb.setImage("attachment://karolidis.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(emb.build()).addFile(file,"karolidis.jpg").queue();
        emb.clear();    
    
    }else if (args.contains("thimi")||args.contains("Thimi")){
        File file = new File("images\\\\thimios.jpg");
        EmbedBuilder emb = new EmbedBuilder();
        emb.setTitle("Hello little boy");
        emb.setDescription("How old are you ?");
        emb.setColor(0xff1900);
        emb.setImage("attachment://thimios.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(emb.build()).addFile(file,"thimios.jpg").queue();
        emb.clear();    
    
    }else if (args.contains("meni")||args.contains("Meni")){
        File file = new File("images\\\\menios.jpg");
        EmbedBuilder emb = new EmbedBuilder();
        emb.setTitle("Squilarapas");
        emb.setDescription("The black guy with some rights");
        emb.setColor(0xa8a432);
        emb.setImage("attachment://menios.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(emb.build()).addFile(file,"menios.jpg").queue();
        emb.clear();    
    
    }else if (args.contains("iorgos")||args.contains("kranis")){
        File file = new File("images\\\\kranis.jpg");
        EmbedBuilder emb = new EmbedBuilder();
        emb.setTitle("The dark lord cthulhu");
        emb.setDescription("Ya ready to get spanked?!?");
        emb.setColor(0xff1900);
        emb.setImage("attachment://kranis.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(emb.build()).addFile(file,"kranis.jpg").queue();
        emb.clear();    
        
    }else if (args.contains("spiropa")||args.contains("pegging")){
        File file = new File("images\\\\spiropal.jpg");
        EmbedBuilder emb = new EmbedBuilder();
        emb.setTitle("Gate 7 και τα μυαλά στα κάγκελα");
        emb.setDescription("Τον παίρνω απο πίσω");
        emb.setColor(0xfccce4);
        emb.setImage("attachment://spiropal.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(emb.build()).addFile(file,"spiropal.jpg").queue();
        emb.clear();    
    
    }else if (args.contains("annoula")||args.contains("sofias")){
        File file = new File("images\\\\sofias.jpg");
        EmbedBuilder emb = new EmbedBuilder();
        emb.setTitle("The blackest of them all");
        emb.setDescription("Έλα, πάψε");
        emb.setColor(0xf54ea2);
        emb.setImage("attachment://sofias.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(emb.build()).addFile(file,"sofias.jpg").queue();
        emb.clear();    
    
    }else if (args.contains("panos")||args.contains("panagiotis")||args.contains("molest")){
        File file = new File("images\\\\panos.jpg");
        EmbedBuilder emb = new EmbedBuilder();
        emb.setTitle("The Sorry One");
        emb.setDescription("YOUR MOM IS DEAD AND YOUR DOG IS MOLESTED");
        emb.setColor(0xff8f2e);
        emb.setImage("attachment://panos.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(emb.build()).addFile(file,"panos.jpg").queue();
        emb.clear();    
    
    }else if (args.contains("panoo")||args.contains("Panoo")){
        File file = new File("images\\\\panos2.jpg");
        EmbedBuilder emb = new EmbedBuilder();
        emb.setTitle("ΠΑΝΟΟΟΟΟΟΟ");
        emb.setDescription("ΠΟΥ ΕΙΣΑΙ ΡΕΕΕΕΕ");
        emb.setColor(0x4a2828);
        emb.setImage("attachment://panos2.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(emb.build()).addFile(file,"panos2.jpg").queue();
        emb.clear();    
    
    }else if (args.contains("spiros")||args.contains("Spiros")){
        File file = new File("images\\\\spiros.jpg");
        EmbedBuilder emb = new EmbedBuilder();
        emb.setTitle("The one and only");
        emb.setDescription("The hottest trash can there is");
        emb.setColor(0x080630);
        emb.setImage("attachment://spiros.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(emb.build()).addFile(file,"spiros.jpg").queue();
        emb.clear();    
    
    }
    
  }
    
}
