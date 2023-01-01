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

#### getNote

方法声明: public Note getNote()

方法签名: ()Lorg/bukkit/Note;

> Gets the {@link Note} to be played.
>
> @return the Note

#### setInstrument

方法声明: public void setInstrument(@NotNull Instrument instrument)

方法签名: (Lorg/bukkit/Instrument;)V

> Overrides the {@link Instrument} to be used.
>
> @param instrument the Instrument. Has no effect if null.
>
> @deprecated no effect on newer Minecraft versions

#### setNote

方法声明: public void setNote(@NotNull Note note)

方法签名: (Lorg/bukkit/Note;)V

> Overrides the {@link Note} to be played.
>
> @param note the Note. Has no effect if null.
>
> @deprecated no effect on newer Minecraft versions

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;