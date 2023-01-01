---
description: PlayerEditBookEvent
---

# PlayerEditBookEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerEditBookEvent

### 类描述

> Called when a player edits or signs a book and quill item. If the event is
>
> cancelled, no changes are made to the BookMeta

### 方法列表

#### getPreviousBookMeta

方法声明: public BookMeta getPreviousBookMeta()

方法签名: ()Lorg/bukkit/inventory/meta/BookMeta;

> Gets the book meta currently on the book.
>
> <p>
>
> Note: this is a copy of the book meta. You cannot use this object to
>
> change the existing book meta.
>
> @return the book meta currently on the book

#### getNewBookMeta

方法声明: public BookMeta getNewBookMeta()

方法签名: ()Lorg/bukkit/inventory/meta/BookMeta;

> Gets the book meta that the player is attempting to add to the book.
>
> <p>
>
> Note: this is a copy of the proposed new book meta. Use {@link
>
> #setNewBookMeta(BookMeta)} to change what will actually be added to the
>
> book.
>
> @return the book meta that the player is attempting to add

#### getSlot

方法声明: public int getSlot()

方法签名: ()I

> Gets the inventory slot number for the book item that triggered this
>
> event.
>
> <p>
>
> This is a slot number on the player's hotbar in the range 0-8, or -1 for
>
> off hand.
>
> @return the inventory slot number that the book item occupies
>
> @deprecated books may be signed from off hand

#### setNewBookMeta

方法声明: public void setNewBookMeta(@NotNull BookMeta newBookMeta) throws IllegalArgumentException

方法签名: (Lorg/bukkit/inventory/meta/BookMeta;)V

> Sets the book meta that will actually be added to the book.
>
> @param newBookMeta new book meta
>
> @throws IllegalArgumentException if the new book meta is null

#### isSigning

方法声明: public boolean isSigning()

方法签名: ()Z

> Gets whether or not the book is being signed. If a book is signed the
>
> Material changes from BOOK_AND_QUILL to WRITTEN_BOOK.
>
> @return true if the book is being signed

#### setSigning

方法声明: public void setSigning(boolean signing)

方法签名: (Z)V

> Sets whether or not the book is being signed. If a book is signed the
>
> Material changes from BOOK_AND_QUILL to WRITTEN_BOOK.
>
> @param signing whether or not the book is being signed.

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V