
package padanianbot;

import java.io.File;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class Photos extends ListenerAdapter {
    
    
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
    
    String args = event.getMessage().getContentRaw();    
    
    if(args.contains("hello")){
        File file = new File("C:\\Users\\spiro\\Desktop\\Coding\\Project Padanian\\gm.jpg");
        EmbedBuilder hello = new EmbedBuilder();
        hello.setTitle("Hello indeed");
        hello.setDescription("GOOD MORNING VIETNAM");
        hello.setColor(0x0349fc);
        hello.setImage("attachment://hello.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(hello.build()).addFile(file,"hello.jpg").queue();
        hello.clear();
    }else if (args.contains("spiro")){
        File file = new File("C:\\Users\\spiro\\Desktop\\Coding\\Project Padanian\\spiros.jpg");
        EmbedBuilder spiros = new EmbedBuilder();
        spiros.setTitle("My beloved creator , the master of the world , king of metal and the best thing that has happend to this earth , Spiros");
        spiros.setDescription("Isnt he great ?");
        spiros.setColor(0x611351);
        spiros.setImage("attachment://spiros.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(spiros.build()).addFile(file,"spiros.jpg").queue();
        spiros.clear();
    }else if (args.contains("efsta")){
        File file = new File("C:\\Users\\spiro\\Desktop\\Coding\\Project Padanian\\efsta.jpg");
        EmbedBuilder efsta = new EmbedBuilder();
        efsta.setTitle("Ta 735 fernoun korona stin ellada");
        efsta.setDescription("KKE DINATO STI VOULI KAI STO PADA");
        efsta.setColor(0xff0015);
        efsta.setImage("attachment://efsta.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(efsta.build()).addFile(file,"efsta.jpg").queue();
        efsta.clear();    
    }else if (args.contains("vogia") || args.contains("proedra")){
        File file = new File("C:\\Users\\spiro\\Desktop\\Coding\\Project Padanian\\vogia.png");
        EmbedBuilder vogia = new EmbedBuilder();
        vogia.setTitle("H zwi sto pada");
        vogia.setDescription("Pame gia tsipoura ?");
        vogia.setColor(0xeb5910);
        vogia.setImage("attachment://vogia.png");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(vogia.build()).addFile(file,"vogia.png").queue();
        vogia.clear();    
        
    }else if (args.contains("sofia") || args.contains("annoula") ){
        File file = new File("C:\\Users\\spiro\\Desktop\\Coding\\Project Padanian\\sofias.jpg");
        EmbedBuilder sofias = new EmbedBuilder();
        sofias.setTitle("Annoula");
        sofias.setDescription("Ola quala?");
        sofias.setColor(0xff3b9d);
        sofias.setImage("attachment://sofias.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(sofias.build()).addFile(file,"sofias.jpg").queue();
        sofias.clear();    
            
    }else if ( args.contains("thimio") ){
        File file = new File("C:\\Users\\spiro\\Desktop\\Coding\\Project Padanian\\thimios.jpg");
        EmbedBuilder thimios = new EmbedBuilder();
        thimios.setTitle("Hello little boy");
        thimios.setDescription("How old are you ?");
        thimios.setColor(0xd1000a);
        thimios.setImage("attachment://thimios.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(thimios.build()).addFile(file,"thimios.jpg").queue();
        thimios.clear();    
        
        
    }else if (args.contains("menio")){
        File file = new File("C:\\Users\\spiro\\Desktop\\Coding\\Project Padanian\\menios.jpg");
        EmbedBuilder emb = new EmbedBuilder();
        emb.setTitle("Sqilarapas");
        emb.setDescription("MY HAT IS AWESOME OK ? ");
        emb.setColor(0x140f0f);
        emb.setImage("attachment://menios.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(emb.build()).addFile(file,"menios.jpg").queue();
        emb.clear(); 
        
    }else if (args.contains("krani")){
        File file = new File("C:\\Users\\spiro\\Desktop\\Coding\\Project Padanian\\kranis.jpg");
        EmbedBuilder emb = new EmbedBuilder();
        emb.setTitle("Long Live Our Lord Cthulhu");
        emb.setDescription("Yes , im a simp for octopusies !");
        emb.setColor(0x3b0016);
        emb.setImage("attachment://kranis.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(emb.build()).addFile(file,"kranis.jpg").queue();
        emb.clear(); 
    }else if (args.contains("panagioti")){
        File file = new File("C:\\Users\\spiro\\Desktop\\Coding\\Project Padanian\\panos.jpg");
        EmbedBuilder emb = new EmbedBuilder();
        emb.setTitle("Did i just see a dog ?");
        emb.setDescription("COME HERE MY SWEET DOG , IM NOT GONNA HURT YOU");
        emb.setColor(0x000000);
        emb.setImage("attachment://panos.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(emb.build()).addFile(file,"panos.jpg").queue();
        emb.clear(); 
    }else if (args.contains("spiropal")||args.contains("panagiot")){
        File file = new File("C:\\Users\\spiro\\Desktop\\Coding\\Project Padanian\\spiropal.jpg");
        EmbedBuilder emb = new EmbedBuilder();
        emb.setTitle("Eimai enas gavros kai misos");
        emb.setDescription("ELA ELA MALAKA , SIGOURA XAKAREI AFTOS");
        emb.setColor(0x004d42);
        emb.setImage("attachment://spiropal.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(emb.build()).addFile(file,"spiropal.jpg").queue();
        emb.clear();
        
    }else if (args.contains("panoo")){
        File file = new File("C:\\Users\\spiro\\Desktop\\Coding\\Project Padanian\\panos2.jpg");
        EmbedBuilder emb = new EmbedBuilder();
        emb.setTitle("PANOOOOOOOOO");
        emb.setDescription("SE FONAZOYME REEEEE");
        emb.setColor(0x000000);
        emb.setImage("attachment://panos2.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(emb.build()).addFile(file,"panos2.jpg").queue();
        emb.clear(); 
        
    }else if (args.contains("padanian")){
        File file = new File("C:\\Users\\spiro\\Desktop\\Coding\\Project Padanian\\padanian2.jpg");
        EmbedBuilder emb = new EmbedBuilder();
        emb.setTitle("Me fonakse kaneis?");
        emb.setDescription("nai?");
        emb.setColor(0x001a45);
        emb.setImage("attachment://padanian2.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(emb.build()).addFile(file,"padanian2.jpg").queue();
        emb.clear();
        
        
    }else if (args.contains("skourla")||args.contains("sgouropoulou")){
        File file = new File("C:\\Users\\spiro\\Desktop\\Coding\\Project Padanian\\skourlas.jpg");
        EmbedBuilder emb = new EmbedBuilder();
        emb.setTitle("ASMR TIME");
        emb.setDescription("Kalosirthate stis vaseis dedomenwn");
        emb.setColor(0x30096b);
        emb.setImage("attachment://skourlas.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(emb.build()).addFile(file,"skourlas.jpg").queue();
        emb.clear();
        
    }else if (args.contains("karolidi")||args.contains("kavloridi")){
        File file = new File("C:\\Users\\spiro\\Desktop\\Coding\\Project Padanian\\karolidis.jpg");
        EmbedBuilder emb = new EmbedBuilder();
        emb.setTitle("The best prof at uniwa city");
        emb.setDescription("Apla tha to valeis sto teimpol kai ola komple");
        emb.setColor(0xff21de);
        emb.setImage("attachment://karolidis.jpg");
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(emb.build()).addFile(file,"karolidis.jpg").queue();
        emb.clear();    
    
    }
   } 
    
}
