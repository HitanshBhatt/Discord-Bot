import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class PingPong extends ListenerAdapter{

	public void onMessageReceived(MessageReceivedEvent e)
	{
		if(e.getMessage().getContentRaw().equalsIgnoreCase("!ping"))
		{
			e.getChannel().sendMessage("pong").queue();
		}
	}

}
