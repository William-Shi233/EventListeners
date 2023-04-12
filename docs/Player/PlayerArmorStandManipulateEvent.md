---
description: PlayerArmorStandManipulateEvent
---

# PlayerArmorStandManipulateEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerInteractEntityEvent

                =>  org.bukkit.event.player.PlayerArmorStandManipulateEvent

### 类描述

> Called when a player interacts with an armor stand and will either swap, retrieve or place an item.
> 
> <br>
> 
> 当玩家与盔甲架交互时触发。玩家可能正尝试与盔甲架交换物品、从盔甲架取回物品或将物品堆放置到盔甲架上。

### 方法列表

#### getPlayerItem

方法声明: public ItemStack getPlayerItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Returns the item held by the player. If this Item is null and the armor stand Item is also null,
> 
> there will be no transaction between the player and the armor stand.
> 
> If the Player's item is null, but the armor stand item is not then the player will obtain the armor stand item.
> 
> In the case that the Player's item is not null, but the armor stand item is null, the players item will be placed on the armor stand.
> 
> If both items are not null, the items will be swapped.
> 
> In the case that the event is cancelled the original items will remain the same.
> 
> @return the item held by the player.
> 
> <br>
> 
> 该方法用于获取玩家曾经持有的物品堆。
> 
> 如果本方法返回值为 `null` 且盔甲架持有的物品堆也是 `null` ，则盔甲架与玩家之间不会发生物品堆转移。
> 
> 如果本方法返回值为 `null` 而盔甲架持有的物品堆不是 `null` ，则玩家会取得盔甲架原先持有的物品堆。
> 
> 如果本方法返回值不为 `null` 而盔甲架持有的物品堆是 `null` ，则玩家所持物品堆会被放置到盔甲架上。
> 
> 如果本方法返回值不为 `null` 且盔甲架持有的物品堆也不是 `null` ，则盔甲架与玩家会交换物品堆。
> 
> 如果本事件被取消，则所有物品堆全部保持原位置。
> 
> @return 玩家曾经持有的物品堆。
> 
> <br>
> 
> 译注：所谓“曾经持有”，指在发生物品堆转移以前，玩家手中的物品堆。

#### getArmorStandItem

方法声明: public ItemStack getArmorStandItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Returns the item held by the armor stand.
> 
> If this Item is null and the player's Item is also null, there will be no transaction between the player and the armor stand.
> 
> If the Player's item is null, but the armor stand item is not then the player will obtain the armor stand item.
> 
> In the case that the Player's item is not null, but the armor stand item is null, the players item will be placed on the armor stand.
> 
> If both items are not null, the items will be swapped.
> 
> In the case that the event is cancelled the original items will remain the same.
> 
> @return the item held by the armor stand.
> 
> <br>
> 
> 该方法用于获取盔甲架曾经持有的物品堆。
> 
> 如果本方法返回值为 `null` 且玩家持有的物品堆也是 `null` ，则盔甲架与玩家之间不会发生物品堆转移。
> 
> 如果本方法返回值不为 `null` 而玩家持有的物品堆是 `null` ，则玩家会取得盔甲架原先持有的物品堆。
> 
> 如果本方法返回值为 `null` 而玩家持有的物品堆不是 `null` ，则玩家所持物品堆会被放置到盔甲架上。
> 
> 如果本方法返回值不为 `null` 且玩家持有的物品堆也不是 `null` ，则盔甲架与玩家会交换物品堆。
> 
> 如果本事件被取消，则所有物品堆全部保持原位置。
> 
> @return 盔甲架曾经持有的物品堆。
> 
> <br>
> 
> 译注：所谓“曾经持有”，指在发生物品堆转移以前，盔甲架涉事槽位中的物品堆。

#### getSlot

方法声明: public EquipmentSlot getSlot()

方法签名: ()Lorg/bukkit/inventory/EquipmentSlot;

> Returns the raw item slot of the armor stand in this event.
> 
> @return the index of the item obtained or placed of the armor stand.
> 
> <br>
> 
> 该方法用于获取事件中内容有所改变的物品槽位。
> 
> @return 自盔甲架获取或放置到盔甲架上的物品堆所占的槽位。
> 
> <br>
> 
> 译注：所谓“index”和“raw item slot”，可能有歧义。此处指的是盔甲架上的槽位，用 `EquipmentSlot` 枚举表示。在物品栏相关事件中，这两种表述多用于数字槽位序号。

#### getRightClicked

方法声明: public ArmorStand getRightClicked()

方法签名: ()Lorg/bukkit/entity/ArmorStand;

> 译注：无文档。该方法用于获取事件中被右键的盔甲架。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;