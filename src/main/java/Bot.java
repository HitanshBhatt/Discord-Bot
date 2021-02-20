import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Bot extends ListenerAdapter{

	public static void main(String[] args) throws LoginException {
		
		JDA jda = new JDABuilder("ADD TOKEN HERE!")
				.addEventListeners(new Bot())
				.build();
		
		
		jda.getPresence().setStatus(OnlineStatus.ONLINE);
		//jda.getPresence().setActivity(Activity.ActivityType.);;
		PingPong PingPong = new PingPong();
		jda.addEventListener(PingPong);
		Commands commands = new Commands();
		jda.addEventListener(commands);
		
	}

}
