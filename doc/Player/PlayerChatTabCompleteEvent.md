---
description: PlayerChatTabCompleteEvent
---

# PlayerChatTabCompleteEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerChatTabCompleteEvent

### 类描述

> Called when a player attempts to tab-complete a chat message.
>
> @deprecated This event is no longer fired due to client changes
>
> 当玩家在聊天消息中使用 `Tab` 补全时触发。
>
> @deprecated 由于客户端行为改变，该事件目前已经不会被触发了。

### 方法列表

#### getChatMessage

方法声明: public String getChatMessage()

方法签名: ()Ljava/lang/String;

> Gets the chat message being tab-completed.
>
> @return the chat message
>
> 译注：请不要使用本事件。本事件已经过时。

#### getLastToken

方法声明: public String getLastToken()

方法签名: ()Ljava/lang/String;

> Gets the last 'token' of the message being tab-completed.
>
> <p>
>
> The token is the substring starting with the character after the last
>
> space in the message.
>
> @return The last token for the chat message
>
> 译注：请不要使用本事件。本事件已经过时。

#### getTabCompletions

方法声明: public Collection<String> getTabCompletions()

方法签名: ()Ljava/util/Collection;

> This is the collection of completions for this event.
>
> @return the current completions
>
> 译注：请不要使用本事件。本事件已经过时。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;