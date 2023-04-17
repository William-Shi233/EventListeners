---
description: PlayerPortalEvent
---

# PlayerPortalEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerMoveEvent

                =>  org.bukkit.event.player.PlayerTeleportEvent

                    =>  org.bukkit.event.player.PlayerPortalEvent

### 类描述

> Called when a player is about to teleport because it is in contact with a
> 
> portal which will generate an exit portal.
> 
> For other entities see {@link org.bukkit.event.entity.EntityPortalEvent}
> 
> <br>
> 
> 当玩家在传送门内将要传送，且该传送门的出口处将要生成另一个传送门时触发。
> 
> 如有玩家之外的实体处于相同情况下，可使用 `EntityPortalEvent` 监听。
> 
> <br>
> 
> 译注：所谓“生成另一个传送门”，字面意思指玩家在主世界进入下界且下界的对应位置没有传送门，反之亦然。但是本事件实际上并非是在生成新传送门时触发的。每次玩家通过下界传送门、末地传送门，都会触发本事件。触发时，不一定在出口生成一座新传送门，也可能使用已有的传送门。

### 方法列表

#### setSearchRadius

方法声明: public void setSearchRadius(int searchRadius)

方法签名: (I)V

> Set the Block radius to search in for available portals.
> 
> @param searchRadius the radius in which to search for a portal from the
> 
> location
> 
> <br>
> 
> 该方法用于设置搜寻可用传送门时扫描的半径。
> 
> @param searchRadius 搜寻可用传送门时扫描的半径。
> 
> <br>
> 
> 译注：对末地传送门而言，参见 `Minecraft Wiki` 中的相关页面 [https://minecraft.fandom.com/wiki/End_portal#Behavior](https://minecraft.fandom.com/wiki/End_portal#Behavior) 可知，末地黑曜石平台位置是固定的，中心点坐标永远是 (100, 48, 0) 。无论从哪个末地传送门进入末地，玩家都会以面朝西方的姿态出现在较此中心点高一格的位置，即 (100,49,0) 。因此不需要对传送门坐标进行“搜寻”。
> 
> 对下界传送门而言，参见 `Minecraft Wiki` 中的相关页面 [https://minecraft.fandom.com/wiki/Nether_portal#Portal_search](https://minecraft.fandom.com/wiki/Nether_portal#Portal_search) 可知，玩家踏入下界传送门以后，，会将玩家 `x` 和 `z` 轴坐标除以八，然后以此为中心搜寻一定半径内已有的传送门，如有，则将玩家传送到那里。如没有，则另取位置新建传送门。本方法即用于设置搜寻的半径。

#### getSearchRadius

方法声明: public int getSearchRadius()

方法签名: ()I

> Gets the search radius value for finding an available portal.
> 
> @return the currently set search radius
> 
> <br>
> 
> 该方法用于获取搜寻可用传送门时扫描的半径。
> 
> @return 搜寻可用传送门时扫描的半径。
> 
> <br>
> 
> 译注：对末地传送门而言，参见 `Minecraft Wiki` 中的相关页面 [https://minecraft.fandom.com/wiki/End_portal#Behavior](https://minecraft.fandom.com/wiki/End_portal#Behavior) 可知，末地黑曜石平台位置是固定的，中心点坐标永远是 (100, 48, 0) 。无论从哪个末地传送门进入末地，玩家都会以面朝西方的姿态出现在较此中心点高一格的位置，即 (100,49,0) 。因此不需要对传送门坐标进行“搜寻”。
> 
> 对下界传送门而言，参见 `Minecraft Wiki` 中的相关页面 [https://minecraft.fandom.com/wiki/Nether_portal#Portal_search](https://minecraft.fandom.com/wiki/Nether_portal#Portal_search) 可知，玩家踏入下界传送门以后，会将玩家 `x` 和 `z` 轴坐标除以八，然后以此为中心搜寻一定半径内已有的传送门，如有，则将玩家传送到那里。如没有，则另取位置新建传送门。本方法即用于获取搜寻的半径。

#### getCanCreatePortal

方法声明: public boolean getCanCreatePortal()

方法签名: ()Z

> Returns whether the server will attempt to create a destination portal or
> 
> not.
> 
> @return whether there should create be a destination portal created
> 
> <br>
> 
> 该方法用于获取服务器会否尝试在出口处新建一个传送门。
> 
> @return 服务器会否尝试在出口处新建一个传送门。
> 
> <br>
> 
> 译注：除非有插件开发者调用本事件 `setCanCreatePortal` 方法修改，否则本方法一定会返回 `true` 。即使已经搜寻到了旧有的下界传送门、即使是传送到末地的黑曜石平台，也返回 `true` 。

#### setCanCreatePortal

方法声明: public void setCanCreatePortal(boolean canCreatePortal)

方法签名: (Z)V

> Sets whether the server should attempt to create a destination portal or
> 
> not.
> 
> @param canCreatePortal Sets whether there should be a destination portal
> 
> created
> 
> <br>
> 
> 该方法用于设置服务器会否尝试在出口处新建一个传送门。
> 
> @param canCreatePortal 服务器会否尝试在出口处新建一个传送门。

#### setCreationRadius

方法声明: public void setCreationRadius(int creationRadius)

方法签名: (I)V

> Sets the maximum radius the world is searched for a free space from the
> 
> given location.
> 
> If enough free space is found then the portal will be created there, if
> 
> not it will force create with air-space at the target location.
> 
> Does not apply to end portal target platforms which will always appear at
> 
> the target location.
> 
> @param creationRadius the radius in which to create a portal from the
> 
> location
> 
> <br>
> 
> 该方法用于设置尝试创建新传送门时扫描的半径。
> 
> 如果半径内可以找到一个符合条件的空间，那么就会生成传送门。如果不能找到，那么就将搜寻起点周围清空，创造出一片符合条件的空间，再生成传送门。
> 
> 这一流程对末地黑曜石平台不适用。该平台永远生成在同一位置。
> 
> @param creationRadius 尝试创建新传送门时扫描的半径。
> 
> <br>
> 
> 译注：对末地传送门而言，参见 `Minecraft Wiki` 中的相关页面 [https://minecraft.fandom.com/wiki/End_portal#Behavior](https://minecraft.fandom.com/wiki/End_portal#Behavior) 可知，末地黑曜石平台位置是固定的，中心点坐标永远是 (100, 48, 0) 。无论从哪个末地传送门进入末地，玩家都会以面朝西方的姿态出现在较此中心点高一格的位置，即 (100,49,0) 。因此不需要寻找用于创建传送门的空间。
> 
> 对下界传送门而言，参见 `Minecraft Wiki` 中的相关页面 [https://minecraft.fandom.com/wiki/Nether_portal#Portal_search](https://minecraft.fandom.com/wiki/Nether_portal#Portal_search) 可知，玩家踏入下界传送门以后，会将玩家 `x` 和 `z` 轴坐标除以八，然后以此为中心搜寻一定半径内已有的传送门，如有，则将玩家传送到那里。如没有，则另取位置新建传送门。新建传送门的位置必须满足一定条件，见于 [https://minecraft.fandom.com/wiki/Nether_portal#Portal_creation](https://minecraft.fandom.com/wiki/Nether_portal#Portal_creation) 页面。本方法即用于设置搜寻“传送门创建空间”（ `3x4x4` 空气和 `3x1x4` 固体方块地面）的半径，默认为 `16` 。在搜寻时，`Y` 轴坐标不论。即只要某片空间与中心点在 `xOz` 平面上投影的距离在半径内，则创建新传送门。

#### getCreationRadius

方法声明: public int getCreationRadius()

方法签名: ()I

> Gets the maximum radius the world is searched for a free space from the
> 
> given location.
> 
> If enough free space is found then the portal will be created there, if
> 
> not it will force create with air-space at the target location.
> 
> Does not apply to end portal target platforms which will always appear at
> 
> the target location.
> 
> @return the currently set creation radius
> 
> <br>
> 
> 该方法用于获取尝试创建新传送门时扫描的半径。
> 
> 如果半径内可以找到一个符合条件的空间，那么就会生成传送门。如果不能找到，那么就将搜寻起点周围清空，创造出一片符合条件的空间，再生成传送门。
> 
> 这一流程对末地黑曜石平台不适用。该平台永远生成在同一位置。
> 
> @return 尝试创建新传送门时扫描的半径。
> 
> <br>
> 
> 译注：对末地传送门而言，参见 `Minecraft Wiki` 中的相关页面 [https://minecraft.fandom.com/wiki/End_portal#Behavior](https://minecraft.fandom.com/wiki/End_portal#Behavior) 可知，末地黑曜石平台位置是固定的，中心点坐标永远是 (100, 48, 0) 。无论从哪个末地传送门进入末地，玩家都会以面朝西方的姿态出现在较此中心点高一格的位置，即 (100,49,0) 。因此不需要寻找用于创建传送门的空间。
> 
> 对下界传送门而言，参见 `Minecraft Wiki` 中的相关页面 [https://minecraft.fandom.com/wiki/Nether_portal#Portal_search](https://minecraft.fandom.com/wiki/Nether_portal#Portal_search) 可知，玩家踏入下界传送门以后，会将玩家 `x` 和 `z` 轴坐标除以八，然后以此为中心搜寻一定半径内已有的传送门，如有，则将玩家传送到那里。如没有，则另取位置新建传送门。新建传送门的位置必须满足一定条件，见于 [https://minecraft.fandom.com/wiki/Nether_portal#Portal_creation](https://minecraft.fandom.com/wiki/Nether_portal#Portal_creation) 页面。本方法即用于获取搜寻“传送门创建空间”（ `3x4x4` 空气和 `3x1x4` 固体方块地面）的半径，默认为 `16` 。在搜寻时，`Y` 轴坐标不论。即只要某片空间与中心点在 `xOz` 平面上投影的距离在半径内，则创建新传送门。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;
