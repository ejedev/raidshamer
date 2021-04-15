package ejedev.raidshamer;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;


@ConfigGroup("raidshamer")
public interface RaidShamerConfig extends Config
{

    @ConfigItem(
        keyName = "captureOwnDeaths",
        name = "Own Deaths Captured",
        description = "Allows you to toggle on/off own death shaming",
        position = 1
    )
    default boolean captureOwnDeaths()
    {
        return true;
    }

    @ConfigItem(
        keyName = "activeInCoX",
        name = "Active in Chambers of Xeric (CoX)",
        description = "Allows for shaming in CoX",
        position = 2
    )
    default boolean activeInCoX()
    {
        return true;
    }

    @ConfigItem(
            keyName = "webhookEnabled",
            name = "Discord Webhook",
            description = "Allows you to send death photos automatically to a discord webhook. Read the github page for info.",
            position = 3
    )
    default boolean webhookEnabled()
    {
        return false;
    }

    @ConfigItem(
            keyName = "webhookLink",
            name = "Webhook URL",
            description = "Put your webhook link here, the full thing copied from discord.",
            position = 4
    )
    default String webhookLink()
    {
        return "";
    }
}

