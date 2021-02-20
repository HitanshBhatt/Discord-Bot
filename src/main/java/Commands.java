import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter{

	public void onMessageReceived(MessageReceivedEvent e)
	{
		if(e.getMessage().getContentRaw().equalsIgnoreCase("!info"))
		{
			e.getChannel().sendMessage("Hi, I'm an admin bot managed by @Hitansh Bhatt#7760").queue();
		}

		else if (e.getMessage().getContentRaw().equalsIgnoreCase("!link"))
		{
			e.getChannel().sendMessage("https://discord.gg/tBJb77F5MV").queue();
		}
	}

}
