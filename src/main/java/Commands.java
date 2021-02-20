import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter{

	public void onMessageReceived(MessageReceivedEvent e)
	{
		if(e.getMessage().getContentRaw().equalsIgnoreCase("!info"))
		{
			e.getChannel().sendMessage("ADD UFP").queue();
		}

		else if (e.getMessage().getContentRaw().equalsIgnoreCase("!link"))
		{
			e.getChannel().sendMessage("ADD CHANNEL LINK").queue();
		}
	}

}
