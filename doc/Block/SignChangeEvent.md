---
description: SignChangeEvent
---

# SignChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.SignChangeEvent

### 类描述

> Called when a sign is changed by a player.
>
> <p>
>
> If a Sign Change event is cancelled, the sign will not be changed.

### 方法列表

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Gets the player changing the sign involved in this event.
>
> @return the Player involved in this event

#### getLines

方法声明: public String[] getLines()

方法签名: ()[Ljava/lang/String;

> Gets all of the lines of text from the sign involved in this event.
>
> @return the String array for the sign's lines new text

#### getLine

方法声明: public String getLine(int index) throws IndexOutOfBoundsException

方法签名: (I)Ljava/lang/String;

> Gets a single line of text from the sign involved in this event.
>
> @param index index of the line to get
>
> @return the String containing the line of text associated with the
>
> provided index
>
> @throws IndexOutOfBoundsException thrown when the provided index is {@literal > 3
>
> or < 0}

#### setLine

方法声明: public void setLine(int index, @Nullable String line) throws IndexOutOfBoundsException

方法签名: (ILjava/lang/String;)V

> Sets a single line for the sign involved in this event
>
> @param index index of the line to set
>
> @param line text to set
>
> @throws IndexOutOfBoundsException thrown when the provided index is {@literal > 3
>
> or < 0}

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;