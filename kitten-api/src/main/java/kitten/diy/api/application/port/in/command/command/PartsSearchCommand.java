package kitten.diy.api.application.port.in.command.command;

import kitten.core.coredomain.item.consts.ItemType;
import kitten.core.coredomain.theme.consts.ThemeType;

public record PartsSearchCommand(

        ThemeType themeType,

        ItemType itemType
) {

    public static PartsSearchCommand of(String itemType,
                                        String themType) {
        return new PartsSearchCommand(ThemeType.valueOf(themType), ItemType.valueOf(itemType));
    }
}