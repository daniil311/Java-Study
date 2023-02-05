public class House {

    private Room roomOne;
    private Room roomTwo;
    private Room roomThree;

    public House(Room room1, Room room2, Room room3){
        roomOne = room1;
        roomTwo = room2;
        roomThree = room3;

    }
    public int getAreaHouse(){
        return roomOne.getArea() + roomTwo.getArea() + roomThree.getArea();
    }
    public Room getRoomOne(){
        return roomOne;
    }
    public Room getRoomTwo(){
        return roomTwo;
    }
    public Room getRoomThree(){
        return roomThree;
    }
    public Item[] getItemAllRooms(){
        Item[] itemsRoomOne = roomOne.getItemsRoom();
        Item[] itemsRoomTwo = roomTwo.getItemsRoom();
        Item[] itemsRoomThree = roomThree.getItemsRoom();

        Item[] allItems = new Item[itemsRoomOne.length + itemsRoomTwo.length + itemsRoomThree.length];
        int index = 0;

        for (Item item: itemsRoomOne) {
            allItems[index] = item;
            index++;
        }

        for (Item item: itemsRoomTwo) {
            allItems[index] = item;
            index++;
        }

        for (Item item: itemsRoomThree) {
            allItems[index] = item;
            index++;
        }
        return allItems;
    }
    public Item[] getAllItemsRoom(){
        Item[] itemsRoom1 = roomOne.getItemsRoom();
        Item[] itemsRoom2 = roomTwo.getItemsRoom();
        Item[] itemsRoom3 = roomThree.getItemsRoom();

        Item[] allItemsRoom = new Item[itemsRoom1.length + itemsRoom2.length + itemsRoom3.length];

        int index = 0;

        for (Item items : itemsRoom1){
            allItemsRoom[index] = items;
            index++;
        }
        for (Item items : itemsRoom2){
            allItemsRoom[index] = items;
            index++;
        }
        for (Item items : itemsRoom3){
            allItemsRoom[index] = items;
            index++;
        }
        return allItemsRoom;
    }
    public int getItemsCount(){
        return getAllItemsRoom().length;
    }





/*
    public String toString(){
        return Integer.toString(roomOne.area);
    }

 */


}
