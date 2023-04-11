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
> If a Sign Change event is cancelled, the sign will not be changed.
>
> 当玩家修改告示牌上的文字时触发。
>
> 如果本事件被取消，则告示牌上的内容将不会发生变化。

### 方法列表

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Gets the player changing the sign involved in this event.
>
> @return the Player involved in this event
>
> 该方法用于获取事件中修改告示牌内容的玩家。
>
> @return 事件中修改告示牌内容的玩家。

#### getLines

方法声明: public String[] getLines()

方法签名: ()[Ljava/lang/String;

> Gets all of the lines of text from the sign involved in this event.
>
> @return the String array for the sign's lines new text
>
> 该方法用于获取涉事告示牌的全部文本行。
>
> @return 涉事告示牌的全部文本行，以字符串数组表示。文本为修改后的结果。
>
> 译注：所谓“文本行”，指将告示牌的全部内容以行为单位进行分割，数组中的元素依次为第一至四行内容字符串。

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
>
> 该方法用于获取涉事告示牌上某一行的内容字符串。
>
> @param index 要获取的行的序号。
>
> @return 该指定行的内容字符串。
>
> @throws 如果传入的参数大于三或小于零，则抛出 `IndexOutOfBoundsException` 。

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
>
> 该方法用于设置涉事告示牌上某一行的内容字符串。
>
> @param index 要设置的行的序号。
>
> @param line 要设置的内容字符串。
>
> @throws 如果传入的参数大于三或小于零，则抛出 `IndexOutOfBoundsException` 。

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