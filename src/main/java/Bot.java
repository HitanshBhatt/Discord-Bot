import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Bot extends ListenerAdapter{

	public static void main(String[] args) throws LoginException {
		//Nzc5OTA1NzY5Mzg2MTQ3ODYw.X7nV2Q._BoQ-G92iblNHKclgPgnAI-xGrk
		JDA jda = new JDABuilder("Nzc5OTA1NzY5Mzg2MTQ3ODYw.X7nV2Q._BoQ-G92iblNHKclgPgnAI-xGrk")
				.addEventListeners(new Bot())
				.build();
		
		
		jda.getPresence().setStatus(OnlineStatus.ONLINE);
		//jda.getPresence().setActivity(Activity.ActivityType.);;
		PingPong PingPong = new PingPong();
		jda.addEventListener(PingPong);
		Commands commands = new Commands();
		jda.addEventListener(commands);
		/*try
		{	
			jda =  ((JDABuilder) jda).build();
		} catch (LoginException e)
		{
			e.printStackTrace();
		}
		
		/*JDABuilder jdabuilder = JDABuilder.createDefault("Nzc5OTA1NzY5Mzg2MTQ3ODYw.X7nV2Q._BoQ-G92iblNHKclgPgnAI-xGrk");
		JDA jda = null;
		jda.addEventListener(new CallBot());
		//jdabuilder.setActivity(Activity.ActivityType.WATCHING);
		
		try
		{
			jda = jdabuilder.build();
		} catch(LoginException e) {
			e.printStackTrace();
		}
		
		PingPong pingPong = new PingPong();
		jda.addEventListener(pingPong);
		try
		{	
			jda = ((JDABuilder) jda).build();
		} catch (LoginException e)
		{
			e.printStackTrace();
		}
		*/
	}

}
