---
description: NotePlayEvent
---

# NotePlayEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.NotePlayEvent

### 类描述

> Called when a note block is being played through player interaction or a
>
> redstone current.
>
> 当音符盒方块由于玩家交互或收到红石信号而被奏响时触发。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getInstrument

方法声明: public Instrument getInstrument()

方法签名: ()Lorg/bukkit/Instrument;

> Gets the {@link Instrument} to be used.
>
> @return the Instrument
>
> 该方法用于获取将要发出何种乐器的声音。
>
> @return 将要发出何种乐器的声音。
>
> 译注：参见 `MineCraft Wiki` 的相关页面 [https://minecraft.fandom.com/wiki/Note_Block#Instruments](https://minecraft.fandom.com/wiki/Note_Block#Instruments) 可知，音符盒所发出的声音音色随其下方方块的材质而变化，比如当音符盒下方为羊毛时，与之交互会发出吉他声。

#### getNote

方法声明: public Note getNote()

方法签名: ()Lorg/bukkit/Note;

> Gets the {@link Note} to be played.
>
> @return the Note
>
> 该方法用于获取将要演奏的音符。
>
> @return 将要演奏的音符。

#### setInstrument

方法声明: public void setInstrument(@NotNull Instrument instrument)

方法签名: (Lorg/bukkit/Instrument;)V

> Overrides the {@link Instrument} to be used.
>
> @param instrument the Instrument. Has no effect if null.
>
> @deprecated no effect on newer Minecraft versions
>
> @deprecated 该方法已过时。在较新版本的 `MineCraft` 中此方法无效。

#### setNote

方法声明: public void setNote(@NotNull Note note)

方法签名: (Lorg/bukkit/Note;)V

> Overrides the {@link Note} to be played.
>
> @param note the Note. Has no effect if null.
>
> @deprecated no effect on newer Minecraft versions
>
> @deprecated 该方法已过时。在较新版本的 `MineCraft` 中此方法无效。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;